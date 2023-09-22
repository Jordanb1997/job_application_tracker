package controller;

import model.JobApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import repository.JobApplicationRepository;
import service.JobApplicationService;

import javax.print.attribute.standard.Media;
import java.util.List;

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

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<JobApplication> getJobApplications(){
        return jobApplicationService.getAllJobApplications();
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
