package util.info;

public class TimeInMonth {
    public static final String[] MONTHS = new String[]{"January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October", "November", "December"};
    private int month;
    private int year;
    private boolean present;

    public TimeInMonth() {
    }

    public TimeInMonth(int month, int year) {
        this.month = month;
        this.year = year;
        this.present = false;
    }

    public TimeInMonth(boolean present) {
        this.present = true;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    @Override
    public String toString() {
        if (present) return "Present";
        else return MONTHS[month] + " " + year;
    }
}
