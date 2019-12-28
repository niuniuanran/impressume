package util.info;

import java.util.ArrayList;

public class SkillStack {
    private ArrayList<String> skills;

    public SkillStack() {
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}
