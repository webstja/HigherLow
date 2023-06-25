import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(10) + 1;
        int userGuess;

        do {
            System.out.print("Guess the number (1-10): ");
            userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! Your guess is correct");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low. Try again!");
            } else {
                System.out.println("Too high. Try again!");
            }
        } while (userGuess != randomNumber);
    }
}
