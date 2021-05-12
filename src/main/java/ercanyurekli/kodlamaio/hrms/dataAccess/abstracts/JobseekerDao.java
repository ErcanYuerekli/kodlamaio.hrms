package ercanyurekli.kodlamaio.hrms.dataAccess.abstracts;


import ercanyurekli.kodlamaio.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobseekerDao extends JpaRepository<JobSeeker, Integer> {
}
