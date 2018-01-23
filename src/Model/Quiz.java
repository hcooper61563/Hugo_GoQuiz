package Model;

public class Quiz {

    private int QuizID;
    private String QuizName;

    public Quiz(int quizID, String quizName) {
        QuizID = quizID;
        QuizName = quizName;
    }

    public int getQuizID() {
        return QuizID;
    }

    public void setQuizID(int quizID) {
        QuizID = quizID;
    }

    public String getQuizName() {
        return QuizName;
    }

    public void setQuizName(String quizName) {
        QuizName = quizName;
    }
}
