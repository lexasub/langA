package org.lexasub.langosThirdTryWithoutPromise;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.lexasub.langosSecondTry.langosWithoutSyntaxParser;
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
        LinkedList<String> s = new LinkedList<>();
     /*   Mockito.when(terminalNode.func_args()).thenReturn(s.stream());
        Mockito.when(terminalNode.braced_element()).thenReturn(name);*/
      /*  Asm.createFunction(type,
                name,
                "",
                "");*/
        return terminalNode;
    }
}
