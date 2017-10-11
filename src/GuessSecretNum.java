import java.util.Random;
import java.util.Scanner;

public class GuessSecretNum {
    public static void main(String[] args) {
        int guess;

        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        int x = 1 + r.nextInt(100);
        do {
            System.out.print("Guess the number between 1 and 100: ");
            guess = scan.nextInt();
            if (guess != x) System.out.println("Incorrect guess! ");
            if (guess > x) System.out.println("Guess is too high!");
            if (guess < x) System.out.println("Guess is too low!");
            if (guess == x) System.out.println("Congrats! You guessed correctly!");
        } while(guess != x);
    }
}
