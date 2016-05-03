package ma.chanlenge.listofcommits;

/**
 * Created by hichambagui on 2016-05-02.
 */
public class MyCommitsFormat {

    private String ID;
    private String Name;
    private String Commits;
    private String datetime;
    private String Message;

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getCommits() {
        return Commits;
    }

    public String getMessage() {
        return Message;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCommits(String commits) {
        Commits = commits;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public MyCommitsFormat(String ID, String name, String commits, String datetime, String message) {
        this.ID = ID;
        Name = name;
        Commits = commits;
        this.datetime = datetime;
        Message = message;
    }

    @Override
    public String toString() {
        return "MyCommitsFormat{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Commits='" + Commits + '\'' +
                ", datetime='" + datetime + '\'' +
                ", Message='" + Message + '\'' +
                '}';
    }
}
