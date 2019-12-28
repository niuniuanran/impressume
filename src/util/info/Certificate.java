package util.info;

public class Certificate {
    private String name;
    private String certificateLink;
    private String issuerName;
    private String issuerLink;

    public Certificate() {
    }

    public Certificate(String name, String certificateLink, String issuerName, String issuerLink) {
        this.name = name;
        this.certificateLink = certificateLink;
        this.issuerName = issuerName;
        this.issuerLink = issuerLink;
    }

    public String getCertificateLink() {
        return certificateLink;
    }

    public void setCertificateLink(String certificateLink) {
        this.certificateLink = certificateLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
