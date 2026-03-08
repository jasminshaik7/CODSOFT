import java.util.*;

public class NumberGame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int number = rand.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number)
                System.out.println("Too High!");
            else if (guess < number)
                System.out.println("Too Low!");
            else
                System.out.println("Correct Guess!");

        } while (guess != number);
    }
}
