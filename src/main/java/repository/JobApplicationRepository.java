package repository;

import model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {

    List<JobApplication> findByCompanyName(String name);

    List<JobApplication> findByJobTitle(String name);

    List<JobApplication> findByExperienceLevel(String name);

    List<JobApplication> findByEmploymentType(String name);

    List<JobApplication> findByOnsitePolicy(String name);

    List<JobApplication> findByApplicationStatus(String name);

    //date range

    //response date

    //complex queries??
}
