package util.info;

public class PersonalLinks {
    private String linkedInURL;
    private String gitHubURL;
    private String twitterURL;
    private String facebookURL;
    private String gitLabURL;
    private String researchGateURL;
    private String wordPressURL;
    private String quoraURL;

    public PersonalLinks() {
    }

    private String addProtocol(String url) {
        if (url.startsWith("https://") || url.startsWith("http://")) return url;
        else return "https://" + url;
    }

    public String getResearchGateURL() {
        return researchGateURL;
    }

    public void setResearchGateURL(String researchGateURL) {
        this.researchGateURL = addProtocol(researchGateURL);
    }

    public String getWordPressURL() {
        return wordPressURL;
    }

    public void setWordPressURL(String wordPressURL) {
        this.wordPressURL = addProtocol(wordPressURL);
    }

    public String getQuoraURL() {
        return quoraURL;
    }

    public void setQuoraURL(String quoraURL) {
        this.quoraURL = addProtocol(quoraURL);
    }

    public String getGitLabURL() {
        return gitLabURL;
    }

    public void setGitLabURL(String gitLabURL) {
        this.gitLabURL = addProtocol(gitLabURL);
    }

    public String getLinkedInURL() {
        return linkedInURL;
    }

    public void setLinkedInURL(String linkedInURL) {
        this.linkedInURL = linkedInURL;
    }

    public String getGitHubURL() {
        return gitHubURL;
    }

    public void setGitHubURL(String gitHutURL) {
        this.gitHubURL = addProtocol(gitHutURL);
    }

    public String getTwitterURL() {
        return twitterURL;
    }

    public void setTwitterURL(String twitterURL) {
        this.twitterURL = addProtocol(twitterURL);
    }

    public String getFacebookURL() {
        return facebookURL;
    }

    public void setFacebookURL(String facebookURL) {
        this.facebookURL = addProtocol(facebookURL);

    }

}
