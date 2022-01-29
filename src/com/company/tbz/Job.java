package com.company.tbz;
import java.util.ArrayList;

public class Job {
    private String workPlace;
    private String jobOrientation;
    private Resume resume;
    private String jobName;

    public Job(String workPlace, String jobOrientation, Resume resume, String jobName) {
        this.workPlace = workPlace;
        this.jobOrientation = jobOrientation;
        this.resume = resume;
        this.jobName = jobName;

    }

    public ArrayList<Job> initializeJobs(ArrayList<Job> jobs) {
        jobs.add(new Job("Noser", "IT", resume.getResumes().get(0), "Software Developer"));
        jobs.add(new Job("Noser", "Office", resume.getResumes().get(1), "Clerk"));
        jobs.add(new Job("UBS", "Office",  resume.getResumes().get(2), "Clerk"));
        jobs.add(new Job("Google", "IT",  resume.getResumes().get(3), "Software Developer"));

        return jobs;
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
