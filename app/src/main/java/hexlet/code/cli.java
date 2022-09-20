package hexlet.code;
import java.util.Scanner;

public class cli {
    public static void name() {
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello," + name+"!");
        }
}
