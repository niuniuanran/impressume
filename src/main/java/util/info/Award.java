package util.info;

public class Award {
    private String name;
    private TimeInMonth time;
    private String issuerName;

    public Award() {
    }

    public Award(String name, TimeInMonth time, String issuerName) {
        this.name = name;
        this.time = time;
        this.issuerName = issuerName;
    }

    public Award(String name, TimeInMonth time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TimeInMonth getTime() {
        return time;
    }

    public void setTime(TimeInMonth time) {
        this.time = time;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

}
