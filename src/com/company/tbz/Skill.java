package com.company.tbz;

public abstract class Skill {
    private double experienceInYears;
    private String usageOfSkill;
    private int skillLevel;

    public Skill( double experienceInYears, String usageOfSkill, int skillLevel) {
        this.experienceInYears = experienceInYears;
        this.usageOfSkill = usageOfSkill;
        this.skillLevel = skillLevel;
    }

    public Skill() {
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
