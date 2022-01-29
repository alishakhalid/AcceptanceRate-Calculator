package com.company.tbz;


import java.util.ArrayList;

public class ITSkill extends Skill {

    private String programmingLanguages;

    public ITSkill( double experienceInYears, String usageOfSkill, int skillLevel, String programmingLanguages) {
        super(experienceInYears, usageOfSkill, skillLevel);
        this.programmingLanguages = programmingLanguages;
    }

}
