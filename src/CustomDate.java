public class CustomDate {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int seconds;

    public CustomDate(int year, int month, int day, int hour, int minute, int seconds) {
        setYear(year);
        setMonth(month);
        setDay(day);
        setHour(hour);
        setMinuteSeconds(minute, seconds);
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setMonth(int month) {
        if (month <= 12 && month >= 1) {
            this.month = month;
        }
    }

    private void setDay(int day) {
        if (day <= 31 && day >= 0) {
            this.day = day;
        }
    }

    private void setHour(int hour) {
        if (hour <= 24 && hour >= 0) {
            this.hour = hour;
        }
    }

    private void setMinuteSeconds(int minute, int seconds) {
        if (minute <= 60 && minute >= 0) {
            this.minute = minute;
        }
        if (seconds <= 60 && seconds >= 0) {
            this.seconds = seconds;
        }
    }
}
