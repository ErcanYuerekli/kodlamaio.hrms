package ercanyurekli.kodlamaio.hrms.api.controllers;

import ercanyurekli.kodlamaio.hrms.business.abstracts.UserService;
import ercanyurekli.kodlamaio.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    public UserService userService;

    @GetMapping("/getall")
    public List<User> getAll(){ return this.userService.getAll();}



}
