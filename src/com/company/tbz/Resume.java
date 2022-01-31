package com.company.tbz;

import java.util.ArrayList;

/**
 * This is the parent class Resume
 * which lets a user/job/school
 * create a resume with their
 * fitting candidates/applicants
 */
public class Resume {
    private String userSkill;
    private String name;
    private double averageGrade;
    private Skill skill = new Skill();
    private String strength;
    private String weakness;
    private boolean hasBMSDiploma;
    private ArrayList<String> strengths = new ArrayList<>();
    private ArrayList<String> weaknesses = new ArrayList<>();
    private ArrayList<Resume> resumes = new ArrayList<>();

    public Resume(){ }

    /**
     * This class has all the attributes which are
     * used in both jobs and schools
     * @param name
     * @param averageGrade
     * @param skill
     * @param strength
     * @param weakness
     * @param hasBMSDiploma
     */
    public Resume(String name, double averageGrade, Skill skill, String strength ,String weakness,  boolean hasBMSDiploma) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.skill = skill;
        this.strength = strength;
        this.weakness = weakness;
        this.hasBMSDiploma = hasBMSDiploma;
    }

    /**
     * This method creates hardcoded data
     * for the field strength
     */
    public void addStrengths(){
        strengths.add("caring");
        strengths.add("dedicated");
        strengths.add("fair");
        strengths.add("motivated");
        strengths.add("self-controlled");
    }
    /**
     * This method creates hardcoded data
     * for the field weakness
     */
    public void addWeaknesses(){
        weaknesses.add("detail-oriented");
        weaknesses.add("overconfident");
        weaknesses.add("insecure");
        weaknesses.add("impatient");
        weaknesses.add("disorganized");
    }

    /**
     * This method creates hardcoded
     * resume which are all added in
     * a arraylist of resumes
     * @return
     */
    public ArrayList<Resume> initializeResumes(){
        skill.initializeSkills();
        Resume noserIT = new JobResume( 40,"noserIT",5.5, skill.getSkills().get(0), "dedicated", "detail-oriented", false);
        Resume noserClerk = new JobResume( 15,"noserClerk",5.5, skill.getSkills().get(3), "fair", "impatient", false );
        Resume ubsClerk = new JobResume( 20,"ubsClerk" ,5.5, skill.getSkills().get(4), "dedicated", "detail-oriented", false );
        Resume googleIT = new JobResume( 50,"googleIT",5.5, skill.getSkills().get(1), "caring", "insecure", true);
        Resume oracleIT = new JobResume( 150,"oracleIT",5.5, skill.getSkills().get(2), "dedicated", "overconfident", true);
        Resume zhaw = new EducationResume(19,"zhaw", 5.2, skill.getSkills().get(5), "self-controlled", "overconfident", true );
        Resume hwz = new EducationResume(19,"hwz",5, skill.getSkills().get(6), "fair", "insecure", true );
        Resume eth = new EducationResume(21, "eth",5.3, skill.getSkills().get(5), "self-controlled", "overconfident", true );
        Resume uzh = new EducationResume(21,"uzh",5, skill.getSkills().get(7), "fair", "insecure", true );
        Resume itc = new EducationResume(18,"itc",5, skill.getSkills().get(6), "fair", "insecure", false );
        Resume atc = new EducationResume(18,"atc",5, skill.getSkills().get(8), "fair", "insecure", false );
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
        return resumes;
    }

    public double getAverageGrade() {
        return averageGrade;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getUserSkill() {
        return userSkill;
    }

    public void setUserSkill(String userSkill) {
        this.userSkill = userSkill;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public void setHasBMSDiploma(boolean hasBMSDiploma) {
        this.hasBMSDiploma = hasBMSDiploma;
    }

    public ArrayList<Resume> getResumes() {
        return resumes;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
