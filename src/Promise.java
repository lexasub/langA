import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Promise {
    class tmp {
        public String namespace="", name="";

        public Object namespace() {
            return namespace;
        }

        public Object name() {
            return name;
        }
    };

    static Promise add(Supplier op) {
        return new Promise();
    }

    public Promise addAfterDependency(Promise visitRulelist) {
        return this;
    }

    public Promise addWaiter(Function<tmp,Object> o) {

        return this;
    }
    public Object get(){
        return null;
    }
}
