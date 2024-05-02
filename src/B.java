import java.util.HashSet;

public class B {

    private static B instance;
    HashSet<Integer> set = new HashSet<Integer> ();

    public static B getInstance() {
        if (instance == null)
            instance = new B();
        return instance;
    }

    public void doContainsB() {
        for (int i = 10001; i < 30000; i++) {
            getInstance().set.contains(i);
        }
    }

    public void constructB() {
        for (int i = 0; i < 10000; i++) {
            getInstance().set.add(i);
        }
    }

}
