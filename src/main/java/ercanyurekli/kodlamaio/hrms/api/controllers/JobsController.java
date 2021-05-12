package ercanyurekli.kodlamaio.hrms.api.controllers;


import ercanyurekli.kodlamaio.hrms.business.abstracts.JobService;
import ercanyurekli.kodlamaio.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

    @Autowired
    public JobService jobService;

    @GetMapping("/getall")
        public List<Job> getAll() {
        return this.jobService.getAll();

    }
}
