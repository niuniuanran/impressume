package util.star;

public class EducationExperience {
    private String institute;
    private String name;
    private String specification;
    private Double GPA;
    private double fullGPA = 9.00;
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

    public EducationExperience(String institute, String name, String specification, double GPA, double fullGPA, TimeInMonth from, TimeInMonth to) {
        this.institute = institute;
        this.name = name;
        this.specification = specification;
        this.GPA = GPA;
        this.fullGPA = fullGPA;
        this.from = from;
        this.to = to;
    }

    public EducationExperience(String institute, String name, double GPA, double fullGPA, TimeInMonth from, TimeInMonth to) {
        this.institute = institute;
        this.name = name;
        this.GPA = GPA;
        this.fullGPA = fullGPA;
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

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public Double getGPA() {
        return GPA;
    }

    public double getFullGPA() {
        return fullGPA;
    }

    public void setFullGPA(double fullGPA) {
        this.fullGPA = fullGPA;
    }
}
