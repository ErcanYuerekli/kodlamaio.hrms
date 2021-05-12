package ercanyurekli.kodlamaio.hrms.business.concretes;

import ercanyurekli.kodlamaio.hrms.business.abstracts.JobService;
import ercanyurekli.kodlamaio.hrms.dataAccess.abstracts.JobDao;
import ercanyurekli.kodlamaio.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {

    @Autowired
    public JobDao jobDao;

    @Override
    public List<Job> getAll() {
        return this.jobDao.findAll();
    }
}
