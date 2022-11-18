package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.PairString;

import java.util.*;

public class PHIScope {
    HashMap<String, PairString> phiS = new HashMap<>();
    HashMap<String, PairString> phiLbls = new HashMap<>();
    LinkedList<PHIScope> childs = new LinkedList<>();
    String cur = "";
    private PHIScope parent = null;

    public String getCurScope() {
        return cur;
    }

    public String getParentScope() {
        return parent.getCurScope();
    }

    public void enter(String enterLbl) {
        PHIScope p = new PHIScope();
        p.parent = parent;
        p.cur = cur;
        cur = enterLbl;
        parent = p;
    }

    public void exit(String enterLbl) {
        //if enterLbl != cur->it's bad
        PHIScope p = parent;
        //cur = p.getCurScope();
        parent = p.parent;
        p.parent = this;
        childs.add(p);
    }

    public void addPhi(String phiRes, String phi1, String phi0) {
        phiS.put(phiRes, new PairString(phi0, phi1));
        phiLbls.put(phiRes, new PairString(getParentScope(), getCurScope()));
        //(phi0, phi1) -> phiRes
        //findPhi-> search phi0,phi1 -> phiRes - > may be return a=phi(..)
    }

    public PairString getPhi(String arg, NamespaceTree globalTree) {//сейчас вызывается при return, может стоит вызывать после if, while ??
        Optional<Map.Entry<String, PairString>> p = phiS.entrySet().stream().filter(i -> Objects.equals(i.getValue().a, arg)).findFirst();
        if (p.isEmpty()) {
            String empty = "";
            if (childs.isEmpty()) return new PairString(empty, empty);//or i.getValue().b == arg
            Optional<PairString> l = childs.stream().map(i -> i.getPhi(arg, globalTree))
                    .filter(i -> Objects.equals(i.a, empty))
                    .findFirst();
            if (l.isEmpty()) return new PairString(empty, empty);
            return l.get();
        }
        Map.Entry<String, PairString> u = p.get();
        PairString v = phiLbls.get(u.getKey());
        String k = globalTree.mayBeRenameReg(u.getKey());
        return new PairString(LLVMAsm.PHI(k, u.getValue().b, u.getValue().a, v.b, v.a, globalTree), k);//TODO rename u.getKey()+"_" +  int()
    }
}
