package service;

import model.JobApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.JobApplicationRepository;

import java.util.Optional;

@Service
public class JobApplicationService {

    private final JobApplicationRepository jobApplicationRepository;

    @Autowired
    public JobApplicationService(JobApplicationRepository jobApplicationRepository){
        this.jobApplicationRepository = jobApplicationRepository;
    }

    public JobApplication createJobApplication(JobApplication application){

        JobApplication newApplication = new JobApplication();

        //fill in the rest as it gets used, these 3 are required for the minimal viable product
        newApplication.setCompanyName(application.getCompanyName());
        newApplication.setJobTitle(application.getJobTitle());
        newApplication.setLocation(application.getLocation());


        jobApplicationRepository.save(newApplication);

        return newApplication;
    }

    public JobApplication updateJobApplication(long jobApplicationId, JobApplication application){
        if(application != null){
            Optional<JobApplication> existingApplication = jobApplicationRepository.findById(jobApplicationId);
            if (existingApplication.isPresent()){
                JobApplication updated = existingApplication.get();

                updated.setCompanyName(application.getCompanyName());
                updated.setJobTitle(application.getJobTitle());
                updated.setLocation(application.getLocation());
                jobApplicationRepository.save(updated);

            }
        }
        return application;
    }


    public void deleteJobApplication(long applicationId){
        Optional<JobApplication> possibleApplication = jobApplicationRepository.findById(applicationId);
        if(possibleApplication.isPresent()){
            jobApplicationRepository.delete(possibleApplication.get());
        }
    }
}
