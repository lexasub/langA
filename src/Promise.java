import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Promise {


    static Promise add(Supplier op) {
        return new Promise();
    }

    public Object addAfterDependency(Object visitRulelist) {
        return this;
    }

    public Object addWaiter(Function o) {

        return this;
    }
}
