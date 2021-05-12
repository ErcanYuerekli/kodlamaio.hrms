package ercanyurekli.kodlamaio.hrms.business.concretes;

import ercanyurekli.kodlamaio.hrms.business.abstracts.PersonalService;
import ercanyurekli.kodlamaio.hrms.dataAccess.abstracts.PersonalDao;
import ercanyurekli.kodlamaio.hrms.entities.concretes.Personal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalManager implements PersonalService {


        @Autowired
        public PersonalDao personalDao;

        @Override
        public List<Personal> getAll(){ return this.personalDao.findAll();}
}
