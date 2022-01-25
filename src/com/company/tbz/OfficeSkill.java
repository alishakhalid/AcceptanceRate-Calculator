package com.company.tbz;


import java.util.ArrayList;

public class OfficeSkill extends Skill{

    private ArrayList<String> officeSkills = new ArrayList<>();

    public OfficeSkill(String name, double experienceInYears, String usageOfSkill, int skillLevel) {
        super(name, experienceInYears, usageOfSkill, skillLevel);
    }
}
