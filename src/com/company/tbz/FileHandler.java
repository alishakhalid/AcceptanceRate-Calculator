package com.company.tbz;

import java.io.*;
import java.util.ArrayList;
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
                    .concat(", ").concat("Required Skill: "+resume.getSkill().getName())
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
    /**
     * This method lets us read from the file we hardcoded
     * @param resume
     * @throws IOException
     */
    public static void readHardCodedResume(Resume resume) throws IOException {
        BufferedReader bufReader = new BufferedReader(new FileReader(resume.getName().concat(".txt")));
        ArrayList<String> listOfLines = new ArrayList<>();
        String line = bufReader.readLine();
        while (line != null) {
            listOfLines.add(line);
            line = bufReader.readLine();
        }
        bufReader.close();
        for (int i = 0; i < listOfLines.size(); i++){
            System.out.println(listOfLines.get(i));
        }
    }

    /**
     * This method prints out the user(resumes) which were
     * created through the program
     * @param resume
     * @throws IOException
     */
    public static void readUserResume(Resume resume) throws IOException {
        File file = new File("UserResume.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }

    /**
     * This method compares two files
     * and tells us how much is equal and
     * how many percent are not
     * @param resume1
     * @param resume2
     * @return
     * @throws IOException
     */
    public static long filesCompareByLine(Resume resume1, Resume resume2) throws IOException {
        resume1.initializeResumes();
        try (BufferedReader bf1 = new BufferedReader(new FileReader(resume1.getName().concat(".txt")));
             BufferedReader bf2 = new BufferedReader(new FileReader("UserResume.txt"))) {
            long lineNumber = 1;
            String line1 = "", line2 = "";
            while ((line1 = bf1.readLine()) != null) {
                line2 = bf2.readLine();
                if (line2 == null || !line1.equals(line2)) {
                    return lineNumber;
                }
                lineNumber++;
            }
            if (bf2.readLine() == null) {
                return -1;
            }
            else {
                return lineNumber;
            }
        }
    }
}