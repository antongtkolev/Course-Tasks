package java.com.musala.javacourse181112.tasks.libraryexercise.model;

public class Magazine extends AbstractItem implements Issueable {
    public int issue;

    @Override
    public int getIssue() {
        return issue;
    }

    @Override
    public void setIssue(int issue) {
        this.issue = issue;
    }
}
