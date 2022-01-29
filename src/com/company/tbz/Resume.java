package com.company.tbz;

import java.util.ArrayList;

public class Resume {
    private double averageGrade;
    private Skill skill;
    private String strength;
    private String weakness;
    private boolean hasBMSDiploma;
    private ArrayList<Resume> resumes;
    private ArrayList<String> strengths;
    private ArrayList<String> weaknesses;

    Skill programmingJava = new ITSkill( 1.5, "work", 7, "java");
    Skill programmingPython = new ITSkill(3, "hobby", 10, "python");
    Skill codingSQL = new ITSkill( 1.5, "work", 7, "java");
    Skill documentingWord = new OfficeSkill(3.5, "work", 8, "word");
    Skill presentingPPT = new OfficeSkill(3.5, "work", 6, "powerpoint");
    Skill loneWorker = new SocialSkill(true, false, false, true );
    Skill teamWorker = new SocialSkill(true, false, true, true );
    Skill allRounder = new SocialSkill(true, true, true, true );
    Skill leader = new SocialSkill(false, true, true, true );

    public Resume(double averageGrade, Skill skill, String strength ,String weakness,  boolean hasBMSDiploma) {
        this.averageGrade = averageGrade;
        this.skill = skill;
        this.strength = strength;
        this.weakness = weakness;
        this.hasBMSDiploma = hasBMSDiploma;
    }

    Resume noserIT = new JobResume( 40,5.5, programmingJava, "dedicated", "detail-oriented", false );
    Resume noserClerk = new JobResume( 15,5.5, documentingWord, "fair", "impatient", false );
    Resume ubsClerk = new JobResume( 20, 5.5, presentingPPT, "dedicated", "detail-oriented", false );
    Resume googleIT = new JobResume( 50,5.5, programmingPython, "caring", "insecure", true);
    Resume oracleIT = new JobResume( 150,5.5, codingSQL, "dedicated", "overconfident", true);
    Resume zhaw = new EducationResume(19, 5.2, loneWorker, "self-controlled", "overconfident", true );
    Resume hwz = new EducationResume(19,5, teamWorker, "fair", "insecure", true );
    Resume eth = new EducationResume(21, 5.3, loneWorker, "self-controlled", "overconfident", true );
    Resume vzh = new EducationResume(21,5, allRounder, "fair", "insecure", true );
    Resume itc = new EducationResume(18,5, teamWorker, "fair", "insecure", false );
    Resume atc = new EducationResume(18,5, leader, "fair", "insecure", false );

    public void addStrengths(){
        strengths.add("caring");
        strengths.add("dedicated");
        strengths.add("fair");
        strengths.add("motivated");
        strengths.add("self-controlled");
    }

    public void addWeaknesses(){
        weaknesses.add("detail-oriented");
        weaknesses.add("overconfident");
        weaknesses.add("insecure");
        weaknesses.add("impatient");
        weaknesses.add("disorganized");
    }

    public double getAverageGrade() {
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

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
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
