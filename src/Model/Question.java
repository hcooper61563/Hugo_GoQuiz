package Model;

public class Question {
    private int QuestionID;
    private int QuizID;
    private String Questions;
    private String CorrectAnswer;


    public Question(int questionID, int quizID, String questions, String correctAnswer) {
        QuestionID = questionID;
        QuizID = quizID;
        Questions = questions;
        CorrectAnswer= correctAnswer;
    }

    public int getQuestionID() {
        return QuestionID;
    }

    public void setQuestionID(int questionID) {
        QuestionID = questionID;
    }

    public int getQuizID() {
        return QuizID;
    }

    public void setQuizID(int quizID) {
        QuizID = quizID;
    }

    public String getQuestions() {
        return Questions;
    }

    public void setQuestions(String questions) {
        Questions = questions;
    }

    public String getCorrectAnswer() {
        return CorrectAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        CorrectAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "Questions='" + Questions + '\'' +
                ", CorrectAnswer='" + CorrectAnswer + '\'' +
                '}';
    }
}
