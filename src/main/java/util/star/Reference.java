package util.star;

public class Reference {
    private String name;
    private String title;
    private String organization;
    private String phone;
    private String email;
    private String relationship;

    public Reference() {
    }

    public Reference(String name, String title, String organization, String phone, String email, String relationship) {
        this.name = name;
        this.title = title;
        this.organization = organization;
        this.phone = phone;
        this.email = email;
        this.relationship = relationship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}
