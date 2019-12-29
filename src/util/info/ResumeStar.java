package util.info;

import java.util.ArrayList;
import java.util.List;

public class ResumeStar {
    private int id;
    private String name;
    private String firstName;
    private String lastName;
    private String briefIntro;
    private String imagePath;

    private ContactDetail contactDetail;
    private PersonalLinks personalLinks;

    private List<EducationExperience> educationExperiences;
    private List<WorkExperience> workExperiences;
    private List<Award> awards;
    private List<Certificate> certificates;
    private List<Project> projects;

    private SkillStack skillStack;
    private List<String> interests;

    public ResumeStar() {
    }

    public ResumeStar(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = this.firstName + " " + this.lastName;
        this.name = firstName + " " + lastName;

    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void addEducation(EducationExperience educationExperience) {
        if (educationExperiences == null) educationExperiences = new ArrayList<>();
        educationExperiences.add(educationExperience);
    }

    public void addWork(WorkExperience workExperience) {

        if (workExperiences == null)
            workExperiences = new ArrayList<>();
        workExperiences.add(workExperience);
    }

    public void addInterest(String interest) {
        if (interests == null)
            interests = new ArrayList<>();
        interests.add(interest);
    }

    public void addAward(Award award) {
        if (awards == null)
            awards = new ArrayList<>();
        awards.add(award);
    }

    public void addCertificate(Certificate certificate) {
        if (certificates == null)
            certificates = new ArrayList<>();
        certificates.add(certificate);
    }

    public void addProject(Project project) {
        if (projects == null)
            projects = new ArrayList<>();
        projects.add(project);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBriefIntro() {
        return briefIntro;
    }

    public void setBriefIntro(String briefIntro) {
        this.briefIntro = briefIntro;
    }

    public ContactDetail getContactDetail() {
        return contactDetail;
    }

    public void setContactDetail(ContactDetail contactDetail) {
        this.contactDetail = contactDetail;
    }

    public PersonalLinks getPersonalLinks() {
        return personalLinks;
    }

    public void setPersonalLinks(PersonalLinks personalLinks) {
        this.personalLinks = personalLinks;
    }

    public List<EducationExperience> getEducationExperiences() {
        return educationExperiences;
    }

    public void setEducationExperiences(List<EducationExperience> educationExperiences) {
        this.educationExperiences = educationExperiences;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(List<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }

    public SkillStack getSkillStack() {
        return skillStack;
    }

    public void setSkillStack(SkillStack skillStack) {
        this.skillStack = skillStack;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

}
