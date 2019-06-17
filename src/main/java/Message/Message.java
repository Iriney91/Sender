package Message;

public class Message{

    private String theme;
    private  String text;

    public Message(String theme, String text) {
        this.theme = theme;
        this.text = text;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("%s %s",theme, text);
    }
}
