package org.lexasub.langosThirdTryWithoutPromise;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.mockito.Mockito;

import java.util.LinkedList;

public class TestHelper {

    protected static TerminalNode spawnID(String s) {
        TerminalNode terminalNode =
                Mockito.mock(TerminalNode.class);
        Mockito.when(terminalNode.getText()).thenReturn(s);
        return terminalNode;
    }
    protected static langosWithoutSyntaxParser.Type_nameContext spawnTypeName(String s) {
        langosWithoutSyntaxParser.Type_nameContext dataService =
                Mockito.mock(langosWithoutSyntaxParser.Type_nameContext.class);
        TerminalNode d = spawnID(s);
        Mockito.when(dataService.ID()).thenReturn(d);
        return dataService;
    }
    protected static langosWithoutSyntaxParser.Var_nameContext spawnVarName(String r){
        langosWithoutSyntaxParser.Var_nameContext dataService =
                Mockito.mock(langosWithoutSyntaxParser.Var_nameContext.class);
        TerminalNode s = spawnID(r);
        Mockito.when(dataService.ID()).thenReturn(s);
        return dataService;
    }
    protected static langosWithoutSyntaxParser.Member_nameContext spawnMemberName(String r){
        langosWithoutSyntaxParser.Member_nameContext dataService =
            Mockito.mock(langosWithoutSyntaxParser.Member_nameContext.class);
        TerminalNode s = spawnID(r);
        Mockito.when(dataService.ID()).thenReturn(s);
        return dataService;
    }

    protected static langosWithoutSyntaxParser.Class_nameContext spawnClassName(String r) {
        langosWithoutSyntaxParser.Class_nameContext dataService =
                Mockito.mock(langosWithoutSyntaxParser.Class_nameContext.class);
        TerminalNode s = spawnID(r);
        Mockito.when(dataService.ID()).thenReturn(s);
        return dataService;
    }
    protected static langosWithoutSyntaxParser.FunctionContext spawnFunction(langosWithoutSyntaxParser.Type_nameContext type,
                                                                             langosWithoutSyntaxParser.Var_nameContext name){//TODO
        langosWithoutSyntaxParser.FunctionContext terminalNode =
                Mockito.mock(langosWithoutSyntaxParser.FunctionContext.class);
        Mockito.when(terminalNode.type_name()).thenReturn(type);
        Mockito.when(terminalNode.var_name()).thenReturn(name);
        Mockito.when(terminalNode.func_args()).thenReturn(spawnFuncArgs());
        Mockito.when(terminalNode.braced_element()).thenReturn(spawnBracedElement());
      /*  Asm.createFunction(type,
                name,
                "",
                "");*/
        return terminalNode;
    }

    private static langosWithoutSyntaxParser.Braced_elementContext spawnBracedElement() {
        langosWithoutSyntaxParser.Braced_elementContext s = Mockito.mock(langosWithoutSyntaxParser.Braced_elementContext.class);
        return s;
    }

    private static langosWithoutSyntaxParser.Func_argsContext spawnFuncArgs() {
        langosWithoutSyntaxParser.Func_argsContext s = Mockito.mock(langosWithoutSyntaxParser.Func_argsContext.class);
        String a = "test";
        LinkedList<langosWithoutSyntaxParser.Type_nameContext> t = getType_nameContextsList(s, a);
        Mockito.when(s.type_name()).thenReturn(t);
        String b = "test";
        LinkedList<langosWithoutSyntaxParser.Var_nameContext> t1 = getVar_nameContextsList(b);
        Mockito.when(s.var_name()).thenReturn(t1);
        return s;
    }

    private static LinkedList<langosWithoutSyntaxParser.Var_nameContext> getVar_nameContextsList(String test1) {
        langosWithoutSyntaxParser.Var_nameContext test2 = spawnVarName(test1);
        LinkedList<langosWithoutSyntaxParser.Var_nameContext> t1 = new LinkedList<>();
        t1.add(test2);
        t1.add(test2);
        return t1;
    }

    private static LinkedList<langosWithoutSyntaxParser.Type_nameContext> getType_nameContextsList(langosWithoutSyntaxParser.Func_argsContext s, String test3) {
        langosWithoutSyntaxParser.Type_nameContext test = spawnTypeName(test3);
        LinkedList<langosWithoutSyntaxParser.Type_nameContext> t = new LinkedList<>();
        t.add(test);
        t.add(test);
        Mockito.when(s.type_name()).thenReturn(t);
        return t;
    }
}
