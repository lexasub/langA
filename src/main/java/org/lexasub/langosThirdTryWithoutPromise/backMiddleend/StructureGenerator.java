package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

public class StructureGenerator {
    private NamespaceTree nm = new NamespaceTree();
    StructureGenerator (NamespaceTree p){
        p.addChild(nm);
    }
    public NamespaceTree nm() {
        return nm;
    }
    public StructureGenerator addMethod(String name) {

        return this;
    }
}
