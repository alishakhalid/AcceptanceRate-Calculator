package com.company.tbz;

import java.util.ArrayList;

public class Job {
    /**
     * This class is here to store
     * create and hardcoded jobs with
     * the instance of the class
     * Resume
     */
    private String workPlace;
    private String jobOrientation;
    private Resume resume = new Resume();
    private String jobName;
    ArrayList<Job> jobs = new ArrayList<>();


    /**
     *
     * @param workPlace
     * @param jobOrientation
     * @param resume
     * @param jobName
     */
    public Job(String workPlace, String jobOrientation, Resume resume, String jobName) {
        this.workPlace = workPlace;
        this.jobOrientation = jobOrientation;
        this.resume = resume;
        this.jobName = jobName;
    }

    /**
     * This empty constructor is here to
     * let us create instances of this class
     */
    public Job() {}

    /**
     * In this method we are creating hardcoded
     * jobs with the attributes of the constructor
     */
    public void initializeJobs() {
        resume.initializeResumes();
        jobs.add(new Job("Noser", "IT", resume.getResumes().get(0), "Software Developer"));
        jobs.add(new Job("Noser", "Office", resume.getResumes().get(1), "Administration Clerk"));
        jobs.add(new Job("UBS", "Office", resume.getResumes().get(2), "Bank Clerk"));
        jobs.add(new Job("Google", "IT", resume.getResumes().get(3), "System Developer"));
    }

    /**
     * This method loops through the arraylist of
     * all the jobs and gets us all the jobs
     * which are in the orientation IT
     */
    public void getITJobs() {
        initializeJobs();
        String jobOrientation = "IT";
        for (int i = 0; i < jobs.size(); i++) {
            if (jobs.get(i).getJobOrientation().equals(jobOrientation)) {
                System.out.print("[" + i + "] ");
                System.out.println("Workplace: "+ jobs.get(i).workPlace + " as " + jobs.get(i).jobName + " ");
            }
        }
    }

    /**
     * This method loops through the arraylist of
     * all the jobs and gets us all the jobs
     * which are in the orientation Office
     */
    public void getClerkJobs() {
        initializeJobs();
        String jobOrientation = "Office";
        for (int i = 0; i < jobs.size(); i++) {
        if (jobs.get(i).getJobOrientation().equals(jobOrientation)) {
                System.out.print("[" + i + "] ");
                System.out.println("Workplace: "+ jobs.get(i).workPlace + " as " + jobs.get(i).jobName + " ");
            }
        }
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public String getJobOrientation() {
        return jobOrientation;
    }

}
