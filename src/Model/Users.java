package Model;

public class Users {
    private String username;
    private int userID;


    public Users(int userID, String username) {
        this.userID = userID;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userID +
                ", username='" + username + '\'' +
                '}';
    }
}
