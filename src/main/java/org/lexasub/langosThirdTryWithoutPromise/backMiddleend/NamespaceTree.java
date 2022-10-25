package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;

public class NamespaceTree {
    private String name;
    private NamespaceTree parent = null;
    private LinkedList<NamespaceTree> childs = new LinkedList<>();
    public NamespaceTree findChild(String name) {
        return childs.stream().filter(i->name == name).findFirst().get();
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
}
