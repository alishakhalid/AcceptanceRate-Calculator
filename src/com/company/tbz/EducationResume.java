package com.company.tbz;

import java.io.File;
import java.util.ArrayList;


public class EducationResume extends Resume{

    /**
     * This is the child class of the
     * parent class Resume which uses the
     * additional attribute minAge
     */

    private int minAge;
    private ArrayList<EducationResume> userResumeList = new ArrayList<>();


    /**
     * This is the empty constructor used for
     * having an instance of this class
     */
    public EducationResume(){}

    /**
     * @param minAge
     * @param name
     * @param averageGrade
     * @param skill
     * @param strength
     * @param weakness
     * @param hasBMSDiploma
     */
    public EducationResume(int minAge, String name,double averageGrade, Skill skill, String strength, String weakness, boolean hasBMSDiploma) {
        super(name,averageGrade, skill, strength, weakness, hasBMSDiploma);
        this.minAge = minAge;
    }

    /**
     * This method lets us create resumes for the
     * path of Education and call on the method
     * addUserResumeToList
     * @param age
     * @param averageGrade
     * @param userInputSkill
     * @param userStrength
     * @param userWeakness
     * @param hasBMS
     */
    public void createEducationResumeForUserToFillOut(int age, double averageGrade, String userInputSkill, String userStrength, String userWeakness, boolean hasBMS){
        EducationResume userEducationResume = new EducationResume();
        userEducationResume.setMinAge(age);
        userEducationResume.setAverageGrade(averageGrade);
        userEducationResume.setUserSkill(userInputSkill);
        userEducationResume.setStrength(userStrength);
        userEducationResume.setWeakness(userWeakness);
        userEducationResume.setHasBMSDiploma(hasBMS);
        addUserResumeToList(userEducationResume);
        FileHandler.addEducationResumeToFile(userEducationResume);
    }

    /**
     * This method adds the hardcoded objects to
     * an arraylist of the same class
     * @param userEducationResume
     */
    public void addUserResumeToList(EducationResume userEducationResume){
        userResumeList.add(userEducationResume);
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public ArrayList<EducationResume> getUserResumeList() {
        return userResumeList;
    }

}
