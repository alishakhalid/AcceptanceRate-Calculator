package com.company.tbz;


import java.util.ArrayList;

public class SocialSkill extends Skill{

    private boolean isExtroverted;
    private boolean isAbleToHandleCriticism;
    private boolean isTeamOriented;
    private boolean isConsidered;

    public SocialSkill(String name, double experienceInYears, String usageOfSkill, int skillLevel) {
        super(name, experienceInYears, usageOfSkill, skillLevel);
    }
}
