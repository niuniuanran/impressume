package util.info;

import java.util.ArrayList;
import java.util.List;

public class ResumeStar {
    private int id;
    private String name;
    private String briefIntro;

    private ContactDetail contactDetail;
    private PersonalLinks personalLinks;

    private List<EducationExperience> educationExperiences;
    private List<WorkExperiences> workExperiences;
    private List<Award> awards;
    private List<Certificate> certificates;
    private List<Project> projects;

    private SkillStack skillStack;

    public ResumeStar() { }
    public ResumeStar(int id, String name) {
        this.id = id;
        this.name = name;
        educationExperiences = new ArrayList<>();
        workExperiences = new ArrayList<>();
        awards = new ArrayList<>();
        certificates = new ArrayList<>();
        projects = new ArrayList<>();
    }

    public void addProject(Project project) {
        projects.add(project);
    }
    public void addEducation (EducationExperience educationExperience) {
        educationExperiences.add(educationExperience);
    }
    public void addWork (WorkExperiences workExperience) {
        workExperiences.add(workExperience);
    }
    public void addAward (Award award) {
        awards.add(award);
    }
    public void addCertificate (Certificate certificate) {
        certificates.add(certificate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<WorkExperiences> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(List<WorkExperiences> workExperiences) {
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
