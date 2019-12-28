package util.info;

public class Award {
    private String name;
    private String time;
    private String issuerName;
    private String issuerLink;

    public Award() {
    }

    public Award(String name, String time, String issuerName) {
        this.name = name;
        this.time = time;
        this.issuerName = issuerName;
    }

    public Award(String name, String time, String issuerName, String issuerLink) {
        this.name = name;
        this.time = time;
        this.issuerName = issuerName;
        this.issuerLink = issuerLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public String getIssuerLink() {
        return issuerLink;
    }

    public void setIssuerLink(String issuerLink) {
        this.issuerLink = issuerLink;
    }
}
