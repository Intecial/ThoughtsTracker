public class Message {
    private MoodLabel label;
    private String content;

    public Message(MoodLabel label, String content) {
        this.label = label;
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public MoodLabel getLabel() {
        return this.label;
    }
}
