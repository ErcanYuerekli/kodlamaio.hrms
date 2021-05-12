package ercanyurekli.kodlamaio.hrms.api.controllers;


import ercanyurekli.kodlamaio.hrms.business.abstracts.CompanyService;
import ercanyurekli.kodlamaio.hrms.entities.concretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/getall")
        public List<Company> getAll(){
            return this.companyService.getAll();
    }
}
