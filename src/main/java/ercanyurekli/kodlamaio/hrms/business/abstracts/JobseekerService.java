package ercanyurekli.kodlamaio.hrms.business.abstracts;

import ercanyurekli.kodlamaio.hrms.dataAccess.abstracts.JobseekerDao;
import ercanyurekli.kodlamaio.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobseekerService {
    List<JobSeeker> getAll();
}
