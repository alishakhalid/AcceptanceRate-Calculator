package com.company.tbz;


public class Job {
    private String workPlace;
    private Resume resume;
    private String jobName;
    private Skill skill;

    public Job(String workPlace, Resume resume, String jobName, Skill skill) {
        this.workPlace = workPlace;
        this.resume = resume;
        this.jobName = jobName;
        this.skill = skill;
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

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
