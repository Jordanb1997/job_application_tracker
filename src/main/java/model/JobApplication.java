package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
@Table(name  = "applications")
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_id")
    Long id;

    @NotNull
    @Column(name="company_name")
    String companyName;

    @NotNull
    @Column(name="job_title")
    String jobTitle;

    @NotNull
    @Column(name="job_location")
    String location;

    //split into own table?
    @Column(name="experience_level")
    String experienceLevel;

    @Column(name="salary")
    int salary;

    //split into own table?
    @Column(name="employment_type")
    String employmentType;

    //split into own table?
    @Column(name="onsite_policy")
    String onsitePolicy;

    @Column(name="application_date")
    Date applicationDate;

    @Column(name="description")
    String description;

    //split into own table
    @Column(name="application_status")
    String applicationStatus;

    @Column(name="response_date")
    Date responseDate;

    @Column(name="notes")
    String notes;

    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getOnsitePolicy() {
        return onsitePolicy;
    }

    public void setOnsitePolicy(String onsitePolicy) {
        this.onsitePolicy = onsitePolicy;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


}
