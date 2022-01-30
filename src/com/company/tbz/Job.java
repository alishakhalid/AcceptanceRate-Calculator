package com.company.tbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    public Job(){}

    public void initializeJobs() {
        resume.initializeResumes();
        jobs.add(new Job("Noser", "IT", resume.getResumes().get(0), "Software Developer"));
        jobs.add(new Job("Noser", "Office", resume.getResumes().get(1), "Clerk"));
        jobs.add(new Job("UBS", "Office",  resume.getResumes().get(2), "Clerk"));
        jobs.add(new Job("Google", "IT",  resume.getResumes().get(3), "Software Developer"));
    }

    public void getITJobs(){
        System.out.println("hello job");
        initializeJobs();

    }
    public Stream<Job> getClerkJobs(){
        return jobs.stream().filter(job -> job.jobOrientation.contains("Office"));
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
