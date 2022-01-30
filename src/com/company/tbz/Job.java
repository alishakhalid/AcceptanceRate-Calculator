package com.company.tbz;

import java.util.ArrayList;

public class Job {
    private String workPlace;
    private String jobOrientation;
    private Resume resume = new Resume();
    private String jobName;
    ArrayList<Job> jobs = new ArrayList<>();

    public Job(String workPlace, String jobOrientation, Resume resume, String jobName) {
        this.workPlace = workPlace;
        this.jobOrientation = jobOrientation;
        this.resume = resume;
        this.jobName = jobName;
    }

    public Job() {}

    public void initializeJobs() {
        resume.initializeResumes();
        jobs.add(new Job("Noser", "IT", resume.getResumes().get(0), "Software Developer"));
        jobs.add(new Job("Noser", "Office", resume.getResumes().get(1), "Administration Clerk"));
        jobs.add(new Job("UBS", "Office", resume.getResumes().get(2), "Bank Clerk"));
        jobs.add(new Job("Google", "IT", resume.getResumes().get(3), "System Developer"));
    }

    public void getITJobs() {
        initializeJobs();
        String jobOrientation = "IT";
        for (int i = 0; i < jobs.size(); i++) {
            if (jobs.get(i).getJobOrientation().equals(jobOrientation)) {
                System.out.println("Workplace: "+ jobs.get(i).workPlace + " as " + jobs.get(i).jobName + " ");
            }
        }
    }

    public void getClerkJobs() {
        initializeJobs();
        String jobOrientation = "Office";
        for (int i = 0; i < jobs.size(); i++) {
            if (jobs.get(i).getJobOrientation().equals(jobOrientation)) {
                System.out.println("Workplace: "+ jobs.get(i).workPlace + " as " + jobs.get(i).jobName + " ");
            }
        }
    }

    public String getJobOrientation() {
        return jobOrientation;
    }

    public void setJobOrientation(String jobOrientation) {
        this.jobOrientation = jobOrientation;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
