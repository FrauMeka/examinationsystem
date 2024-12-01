package com.example.examiantionsystem1;
import java.util.Scanner;

public class ExaminationController {
    private final ExaminationModel model = new ExaminationModel();
    private final ExaminationView view = new ExaminationView();
    private User currentUser;

    public void startSystem() {
        view.showWelcomeMessage();

        currentUser = authenticateUser();
        if (currentUser == null) {
            view.showExitMessage();
            return;
        }

        boolean continueExam;
        do {
            startExam();
            continueExam = view.askToRetakeExam();
        } while (continueExam);

        view.showExitMessage();
    }

    private User authenticateUser() {
        String username = view.promptForUsername();
        if (username.isBlank()) {
            view.showInvalidUsernameMessage();
            return null;
        }
        return new User(username);
    }

    private void startExam() {
        view.showExamInstructions(currentUser.getUsername());
        model.resetScore();

        model.getQuestions().forEach((question, correctAnswer) -> {
            String userAnswer = view.askQuestion(question);
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                model.increaseScore();
                view.showCorrectAnswerMessage();
            } else {
                view.showIncorrectAnswerMessage(correctAnswer);
            }
        });

        view.showFinalScore(model.getScore());
    }
}
