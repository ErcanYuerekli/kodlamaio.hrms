package ercanyurekli.kodlamaio.hrms.api.controllers;


import ercanyurekli.kodlamaio.hrms.business.abstracts.JobseekerService;
import ercanyurekli.kodlamaio.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobseekers")
public class JobseekersController {

    @Autowired
    public JobseekerService jobseekerService;

    @GetMapping("/getall")
    public List<JobSeeker> getAll() {
        return this.jobseekerService.getAll();
    }
}
