package com.company.tbz;

import java.util.ArrayList;

public class Resume {
    private double averageGrade;
    private Skill skill = new Skill();
    private String strength;
    private String weakness;
    private boolean hasBMSDiploma;
    private ArrayList<Resume> resumes = new ArrayList<>();
    private ArrayList<String> strengths;
    private ArrayList<String> weaknesses;

    public Resume(){

    }

    public Resume(double averageGrade, Skill skill, String strength ,String weakness,  boolean hasBMSDiploma) {
        this.averageGrade = averageGrade;
        this.skill = skill;
        this.strength = strength;
        this.weakness = weakness;
        this.hasBMSDiploma = hasBMSDiploma;
    }

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

    public void initializeResumes(){
        skill.initializeSkills();
        Resume noserIT = new JobResume( 40,5.5, skill.getSkills().get(0), "dedicated", "detail-oriented", false );
        Resume noserClerk = new JobResume( 15,5.5, skill.getSkills().get(3), "fair", "impatient", false );
        Resume ubsClerk = new JobResume( 20, 5.5, skill.getSkills().get(4), "dedicated", "detail-oriented", false );
        Resume googleIT = new JobResume( 50,5.5, skill.getSkills().get(1), "caring", "insecure", true);
        Resume oracleIT = new JobResume( 150,5.5, skill.getSkills().get(2), "dedicated", "overconfident", true);
        Resume zhaw = new EducationResume(19, 5.2, skill.getSkills().get(5), "self-controlled", "overconfident", true );
        Resume hwz = new EducationResume(19,5, skill.getSkills().get(6), "fair", "insecure", true );
        Resume eth = new EducationResume(21, 5.3, skill.getSkills().get(5), "self-controlled", "overconfident", true );
        Resume uzh = new EducationResume(21,5, skill.getSkills().get(7), "fair", "insecure", true );
        Resume itc = new EducationResume(18,5, skill.getSkills().get(6), "fair", "insecure", false );
        Resume atc = new EducationResume(18,5, skill.getSkills().get(8), "fair", "insecure", false );
        resumes.add(noserIT);
        resumes.add(noserClerk);
        resumes.add(ubsClerk);
        resumes.add(googleIT);
        resumes.add(oracleIT);
        resumes.add(zhaw);
        resumes.add(hwz);
        resumes.add(eth);
        resumes.add(uzh);
        resumes.add(itc);
        resumes.add(atc);
    }

    public ArrayList<Resume> getResumes() {
        return resumes;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public Skill getSkill() {
        return skill;
    }

    public String getStrength() {
        return strength;
    }

    public String getWeakness() {
        return weakness;
    }

    public boolean isHasBMSDiploma() {
        return hasBMSDiploma;
    }

    public ArrayList<String> getStrengths() {
        return strengths;
    }

    public ArrayList<String> getWeaknesses() {
        return weaknesses;
    }
}
