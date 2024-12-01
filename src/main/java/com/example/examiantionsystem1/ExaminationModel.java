package com.example.examiantionsystem1;
import java.util.*;

public class ExaminationModel {
    private final Map<String, String> questions = new LinkedHashMap<>();
    private int score = 0;

    public ExaminationModel() {
        questions.put("What is the capital of France?", "Paris");
        questions.put("What is 5 + 3?", "8");
        questions.put("What is the square root of 16?", "4");
    }

    public Map<String, String> getQuestions() {
        return questions;
    }

    public void increaseScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public void resetScore() {
        score = 0;
    }
}
