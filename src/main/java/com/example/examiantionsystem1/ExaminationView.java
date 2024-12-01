package com.example.examiantionsystem1;
import java.util.Scanner;

public class ExaminationView {
    private final Scanner scanner = new Scanner(System.in);

    public void showWelcomeMessage() {
        System.out.println("Welcome to the Examination System!");
    }

    public String promptForUsername() {
        System.out.print("Enter your username: ");
        return scanner.nextLine();
    }

    public void showInvalidUsernameMessage() {
        System.out.println("Invalid username. Exiting the system.");
    }

    public void showExamInstructions(String username) {
        System.out.println("Hi " + username + "! Please answer the following questions:");
    }

    public String askQuestion(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public void showCorrectAnswerMessage() {
        System.out.println("Correct!");
    }

    public void showIncorrectAnswerMessage(String correctAnswer) {
        System.out.println("Incorrect. The correct answer is: " + correctAnswer);
    }

    public void showFinalScore(int score) {
        System.out.println("Your final score is: " + score);
    }

    public boolean askToRetakeExam() {
        System.out.print("Do you want to retake the exam? (yes/no): ");
        String response = scanner.nextLine();
        return response.equalsIgnoreCase("yes");
    }

    public void showExitMessage() {
        System.out.println("Thank you for using the Examination System. Goodbye!");
    }
}
