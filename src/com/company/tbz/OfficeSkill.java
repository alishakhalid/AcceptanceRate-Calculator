package com.company.tbz;


import java.util.ArrayList;

public class OfficeSkill extends Skill{

    private String officeSkill;

    public OfficeSkill(String name, double experienceInYears, String usageOfSkill, int skillLevel, String officeSkill ) {
        super(name, experienceInYears, usageOfSkill, skillLevel);
        this.officeSkill = officeSkill;
    }
}
