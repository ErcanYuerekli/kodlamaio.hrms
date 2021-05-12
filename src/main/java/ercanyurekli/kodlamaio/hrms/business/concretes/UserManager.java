package ercanyurekli.kodlamaio.hrms.business.concretes;

import ercanyurekli.kodlamaio.hrms.business.abstracts.UserService;
import ercanyurekli.kodlamaio.hrms.dataAccess.abstracts.UserDao;
import ercanyurekli.kodlamaio.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    @Autowired
    public UserDao userDao;

    @Override
    public List<User> getAll() {return this.userDao.findAll();}
}
