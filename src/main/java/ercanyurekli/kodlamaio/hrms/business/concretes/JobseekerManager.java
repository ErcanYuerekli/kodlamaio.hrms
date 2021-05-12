package ercanyurekli.kodlamaio.hrms.business.concretes;

import ercanyurekli.kodlamaio.hrms.business.abstracts.JobseekerService;
import ercanyurekli.kodlamaio.hrms.dataAccess.abstracts.JobseekerDao;
import ercanyurekli.kodlamaio.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobseekerManager implements JobseekerService {

    @Autowired
    public JobseekerDao jobSeekerDao;

    @Override
    public List<JobSeeker> getAll(){ return this.jobSeekerDao.findAll();
    }
}
