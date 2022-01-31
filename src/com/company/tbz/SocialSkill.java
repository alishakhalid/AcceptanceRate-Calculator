package com.company.tbz;

/**
 * This is the child class
 * of the parent class Skill
 * which is not specified
 * for a job/major but is general
 * and can be used as a skill
 * for anyone with none experience
 * in the other skill child classes
 */
public class SocialSkill extends Skill{
    private String name;
    private boolean isExtroverted;
    private boolean isAbleToHandleCriticism;
    private boolean isTeamOriented;
    private boolean isConsidered;

    public SocialSkill(String name, boolean isExtroverted, boolean isAbleToHandleCriticism, boolean isTeamOriented, boolean isConsidered) {
        this.name = name;
        this.isExtroverted = isExtroverted;
        this.isAbleToHandleCriticism = isAbleToHandleCriticism;
        this.isTeamOriented = isTeamOriented;
        this.isConsidered = isConsidered;
    }


    @Override
    public String getName() {
        return name;
    }
}
