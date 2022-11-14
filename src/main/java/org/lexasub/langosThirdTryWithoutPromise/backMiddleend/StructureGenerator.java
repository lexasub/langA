package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.PairString;

import java.util.Vector;

public class StructureGenerator {
    public String name;
    Vector<PairString> container;//for methods and members
    private NamespaceTree nm = new NamespaceTree();

    StructureGenerator(String name, NamespaceTree p) {
        p.addChild(nm);
        this.name = name;
    }

    public NamespaceTree nm() {
        return nm;
    }

    public String addMethod(String name) {


      /*  LLVMAsm.LBL(this.name + "_" + i);
        LLVMAsm.CALL("FUNCTION_" + i);
        LLVMAsm.RET();*/

        return "";
    }

    public String addMemberToTable(String type, String name) {
        container.add(new PairString(name, type));
        nm.addDeclare(type, name);
        return type;
    }

    public String addDeclareMethod(String i) {
        container.add(new PairString(i, LLVMAsm.typePtr));
        nm.addDeclare(LLVMAsm.typePtr, i);
        //hmm..
        return LLVMAsm.typePtr;
    }
}
