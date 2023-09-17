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
}
