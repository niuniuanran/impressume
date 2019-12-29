package util.info;

public class Project {
    private String name;
    private String projectLink;
    private String description;

    public Project() {
    }


    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Project(String name, String projectLink, String description) {
        this.name = name;
        this.projectLink = addProtocol(projectLink);
        this.description = description;
    }

    private String addProtocol(String url) {
        if (url.startsWith("https://") || url.startsWith("http://")) return url;
        else return "https://" + url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectLink() {
        return projectLink;
    }

    public void setProjectLink(String projectLink) {
        this.projectLink = addProtocol(projectLink);
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
