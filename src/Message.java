import java.util.Calendar;
import java.util.GregorianCalendar;

public class Message {
    private MoodLabel label;
    private String content;
    private final Calendar timeDate;

    public Message(MoodLabel label, String content) {
        this.label = label;
        this.content = content;
        this.timeDate = new GregorianCalendar();
    }

    public String getContent() {
        return this.content;
    }

    public MoodLabel getLabel() {
        return this.label;
    }

    public Calendar getTimeDate() {
        return timeDate;
    }

    public void changeContent(String content) {
        this.content = content;
    }

    public void changeLabel(MoodLabel label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return  "MOOD: " + label + "\n" +
                "MESSAGE: " + content + "\n" +
                "DATE: " + timeDate.getTime();
    }
}
