package controller;

import model.JobApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.JobApplicationRepository;
import service.JobApplicationService;

@RestController
@RequestMapping("/jobApplications")
public class JobApplicationController {

    private final JobApplicationService jobApplicationService;

    @Autowired
    JobApplicationController(JobApplicationService jobApplicationService){
        this.jobApplicationService = jobApplicationService;
    }

    @PostMapping
    public JobApplication createJobApplication(@RequestBody JobApplication jobApplication) {
        return jobApplicationService.createJobApplication(jobApplication);
    }

    @PutMapping("/{applicationId}")
    public JobApplication updateJobApplication(@PathVariable("applicationId") long applicationId, @RequestBody JobApplication updatedApplication) {
        return jobApplicationService.updateJobApplication(applicationId, updatedApplication);
    }

    @DeleteMapping("/{applicationId}")
    public void deleteJobApplication(@PathVariable long applicationId) {
        jobApplicationService.deleteJobApplication(applicationId);
    }
}
