package Model;

public class Question {
    private int QuestionID;
    private int QuizID;
    private String Questions;
    private String CorrectAnswer;
    private String WrongAnswer1;
    private String WrongAnswer2;
    private String WrongAnswer3;

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

    public String getWrongAnswer1() {
        return WrongAnswer1;
    }

    public void setWrongAnswer1(String wrongAnswer1) {
        WrongAnswer1 = wrongAnswer1;
    }

    public String getWrongAnswer2() {
        return WrongAnswer2;
    }

    public void setWrongAnswer2(String wrongAnswer2) {
        WrongAnswer2 = wrongAnswer2;
    }

    public String getWrongAnswer3() {
        return WrongAnswer3;
    }

    public void setWrongAnswer3(String wrongAnswer3) {
        WrongAnswer3 = wrongAnswer3;
    }

    public Question(int questionID, int quizID, String questions, String correctAnswer, String wrongAnswer1, String wrongAnswer2, String wrongAnswer3) {
        QuestionID = questionID;
        QuizID = quizID;
        Questions = questions;
        CorrectAnswer = correctAnswer;
        WrongAnswer1 = wrongAnswer1;
        WrongAnswer2 = wrongAnswer2;
        WrongAnswer3 = wrongAnswer3;
    }

    @Override
    public String toString() {
        return "Question{" +
                "Questions='" + Questions + '\'' +
                ", CorrectAnswer='" + CorrectAnswer + '\'' +
                '}';
    }
}
