import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner scanner = new Scanner(System.in);

        int die1 = 0;
        int die2 = -1;
        int die3 = -2;
        int dieRoll = 0;
        int roll = 0;
        String userInput = "y";

        System.out.println("roll#\tdie1\tdie2\tdie3\tdieRoll");
        System.out.println("_______________________________________");

        while (die1 != die2 || die2 != die3) {
            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            die3 = gen.nextInt(6) + 1;
            dieRoll = die1 + die2 + die3;
            roll++;
            System.out.printf("%3d%8d%8d%8d%9d\n", roll, die1, die2, die3, dieRoll);


            if (die1 == die2 && die2 == die3) {
                System.out.println("You rolled three of the same number! Ending the game.");
                break;
            }


            System.out.print("Do you want to continue rolling? (Y/N): ");
            userInput = scanner.nextLine();


            if (!userInput.equalsIgnoreCase("Y")) {
                System.out.println("Game stopped by the user.");
                break;
            }
        }

    }
}
