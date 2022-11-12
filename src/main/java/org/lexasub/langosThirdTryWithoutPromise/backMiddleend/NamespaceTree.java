package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class NamespaceTree {
    private String name;

    private HashMap replace_vars = new HashMap();
    private HashMap<String, String> declares = new HashMap<>();
    HashMap<String, String> needVars = new HashMap<>();
    private NamespaceTree parent = null;
    private LinkedList<NamespaceTree> childs = new LinkedList<>();
    public NamespaceTree findChild(String name) {
        return childs.stream().filter(i->name == name).findFirst().get();
    }
    public int findChildNum(String name) {
        Iterator<NamespaceTree> it = childs.iterator();
        int i = 0;
        for (; it.hasNext() && it.next().name != name; i++) {}
        return i;
    }

    public NamespaceTree parent() {
        return parent;
    }
    public void parent(NamespaceTree p) {
        parent = p;
    }
    public StructureGenerator addStructure(String name) {

        StructureGenerator sg = new StructureGenerator(name, this);

        return sg;
    }

    public NamespaceTree addChild(String text) {
        NamespaceTree np = new NamespaceTree();
        np.name = text;
        addChild(np);
        return np;
    }
    public void addChild(NamespaceTree np) {
        childs.add(np);
        np.parent(this);
    }

    public String findLeaf(TerminalNode id) {
        //...findChild(id.getText());
        return id.getText();
    }

    public void addDeclare(String type, String name) {
        declares.put(name, type);
    }

    public String getSSAReg(String arg) {
        //if(variable is arg of func or was assigned- then good, else push to neededVars
        if(declares.containsKey(arg)) return replace_vars.containsKey(arg)? (String) replace_vars.get(arg) :arg;//all is ok
        if(needVars.containsKey(arg)) return arg;//if variable in needVars, then replace_vars.containsKey(arg) == false
        needVars.put(arg, "i32");//if variable is not declared, then replace_vars.containsKey(arg) == false
        return arg;
    }

    public String mayBeRenameReg(String reg) {
        if(!declares.containsKey(reg) && !needVars.containsKey(reg)) {
            declares.put(reg, "i32");
            return reg;
        }
        else {
            int i = 0;
            while (declares.containsKey(reg + "_" + i)) ++i;
            String val = reg + "_" + i;
            declares.put(val, "i32");//declare my_var_0
            replace_vars.put(reg, val);//create replace
            return val;
        }
    }

    public String getDeclares(String decl) {
        return declares.get(decl);
    }
}
