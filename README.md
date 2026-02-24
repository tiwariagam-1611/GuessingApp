This Number Guessing Game is a Java-based interactive application designed to
understand core programming concepts through a structured, step-by-step gameplay experience.


Use Case 1  
Goal: The goal is to set up the game with all the required configurations before the player begins.  
Description: The game initializes by generating a random number within the chosen range, setting the maximum number of attempts, resetting counters, and displaying the rules to the player. This provides a consistent and controlled starting point and ensures the game environment is ready.

Use Case 2  
Goal: The goal is to allow the player to enter a guess and receive immediate feedback.  
Description: The game accepts the user’s input, validates whether it is a valid number, compares it to the target value, counts the attempt, and informs the player if their guess is higher, lower, or correct. This establishes the core interaction loop of the game.

Use Case 3  
Goal: The goal is to provide useful hints that help the player after an incorrect guess.  
Description: When a guess is wrong, the system may reveal limited hints such as whether the number is even or odd, divisible by something, or lies within a smaller range. These hints guide the player while still keeping the answer challenging to find.

Use Case 4  
Goal: The goal is to ensure that user inputs are always safe, validated, and do not cause the program to crash.  
Description: The game relies on exception handling to detect errors such as alphabetic input, invalid characters, or numbers outside the allowed range. It displays clear and friendly error messages while maintaining smooth gameplay and preventing runtime failures.

Use Case 5  
Goal: The goal is to store the player’s game results for future reference.  
Description: After the game ends, information such as the player’s name, number of attempts, and whether they won or lost can be saved in a file or database. This allows viewing previous results later and provides practical learning in file handling or JDBC.

Use Case 6  
Goal: The goal is to let the player restart the game or exit the application safely.  
Description: When a round finishes, the player may choose to begin a new game, in which case all game variables are reset, or exit, in which case the program closes all resources properly. This ensures a smooth, user-friendly end to the gaming session.
