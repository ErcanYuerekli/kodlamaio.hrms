package ercanyurekli.kodlamaio.hrms.api.controllers;

import ercanyurekli.kodlamaio.hrms.business.abstracts.PersonalService;
import ercanyurekli.kodlamaio.hrms.entities.concretes.Personal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/personals")
public class PersonalsController {

    @Autowired
    public PersonalService personalService;

    @GetMapping("/getall")
    public List<Personal> getAll(){
        return this.personalService.getAll();
    }
}
