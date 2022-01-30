package com.company.tbz;

import java.util.ArrayList;

public class Skill {
    private String name;
    private double experienceInYears;
    private String usageOfSkill;
    private int skillLevel;
    private  ArrayList<Skill> skills = new ArrayList<>();

    public Skill() {}

    public Skill(String name, double experienceInYears, String usageOfSkill, int skillLevel) {
        this.name = name;
        this.experienceInYears = experienceInYears;
        this.usageOfSkill = usageOfSkill;
        this.skillLevel = skillLevel;
    }

    public ArrayList<Skill> initializeSkills() {
        Skill programmingJava = new ITSkill("Programming with Java",1.5, "work", 7, "java");
        Skill programmingPython = new ITSkill("Programming with Python",3, "hobby", 10, "python");
        Skill codingSQL = new ITSkill("SQL",1.5, "work", 7, "java");
        Skill documentingWord = new OfficeSkill("Use word",3.5, "work", 8, "word");
        Skill creatingExcel = new OfficeSkill("Use Excel",3.5, "work", 6, "excel");
        Skill loneWorker = new SocialSkill("Lone Worker",true, false, false, true);
        Skill teamWorker = new SocialSkill("Team worker",true, false, true, true);
        Skill allRounder = new SocialSkill("All rounder",true, true, true, true);
        Skill leader = new SocialSkill("Leader",false, true, true, true);
        skills.add(programmingJava);
        skills.add(programmingPython);
        skills.add(codingSQL);
        skills.add(documentingWord);
        skills.add(creatingExcel);
        skills.add(loneWorker);
        skills.add(teamWorker);
        skills.add(allRounder);
        skills.add(leader);
        return skills;
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

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public String getName() {
        return name;
    }


}
