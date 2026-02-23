/*
 * Use Case 3: Hint Generation
 *
 * @author Developer
 * @version 3.0
 */
import java.util.*;
public class GuessingApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Guessing App");

        GameConfig config = new GameConfig();
        config.showRules();

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int hintsUsed = 0;

        /*
         * Game loop runs until the player
         * exhausts the maximum attempts.
        */
        

        while (attempts < config.getMaxAttempts()) {

            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            String result = GuessValidator.validateGuess(guess, config.getTargetNumber());
            String hint = HintService.generateHint(game.getTargetNumber(), attempts);
			System.out.println(hint);
            
            System.out.println(result);

            /*
            * Stop the loop immediately
            * if the correct number is guessed.
            */
            if ("CORRECT".equals(result)) {
                break;
            }
        }
    }
}
