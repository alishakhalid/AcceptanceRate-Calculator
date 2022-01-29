package com.company.tbz;


import java.util.ArrayList;

public class ITSkill extends Skill {

    private String programmingLanguages;

    public ITSkill( String name, double experienceInYears, String usageOfSkill, int skillLevel, String programmingLanguages) {
        super(name, experienceInYears, usageOfSkill, skillLevel);
        this.programmingLanguages = programmingLanguages;
    }

}
