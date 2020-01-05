package util.star;

import java.util.ArrayList;

public class SkillStack {

    private boolean hasProgramming = false;
    // web development
    private boolean html5 = false;
    private boolean css3 = false;
    private boolean js = false;
    private boolean nodeJS = false;
    private boolean sass = false;

    private boolean angular = false;
    private boolean react = false;
    private boolean vue = false;

    private boolean less = false;
    private boolean wordpress = false;
    private boolean gulp = false;
    private boolean grunt = false;
    private boolean npm = false;

    private boolean java = false;
    private boolean python = false;
    private boolean swift = false;

    private boolean adobe = false;
    private boolean aws = false;
    private boolean suse = false;
    private boolean ubuntu = false;
    private boolean git = false;
    private boolean php = false;
    private boolean yarn = false;


    private ArrayList<SkillGroup> skillGroups;

    public SkillStack() {
    }


    public SkillStack(boolean hasProgramming) {
        this.hasProgramming = hasProgramming;
    }

    public boolean isHasProgramming() {
        return hasProgramming;
    }

    public void setHasProgramming(boolean hasProgramming) {
        this.hasProgramming = hasProgramming;
    }

    public void addSkillGroup(SkillGroup skillGroup) {
        if (skillGroups == null)
            skillGroups = new ArrayList<>();
        skillGroups.add(skillGroup);
    }

    public void setSass(boolean sass) {
        this.sass = sass;
    }

    public boolean isGit() {
        return git;
    }

    public void setGit(boolean git) {
        this.git = git;
    }

    public boolean isPhp() {
        return php;
    }

    public void setPhp(boolean php) {
        this.php = php;
    }

    public boolean isYarn() {
        return yarn;
    }

    public void setYarn(boolean yarn) {
        this.yarn = yarn;
    }

    public boolean isHtml5() {
        return html5;
    }

    public void setHtml5(boolean html5) {
        this.html5 = html5;
    }

    public boolean isCss3() {
        return css3;
    }

    public void setCss3(boolean css3) {
        this.css3 = css3;
    }

    public boolean isJs() {
        return js;
    }

    public void setJs(boolean js) {
        this.js = js;
    }

    public boolean isNodeJS() {
        return nodeJS;
    }

    public void setNodeJS(boolean nodeJS) {
        this.nodeJS = nodeJS;
    }

    public boolean isSass() {
        return sass;
    }


    public boolean isAngular() {
        return angular;
    }

    public void setAngular(boolean angular) {
        this.angular = angular;
    }

    public boolean isReact() {
        return react;
    }

    public void setReact(boolean react) {
        this.react = react;
    }

    public boolean isVue() {
        return vue;
    }

    public void setVue(boolean vue) {
        this.vue = vue;
    }

    public boolean isLess() {
        return less;
    }

    public void setLess(boolean less) {
        this.less = less;
    }

    public boolean isWordpress() {
        return wordpress;
    }

    public void setWordpress(boolean wordpress) {
        this.wordpress = wordpress;
    }

    public boolean isGulp() {
        return gulp;
    }

    public void setGulp(boolean gulp) {
        this.gulp = gulp;
    }

    public boolean isGrunt() {
        return grunt;
    }

    public void setGrunt(boolean grunt) {
        this.grunt = grunt;
    }

    public boolean isNpm() {
        return npm;
    }

    public void setNpm(boolean npm) {
        this.npm = npm;
    }

    public boolean isJava() {
        return java;
    }

    public void setJava(boolean java) {
        this.java = java;
    }

    public boolean isPython() {
        return python;
    }

    public void setPython(boolean python) {
        this.python = python;
    }

    public boolean isSwift() {
        return swift;
    }

    public void setSwift(boolean swift) {
        this.swift = swift;
    }

    public boolean isAdobe() {
        return adobe;
    }

    public void setAdobe(boolean adobe) {
        this.adobe = adobe;
    }

    public boolean isAws() {
        return aws;
    }

    public void setAws(boolean aws) {
        this.aws = aws;
    }

    public boolean isSuse() {
        return suse;
    }

    public void setSuse(boolean suse) {
        this.suse = suse;
    }

    public boolean isUbuntu() {
        return ubuntu;
    }

    public void setUbuntu(boolean ubuntu) {
        this.ubuntu = ubuntu;
    }

    public ArrayList<SkillGroup> getSkillGroups() {
        return skillGroups;
    }

    public void setSkillGroups(ArrayList<SkillGroup> skillGroups) {
        this.skillGroups = skillGroups;
    }

    @Override
    public String toString() {
        return String.format("have %d groups, the first one is %s", skillGroups.size(), skillGroups.get(0));
    }
}
