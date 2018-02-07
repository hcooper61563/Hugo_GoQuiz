package Model;

public class Scores {
    private int UserID;
    private String QuizName;
    private int Score;

    public Scores(int userID, String quizName, int score) {
        UserID = userID;
        QuizName = quizName;
        Score = score;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getQuizName() {
        return QuizName;
    }

    public void setQuizName(String quizName) {
        QuizName = quizName;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "UserID=" + UserID +
                ", QuizName='" + QuizName + '\'' +
                ", Score=" + Score +
                '}';
    }
}
