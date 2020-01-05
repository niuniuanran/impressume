package util.star;

import java.util.ArrayList;

import static util.AddProtocol.addProtocol;

public class WorkExperience {
    private String title;
    private String organizationName;
    private ArrayList<String> descriptions;
    private TimeInMonth from;
    private TimeInMonth to;
    private String organizationLink;
    private String place;

    public WorkExperience() {
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public WorkExperience(String title, String organizationName, String description,
                          TimeInMonth from, TimeInMonth to, String organizationLink) {
        this.title = title;
        this.organizationName = organizationName;
        this.descriptions = new ArrayList<>();
        descriptions.add(description);
        this.from = from;
        this.to = to;
        this.organizationLink = addProtocol(organizationLink);
    }

    public WorkExperience(String title, String organizationName, String description,
                          TimeInMonth from, TimeInMonth to) {
        this.title = title;
        this.organizationName = organizationName;
        this.descriptions = new ArrayList<>();
        descriptions.add(description);
        this.from = from;
        this.to = to;
    }

    public WorkExperience(String title, String organizationName, TimeInMonth from, TimeInMonth to) {
        this.title = title;
        this.organizationName = organizationName;
        this.from = from;
        this.to = to;
    }

    public WorkExperience(String title, String organizationName, TimeInMonth from, TimeInMonth to, String place, String description) {
        this.title = title;
        this.organizationName = organizationName;
        this.from = from;
        this.to = to;
        this.place = place;
        descriptions = new ArrayList<>();
        descriptions.add(description);
    }

    public ArrayList<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(ArrayList<String> descriptions) {
        this.descriptions = descriptions;
    }
    public void addDescription(String description) {
        if (descriptions == null)
            descriptions = new ArrayList<>();
        descriptions.add(description);
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
