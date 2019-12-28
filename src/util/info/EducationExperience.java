package util.info;

public class EducationExperience {
    private String institute;
    private String name;
    private String specification;
    private double GPA;
    private TimeInMonth from;
    private TimeInMonth to;

    public EducationExperience() {
    }

    public EducationExperience(String institute, String name, String specification, TimeInMonth from, TimeInMonth to) {
        this.institute = institute;
        this.name = name;
        this.specification = specification;
        this.from = from;
        this.to = to;
    }

    public EducationExperience(String institute, String name, String specification, double GPA, TimeInMonth from, TimeInMonth to) {
        this.institute = institute;
        this.name = name;
        this.specification = specification;
        this.GPA = GPA;
        this.from = from;
        this.to = to;
    }

    public EducationExperience(String institute, String name, double GPA, TimeInMonth from, TimeInMonth to) {
        this.institute = institute;
        this.name = name;
        this.GPA = GPA;
        this.from = from;
        this.to = to;
    }

    public EducationExperience(String institute, String name, TimeInMonth from, TimeInMonth to) {
        this.institute = institute;
        this.name = name;
        this.from = from;
        this.to = to;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
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
}
