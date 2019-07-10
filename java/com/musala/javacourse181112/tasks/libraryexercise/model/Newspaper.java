package java.com.musala.javacourse181112.tasks.libraryexercise.model;

public class Newspaper extends AbstractItem implements Issueable {

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