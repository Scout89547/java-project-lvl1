package hexlet.code;
import java.util.Scanner;
import static hexlet.code.Game.game;
import static hexlet.code.cli.name;
public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                 1 - Greet
                 2 - Even
                 0 - Exit""");

        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        if (Integer.parseInt(value) == 1) {
            System.out.println("Your choice: 1");
            System.out.println("Welcome to the Brain Games!");
            name();
            System.exit(0);
        } else if (Integer.parseInt(value) == 2) {
            System.out.println("Your choice: 2");
            System.out.println("Welcome to the Brain Games!");
            game();

            } else {System.exit(0);}

        }
    }

