/**
 * MAIN CLASS
 *
 * Use Case 4: Error Handling & Validation
 *
 * This class coordinates the game execution while ensuring
 * all user inputs are safely validated before processing.
 *
 * Responsibilities:
 * - Initialize game configuration
 * - Accept user input
 * - Validate input using ValidationService
 * - Handle game flow without crashing on invalid input
 *
 * @author Developer
 * @version 4.0
 */
public class GuessingApp {

    public static void main(String[] args) throws InvalidInputException {
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
    }
}
