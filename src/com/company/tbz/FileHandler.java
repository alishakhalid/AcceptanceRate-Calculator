package com.company.tbz;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class FileHandler {
    private static String line;

    /**
     * This method creates a file
     * for every item that is saved
     * in the arraylist of Resume with their
     * values
     * @param resume
     * @return
     */
    public static boolean addResumeToFile(Resume resume) {
        File file = new File(resume.getName().concat(".txt"));
        boolean doesExist = false;
        FileWriter fileWriter = null;
        String word;
        try {
            fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            line = "Name: " + resume.getName().concat(", ")
                    .concat(String.valueOf("Average Grade: "+resume.getAverageGrade()))
                    .concat(", ").concat("Skill: "+resume.getSkill().getName())
                    .concat(", ").concat("Strength: "+resume.getStrength()).concat(", ")
                    .concat("Weakness: "+resume.getWeakness()).concat(", ")
                    .concat(String.valueOf("Has BMS Diploma: "+resume.isHasBMSDiploma()));
            if (bufferedReader.readLine() == null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            bufferedReader.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        doesExist = file.exists();
        return doesExist;
    }
    /**
     * This method is for creating a file
     * for new entered user, who are looking
     * for a job.
     * @param jobResume
     * @return
     */
    public static boolean addJobResumeToFile(JobResume jobResume) {
        jobResume.addUserResumeToList(jobResume);
        File file = new File("UserResume.txt");
        boolean doesExist = false;
        FileWriter fileWriter = null;
        String word;
        try {
            fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            line = String.valueOf("Average Grade: "+jobResume.getAverageGrade())
                    .concat(", ").concat("Skill: "+jobResume.getSkill().getName())
                    .concat(", ").concat("Strength: "+jobResume.getStrength()).concat(", ")
                    .concat("Weakness: "+jobResume.getWeakness()).concat(", ")
                    .concat(String.valueOf("Has BMS Diploma: "+jobResume.isHasBMSDiploma()));
            if (bufferedReader.readLine() == null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            bufferedReader.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        doesExist = file.exists();
        return doesExist;
    }

    /**
     * This method creates a file for user who are
     * looking for the study path and are not hardcoded
     * @param educationResume
     * @return
     */
    public static boolean addEducationResumeToFile(EducationResume educationResume) {
        educationResume.addUserResumeToList(educationResume);
        File file = new File("UserResume.txt");
        boolean doesExist = false;
        FileWriter fileWriter = null;
        String word;
        try {
            fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            line = String.valueOf("Average Grade: "+educationResume.getAverageGrade())
                    .concat(", ").concat("Skill: "+educationResume.getSkill().getName())
                    .concat(", ").concat("Strength: "+educationResume.getStrength()).concat(", ")
                    .concat("Weakness: "+educationResume.getWeakness()).concat(", ")
                    .concat(String.valueOf("Has BMS Diploma: "+educationResume.isHasBMSDiploma()));
            if (bufferedReader.readLine() == null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            bufferedReader.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        doesExist = file.exists();
        return doesExist;
    }

    public String readResume(String resumeName) throws IOException {
        File file = new File(resumeName + ".txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        String data = "";
        while ((st = br.readLine()) != null) {
            data = st;
        }
        return data;
    }

    public HashMap<String, String> saveResumeAsHash(String data){
        HashMap<String, String> savedData = new HashMap<>();
        String[] dataArray = data.split(",");
        for (String dataEntry: dataArray){
            String[] dataElement = dataEntry.split(":");
            savedData.put(dataElement[0],dataElement[1]);
        }
        return savedData;
    }

    public String readUserResume() throws IOException {
        File file = new File("UserResume.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        String data = "";
        while ((st = br.readLine()) != null) {
            data = st;
        }
        return data;
    }
}