import java.io.IOException;

public class MainSource {

    public static void main(String[] args) throws IOException {
        prompt("Start Construct");
        A.getInstance().constructA();
        prompt("Start Find");
        A.getInstance().doContainsA();
        prompt("Finish");
    }

    private static void prompt(String action) throws IOException {
        System.out.println("Press any key to " + action.toLowerCase() + "...");
        System.in.read();
        System.out.println(action + "ing !");
    }

}
