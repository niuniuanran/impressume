package util.star;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkillGroup {

    private String name;
    private List<String> skills;

    public SkillGroup() {
    }

    public SkillGroup(String name) {
        this.name = name;
    }

    public SkillGroup(String name, String[] skills) {
        this.name = name;
        this.skills = Arrays.asList(skills);
    }

    private void addSkill(String skill) {
        if (skills == null)
            skills = new ArrayList<>();
        skills.add(skill);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return name + ": " + skills.toString();
    }
}
