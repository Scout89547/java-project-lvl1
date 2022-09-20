package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void game() {
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String result;
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        Random rand = new Random(19);
        for (int i = 0; i < 3; i++) {
            int x = rand.nextInt(19);
            System.out.println("Question: " + x);
            String value2 = sc.next();
            System.out.println("Your ansver: " + value2);
            if (x % 2 == 0) {
                result = "yes";
            } else {
                result = "no";
            }
            if (result.equals(value2)) {
                System.out.println("Correct!");
            } else {
                System.out.println(value2 + " is wrong answer.\n" +
                        "Correct answer was " + result + ".\n" +
                        "Let's try again,!");
                System.exit(0);
            }
        }

        System.out.println("Congratulations," + name +  "!");
    }
}
