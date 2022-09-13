package org.example;

//[MB TODO]
public class LangosWalker extends langosBaseListener {
    public void enterEntry_point(langosParser.Entry_pointContext ctx) {
        System.out.println("Entering Entry_point : " );
    }

    @Override
    public void enterImport_(langosParser.Import_Context ctx) {
        System.out.println("Entering Import_ : " );
        System.out.println("import : " +ctx.ID().getText());
    }

    public void exitEntry_point(langosParser.Entry_pointContext ctx) {
        System.out.println("Exiting Entry_point");
    }
}
