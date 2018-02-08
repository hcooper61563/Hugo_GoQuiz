package Model;

import javafx.beans.property.SimpleStringProperty;

public class ScoresTable {


    public ScoresTable(SimpleStringProperty quizName, int score) {
        this.quizName = quizName;
        this.score = score;
    }

    public String getQuizName() {
        return quizName.get();
    }

    public SimpleStringProperty quizNameProperty() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName.set(quizName);
    }

    public int getScore() {
        return score;
    }

    private final SimpleStringProperty quizName;
        private final int score;


}
