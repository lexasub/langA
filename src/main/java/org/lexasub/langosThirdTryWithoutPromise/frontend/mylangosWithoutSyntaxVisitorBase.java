package org.lexasub.langosThirdTryWithoutPromise.frontend;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.function.Function;

public class mylangosWithoutSyntaxVisitorBase extends langosWithoutSyntaxBaseVisitor<String> {


    protected static Function selectFunction(langosWithoutSyntaxParser.Fun_nameContext funname) {
        if (funname.IF() != null)
            return FunctionGenerators.ifGenerator();
        if (funname.WHILE() != null)
            return FunctionGenerators.whileGenerator();
        if (funname.PAIRMAP() != null)
            return FunctionGenerators.pairMapGenerator();
        if (funname.MAP() != null)
            return FunctionGenerators.mapGenerator();
        if (funname.SWAP() != null)
            return FunctionGenerators.swap();
        if(funname.SET() != null)
            return FunctionGenerators.set();
        if (funname.ID() != null)//may be add ids.table.addfuntotable..//TODO?
            return FunctionGenerators.userFunGenerator2(funname.ID().getText(),"FUNCTION_" + funname.ID().getText());
        return null;
    }

    @Override
    public String visitImport_(langosWithoutSyntaxParser.Import_Context ctx) {
        return Asm.IMPORT(ctx.ID().stream().map(this::visitid2));
    }

    @Override
    public String visitType_name(langosWithoutSyntaxParser.Type_nameContext ctx) {
        return visitid("ID " + ctx.ID().getText() + "\n");
    }
    public String visitType_name2(langosWithoutSyntaxParser.Type_nameContext ctx) {
        return visitid2(ctx.ID());
    }
    @Override
    public String visitWith_synonym(langosWithoutSyntaxParser.With_synonymContext ctx){
        return visitid2(ctx.ID());
    }
    @Override
    public String visitClass_name(langosWithoutSyntaxParser.Class_nameContext ctx) {
        return visitid2(ctx.ID());
    }

    @Override
    public String visitVar_name(langosWithoutSyntaxParser.Var_nameContext ctx) {
        return visitid2(ctx.ID());
    }

    @Override
    public String visitMember_name(langosWithoutSyntaxParser.Member_nameContext ctx) {
        return visitid2(ctx.ID());
    }

    public String visitid2(TerminalNode s) {
        return visitid(s.getText());
    }

    public String visitid(String s) {
        return s;//TODO
    }
}
