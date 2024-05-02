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
        for (int j = 0; j < 10000; j++) {
            for (int i = 10001; i < 50000; i++) {
                getInstance().set.contains(i);
            }
        }
    }

    public void constructB() {
        for (int i = 0; i < 10000; i++) {
            getInstance().set.add(i);
        }
    }

}
