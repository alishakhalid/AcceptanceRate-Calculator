package com.company.tbz;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * This is the child class of the
 * parent class Resume which uses the
 * additional attribute minAge
 */

public class EducationResume extends Resume{

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


    public HashMap<String, String> userResumeAsHash(String data) throws IOException {
        HashMap<String, String> savedData = new HashMap<>();
        String[] dataArray = data.split(",");
        for (String dataEntry: dataArray){
            String[] dataElement = dataEntry.split(":");
            savedData.put(dataElement[0],dataElement[1]);
        }
        return savedData;
    }

    /**
     * This method compares the two HashMaps of the given
     * resumes and also calls the method calculateAcceptanceRate
     * @param templateData
     * @param userData
     * @return
     */
    public Double compareEducationalResume(HashMap<String, String> templateData, HashMap<String, String> userData){
        double counter = 0;
        Set<String> keySet = templateData.keySet();
        for(String keyTempSet : keySet){
            if (templateData.get(keyTempSet).equals(userData.get(keyTempSet)) && !keyTempSet.equals("Name")){
                counter++;
            }
        }
        return calculateAcceptanceRate(counter);
    }

    /**
     * This method counts all the points of the resumes and
     * returns the given rate
     * @param counter
     * @return
     */
    private Double calculateAcceptanceRate(Double counter){
        return (counter * 100.0) / 5.00;
    }
    /**
     * This method adds the hardcoded objects to
     * an arraylist of the same class
     * @param userEducationResume
     */
    public void addUserResumeToList(EducationResume userEducationResume) {
        userResumeList.add(userEducationResume);
    }

    /**
     * This method lets us create resumes for the
     * path of Education and call on the method
     * addUserResumeToList
     * @param averageGrade
     * @param userInputSkill
     * @param userStrength
     * @param userWeakness
     * @param hasBMS
     */
    public void createEducationResumeForUserToFillOut(int minAge, String name,  double averageGrade, String userInputSkill, String userStrength, String userWeakness, boolean hasBMS){
        EducationResume userEducationResume = new EducationResume();
        userEducationResume.setName(name);
        userEducationResume.setMinAge(minAge);
        userEducationResume.setAverageGrade(averageGrade);
        userEducationResume.setUserSkill(userInputSkill);
        userEducationResume.setStrength(userStrength);
        userEducationResume.setWeakness(userWeakness);
        userEducationResume.setHasBMSDiploma(hasBMS);
        addUserResumeToList(userEducationResume);
        FileHandler.addEducationResumeToFile(userEducationResume);
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
