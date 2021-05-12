package ercanyurekli.kodlamaio.hrms.business.abstracts;

import ercanyurekli.kodlamaio.hrms.entities.concretes.Job;

import java.util.List;

public interface JobService {
    List<Job> getAll();
}
