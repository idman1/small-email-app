package data.models;

public class EmailBody {
    private int emailId;
    private String title;
    private String body;

    public EmailBody(int emailId, String title, String body) {
        this.emailId = emailId;
        this.title = title;
        this.body = body;
    }

    public int getEmailId() {
        return emailId;
    }

    public void setEmailId(int emailId) {
        this.emailId = emailId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
