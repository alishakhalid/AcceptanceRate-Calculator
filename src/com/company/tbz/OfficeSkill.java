package com.company.tbz;


/**
 * This class is the child class
 * of the parent class Skill with
 * the additional attribute
 * officeSkill
 */
public class OfficeSkill extends Skill{

    private String officeSkill;

    public OfficeSkill(String name, double experienceInYears, String usageOfSkill, int skillLevel, String officeSkill ) {
        super(name, experienceInYears, usageOfSkill, skillLevel);
        this.officeSkill = officeSkill;
    }
}
