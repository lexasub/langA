package org.lexasub.langos;

import org.lexasub.langos.utils.Promise;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Syntax {
    public Promise name;
    static List rules = new LinkedList<Rule>();
    public Syntax() {}
    public Syntax(Promise name){
        this.name = name;
    }

    public static Object linkSyntaxImpl(Promise ruleLink, Promise visitId_list_strong, Promise visitSyntax_impl_body) {//TODO
        return null;
    }

    public static Object addRangeCheck(Promise promiseCHAR, Promise promiseCHAR1) {//TODO
        return null;
    }

    public void addImport(Promise t) {//TODO
    }

    public void addRuleList(Stream<Promise> rulelist) {//TODO vs createRule
    }

    public void apply() {//TODO
    }


    public Object createRule(Promise ruleName, Promise ruleContent) {
        Rule rule = new Rule(ruleName, ruleContent);
        rules.add(rule);
        return null;
    }

    public Rule findRule(Promise ruleName) {
        Optional<Rule> stream = rules.stream().filter(o -> ((Rule)o).name == ruleName.get()).findFirst();
        if(!stream.isEmpty())
            return stream.get();
        return null;
    }
}
