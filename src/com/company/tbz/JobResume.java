package com.company.tbz;

import java.util.ArrayList;

public class JobResume extends Resume{
    private int maxDomicileDistance;
    private ArrayList<JobResume> userResumeList = new ArrayList<>();

    public JobResume(int maxDomicileDistance, String name,double averageGrade, Skill skill, String strength, String weakness, boolean hasBMSDiploma) {
        super(name,averageGrade, skill, strength, weakness, hasBMSDiploma);
        this.maxDomicileDistance = maxDomicileDistance;
    }
    public JobResume(){}

    public void createJobResumeForUserToFillOut(int domicileDistance, double averageGrade, String userInputSkill, String userStrength, String userWeakness, boolean hasBMS){
        JobResume userJobResume = new JobResume();
        userJobResume.setMaxDomicileDistance(domicileDistance);
        userJobResume.setAverageGrade(averageGrade);
        userJobResume.setUserSkill(userInputSkill);
        userJobResume.setStrength(userStrength);
        userJobResume.setWeakness(userWeakness);
        userJobResume.setHasBMSDiploma(hasBMS);
        addUserResumeToList(userJobResume);
    }

    public void addUserResumeToList(JobResume userEducationResume){
        userResumeList.add(userEducationResume);
    }

    public ArrayList<JobResume> getUserResumeList() {
        return userResumeList;
    }

    public int getMaxDomicileDistance() {
        return maxDomicileDistance;
    }

    public void setMaxDomicileDistance(int maxDomicileDistance) {
        this.maxDomicileDistance = maxDomicileDistance;
    }
}
