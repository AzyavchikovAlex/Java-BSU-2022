package by.AlexAzyavchikov.quizer.exceptions;

public class QuizFinishedException extends RuntimeException {
    public QuizFinishedException(String message) {
        super(message);
    }
}