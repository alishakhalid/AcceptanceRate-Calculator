package com.company.tbz;


import java.util.ArrayList;

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

    public boolean isExtroverted() {
        return isExtroverted;
    }

    public void setExtroverted(boolean extroverted) {
        isExtroverted = extroverted;
    }

    public boolean isAbleToHandleCriticism() {
        return isAbleToHandleCriticism;
    }

    public void setAbleToHandleCriticism(boolean ableToHandleCriticism) {
        isAbleToHandleCriticism = ableToHandleCriticism;
    }

    public boolean isTeamOriented() {
        return isTeamOriented;
    }

    public void setTeamOriented(boolean teamOriented) {
        isTeamOriented = teamOriented;
    }

    public boolean isConsidered() {
        return isConsidered;
    }

    public void setConsidered(boolean considered) {
        isConsidered = considered;
    }

    @Override
    public String getName() {
        return name;
    }
}
