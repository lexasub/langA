package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

import org.antlr.v4.runtime.tree.TerminalNode;

public class NamespaceTree {
    private NamespaceTree parent = null;
    public NamespaceTree findChild(String name) {
    }

    public NamespaceTree parent() {
        return parent;
    }
    public void parent(NamespaceTree p) {
        parent = p;
    }
    public StructureGenerator addStructure(String name) {

        StructureGenerator sg = new StructureGenerator(this);

        return sg;
    }

    public NamespaceTree addChild(String text) {
        NamespaceTree np = new NamespaceTree();
        addChild(np);
        return np;
    }
    public void addChild(NamespaceTree np) {
        //childs.add(np)
        np.parent(this);
    }
}
