package com.company.tbz;

/**
 * This is the child class of
 * the parent class Skill which has
 * the additional attribute
 * programmingLanguages for all the
 * resumes where the specialization field
 * is IT
 */
public class ITSkill extends Skill {

    private String programmingLanguages;

    public ITSkill( String name, double experienceInYears, String usageOfSkill, int skillLevel, String programmingLanguages) {
        super(name, experienceInYears, usageOfSkill, skillLevel);
        this.programmingLanguages = programmingLanguages;
    }

}
