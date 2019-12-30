package util.info;

import util.AddProtocol;

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

    public String getResearchGateURL() {
        return researchGateURL;
    }

    public void setResearchGateURL(String researchGateURL) {
        this.researchGateURL = AddProtocol.addProtocol(researchGateURL);
    }

    public String getWordPressURL() {
        return wordPressURL;
    }

    public void setWordPressURL(String wordPressURL) {
        this.wordPressURL = AddProtocol.addProtocol(wordPressURL);
    }

    public String getQuoraURL() {
        return quoraURL;
    }

    public void setQuoraURL(String quoraURL) {
        this.quoraURL = AddProtocol.addProtocol(quoraURL);
    }

    public String getGitLabURL() {
        return gitLabURL;
    }

    public void setGitLabURL(String gitLabURL) {
        this.gitLabURL = AddProtocol.addProtocol(gitLabURL);
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
        this.gitHubURL = AddProtocol.addProtocol(gitHutURL);
    }

    public String getTwitterURL() {
        return twitterURL;
    }

    public void setTwitterURL(String twitterURL) {
        this.twitterURL = AddProtocol.addProtocol(twitterURL);
    }

    public String getFacebookURL() {
        return facebookURL;
    }

    public void setFacebookURL(String facebookURL) {
        this.facebookURL = AddProtocol.addProtocol(facebookURL);

    }

}
