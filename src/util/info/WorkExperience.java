package util.info;

public class WorkExperience {
    private String title;
    private String organizationName;
    private String description;
    private TimeInMonth from;
    private TimeInMonth to;
    private String organizationLink;

    public WorkExperience() {
    }
    private String addProtocol(String url) {
        if (url.startsWith("https://") || url.startsWith("http://")) return url;
        else return "https://" + url;
    }
    public WorkExperience(String title, String organizationName, String description,
                          TimeInMonth from, TimeInMonth to, String organizationLink) {
        this.title = title;
        this.organizationName = organizationName;
        this.description = description;
        this.from = from;
        this.to = to;
        this.organizationLink = addProtocol(organizationLink);
    }
    public WorkExperience(String title, String organizationName, String description,
                          TimeInMonth from, TimeInMonth to) {
        this.title = title;
        this.organizationName = organizationName;
        this.description = description;
        this.from = from;
        this.to = to;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TimeInMonth getFrom() {
        return from;
    }

    public void setFrom(TimeInMonth from) {
        this.from = from;
    }

    public TimeInMonth getTo() {
        return to;
    }

    public void setTo(TimeInMonth to) {
        this.to = to;
    }

    public String getOrganizationLink() {
        return organizationLink;
    }

    public void setOrganizationLink(String organizationLink) {
        this.organizationLink = addProtocol(organizationLink);
    }
}
