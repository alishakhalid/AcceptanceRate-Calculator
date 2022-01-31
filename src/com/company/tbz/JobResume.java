package com.company.tbz;

import java.util.ArrayList;

/**
 * This method is the child class of
 * the class Resume which contains the the
 * additional attribute maxDomicileDistance
 */
public class JobResume extends Resume{
    private int maxDomicileDistance;
    private ArrayList<JobResume> userResumeList = new ArrayList<>();

    public JobResume(int maxDomicileDistance, String name,double averageGrade, Skill skill, String strength, String weakness, boolean hasBMSDiploma) {
        super(name,averageGrade, skill, strength, weakness, hasBMSDiploma);
        this.maxDomicileDistance = maxDomicileDistance;
    }
    public JobResume(){}

    /**
     * This method lets us create hardcoded resumes which
     * are meant for the job path. This method calls upon
     * the method addUserResumeToList
     * @param domicileDistance
     * @param averageGrade
     * @param userInputSkill
     * @param userStrength
     * @param userWeakness
     * @param hasBMS
     */
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

    /**
     * This method adds the job resumes to the arraylist
     * of resumes.
     * @param userEducationResume
     */
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
