package com.company.tbz;

import java.util.ArrayList;


public class EducationResume extends Resume{

    private int minAge;
    private ArrayList<Resume> userResumeList = new ArrayList<>();


    public EducationResume(){

    }

    public EducationResume(int minAge, String name,double averageGrade, Skill skill, String strength, String weakness, boolean hasBMSDiploma) {
        super(name,averageGrade, skill, strength, weakness, hasBMSDiploma);
        this.minAge = minAge;
    }

    public void createEducationResumeForUserToFillOut(int age, double averageGrade, String userInputSkill, String userStrength, String userWeakness, boolean hasBMS){
        Resume userEducationResume = new EducationResume();
        userEducationResume.setMinAge(age);
        userEducationResume.setAverageGrade(averageGrade);
        userEducationResume.setUserSkill(userInputSkill);
        userEducationResume.setStrength(userStrength);
        userEducationResume.setWeakness(userWeakness);
        userEducationResume.setHasBMSDiploma(hasBMS);
        addUserResumeToList(userEducationResume);
    }

    public void addUserResumeToList(Resume userEducationResume){
        userResumeList.add(userEducationResume);
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public ArrayList<Resume> getUserResumeList() {
        return userResumeList;
    }

    public void setUserResumeList(ArrayList<Resume> userResumeList) {
        this.userResumeList = userResumeList;
    }
}
