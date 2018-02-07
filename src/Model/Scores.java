package Model;

public class Scores {
    public Scores(int userID, int score, String quizName) {
        UserID = userID;
        Score = score;
        QuizName = quizName;
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

    public String getQuizName() {
        return QuizName;
    }

    public void setQuizName(String quizName) {
        QuizName = quizName;
    }

    private  int UserID;
    private  int Score;
    private  String QuizName;


}
