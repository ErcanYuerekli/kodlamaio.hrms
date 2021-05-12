package ercanyurekli.kodlamaio.hrms.business.abstracts;

import ercanyurekli.kodlamaio.hrms.entities.concretes.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
}
