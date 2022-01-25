package com.company.tbz;


import java.util.ArrayList;

public class ITSkill extends Skill {

    private ArrayList<String> programmingLanguages = new ArrayList<>();

    public ITSkill(String name, double experienceInYears, String usageOfSkill, int skillLevel) {
        super(name, experienceInYears, usageOfSkill, skillLevel);
    }
}
