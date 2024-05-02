import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;

public class A {

    private static A instance;
    ArrayList<Integer> array = new ArrayList<Integer>();

    public static A getInstance() {
        if (instance == null)
            instance = new A();
        return instance;
    }

    public void doContainsA() {
        for (int i = 10001; i < 30000; i++) {
            getInstance().array.contains(i);
        }
    }

    public void constructA() {
        for (int i = 0; i < 10000; i++) {
            getInstance().array.add(i);
        }
    }

}
