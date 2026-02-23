/**
 * MAIN CLASS
 *
 * Use Case 6: Game Restart & Exit
 *
 * This class coordinates the complete game lifecycle,
 * allowing the player to replay or exit gracefully.
 *
 * Responsibilities:
 * - Start a new game session
 * - Execute the guessing flow
 * - Persist game results
 * - Restart or exit based on user choice
 *
 * @author Developer
 * @version 6.0
 */
import java.util.*;
public class GuessingApp {

    public static void main(String[] args) throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        boolean restart;

        System.out.println("===============================");
        System.out.println("Welcome to the Guessing App");
        System.out.println("===============================\n");


        /*
        * Outer loop controls whether
        * a new game session should start.
        */
        do {

        /*....*/
        System.out.print("Enter Player Name: ");
        String player = scanner.nextLine();

        GameConfig config = new GameConfig();
        config.showRules();

        int attempts = 0;
        int hintsUsed = 0;

        /*
        * Tracks whether the player
        * successfully guessed the number.
        */
        boolean win = false;


        /*
        * Inner loop handles the guessing
        * logic for a single game session.
        */
        while (attempts < config.getMaxAttempts()) {

            System.out.print("Enter your guess: ");

            /*
            * User input is validated before
            * being used in the game logic.
            */
            int guess = ValidationService.validateInput(scanner.nextLine());
            attempts++;

            String result = GuessValidator.validateGuess(
                guess, config.getTargetNumber());

            /*
            * A hint is generated only after
            * an incorrect guess and within
            * the allowed hint limit.
            */
            if (!"CORRECT".equals(result) && hintsUsed < config.getMaxHints()) {
                hintsUsed++;
                System.out.println(
                    HintService.generateHint(config.getTargetNumber(), hintsUsed)
                );
            }

            System.out.println(result);

            /*
            * Stop the loop immediately
            * if the correct number is guessed.
            */
            if ("CORRECT".equals(result)) {
                break;
            }
        }

        /*
        * Final game result is persisted
        * after the current session ends.
        */
        StorageService.saveResult(player, attempts, win);

        /*
        * Player decides whether to
        * restart the game or exit.
        */
        restart = GameController.restartGame(scanner);

        } while (restart);
    }
}