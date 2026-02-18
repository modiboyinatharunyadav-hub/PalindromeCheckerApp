/**
 * UseCase1PalindromeCheckerApp
 *
 * Objective:
 * This application displays a welcome message and application details
 * for the Palindrome Checker App.
 *
 * Version: 1.0
 * @author:"Tharun"
 * 
 */

public class UseCase1PalindromeCheckerApp {

    // Application Constants
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "Version 1.0";

    /**
     * Main Method - Entry point of the Java application
     * JVM invokes this method automatically.
     */
    public static void main(String[] args) {

        // Display Welcome Message
        System.out.println("=====================================");
        System.out.println("        " + APP_NAME);
        System.out.println("        " + VERSION);
        System.out.println("=====================================");
        System.out.println("Welcome to the Palindrome Checker Application!");
        System.out.println("This application will validate whether");
        System.out.println("a given string is a palindrome.");
        System.out.println("=====================================");

        // Application flow continues to next use case (future implementation)
        System.out.println("Application started successfully.");
    }
}
