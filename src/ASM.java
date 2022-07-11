import java.util.List;
import java.util.Vector;

public class ASM {
    List ids = new Vector<String>();
    public Integer addToTableIDs(String s) {
        ids.add(s);
        return ids.size() - 1;
    }
}
