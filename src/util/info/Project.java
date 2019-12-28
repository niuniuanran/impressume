package util.info;

public class Project {
    private String name;
    private String link;
    private String imgURL;
    private String description;

    public Project() {
    }

    public Project(String name, String link, String imgURL, String description) {
        this.name = name;
        this.link = link;
        this.imgURL = imgURL;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
