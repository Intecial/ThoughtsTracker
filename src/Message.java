import java.time.LocalDateTime;

public class Message {
    private MoodLabel label;
    private String content;
    private final LocalDateTime dateTime;

    public Message(MoodLabel label, String content) {
        setLabel(label);
        setContent(content);
        this.dateTime = LocalDateTime.now();
    }

    public Message(String csvLine) {
        String[] splitString = csvLine.split(",");
        String strLabel = splitString[0];
        String strContent = splitString[1];
        String strDate = splitString[2];
        String strTime = splitString[3];
        // splitting date string
        String[] splitDate = strDate.split("-");
        int year = Integer.parseInt(splitDate[0]);
        int month = Integer.parseInt(splitDate[1]);
        int day = Integer.parseInt(splitDate[2]);
        // splitting time string
        String[] splitTime = strTime.split(":");
        int hour = Integer.parseInt(splitTime[0]);
        int minute = Integer.parseInt(splitTime[1]);
        int seconds = Integer.parseInt(splitTime[2]);
        int nano = Integer.parseInt(splitTime[3]);

        setLabel(MoodLabel.valueOf(strLabel));
        setContent(strContent);
        this.dateTime = LocalDateTime.of(year, month, day, hour, minute, seconds, nano);

    }

    public String getContent() {
        return this.content;
    }

    public MoodLabel getLabel() {
        return this.label;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLabel(MoodLabel label) {
        this.label = label;
    }

    @Override
    public String toString() {
        // GOOD,test message,2021-7-17,21:28:30:11
        return  label + "," +
                content + "," +
                dateTime.getYear() + "-" + dateTime.getMonthValue() + "-" + dateTime.getDayOfMonth() + "," +
                dateTime.getHour() + ":" + dateTime.getMinute() + ":" + dateTime.getSecond() + ":" + dateTime.getNano();
    }
}
