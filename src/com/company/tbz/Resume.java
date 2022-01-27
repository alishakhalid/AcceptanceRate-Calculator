package com.company.tbz;


import java.util.ArrayList;

public class Resume {
    private String domicileDistance;
    private int averageGrade;
    private Skill skill;
    private ArrayList<String> strengths = new ArrayList<>();
    private ArrayList<String> weakness = new ArrayList<>();
    private boolean hasBMSDiploma;
    private ArrayList<Resume> resumes = new ArrayList<>();

    public Resume(String domicileDistance, int averageGrade, Skill skill,  ArrayList<String> strengths, ArrayList<String> weakness,  boolean hasBMSDiploma) {
        this.domicileDistance = domicileDistance;
        this.averageGrade = averageGrade;
        this.skill = skill;
        this.strengths = strengths;
        this.weakness = weakness;
        this.hasBMSDiploma = hasBMSDiploma;
    }

    public String getDomicileDistance() {
        return domicileDistance;
    }

    public void setDomicileDistance(String domicileDistance) {
        this.domicileDistance = domicileDistance;
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public ArrayList<String> getStrengths() {
        return strengths;
    }

    public void setStrengths(ArrayList<String> strengths) {
        this.strengths = strengths;
    }

    public ArrayList<String> getWeakness() {
        return weakness;
    }

    public void setWeakness(ArrayList<String> weakness) {
        this.weakness = weakness;
    }

    public boolean isHasBMSDiploma() {
        return hasBMSDiploma;
    }

    public void setHasBMSDiploma(boolean hasBMSDiploma) {
        this.hasBMSDiploma = hasBMSDiploma;
    }

    public ArrayList<Resume> getResumes() {
        return resumes;
    }

    public void setResumes(ArrayList<Resume> resumes) {
        this.resumes = resumes;
    }
}
