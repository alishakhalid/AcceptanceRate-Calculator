package com.company.tbz;

public abstract class Skill {
    private String name;
    private double experienceInYears;
    private String usageOfSkill;
    private int skillLevel;

    public Skill(String name, double experienceInYears, String usageOfSkill, int skillLevel) {
        this.name = name;
        this.experienceInYears = experienceInYears;
        this.usageOfSkill = usageOfSkill;
        this.skillLevel = skillLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(double experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public String getUsageOfSkill() {
        return usageOfSkill;
    }

    public void setUsageOfSkill(String usageOfSkill) {
        this.usageOfSkill = usageOfSkill;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }
}
