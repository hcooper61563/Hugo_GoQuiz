package Model;

public class Scores {
    public Scores(int userID, int score, int quizID) {
        UserID = userID;
        QuizID= quizID;
        Score = score;

    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public int getQuizID() {
        return QuizID;
    }

    public void setQuizID(int quizID) {
        QuizID = quizID;
    }

    private  int UserID;
    private  int Score;
    private  int  QuizID;


}
