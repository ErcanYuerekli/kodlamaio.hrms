package ercanyurekli.kodlamaio.hrms.business.concretes;


import ercanyurekli.kodlamaio.hrms.business.abstracts.CompanyService;
import ercanyurekli.kodlamaio.hrms.dataAccess.abstracts.CompanyDao;
import ercanyurekli.kodlamaio.hrms.entities.concretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyManager implements CompanyService {
    @Autowired
    private CompanyDao companyDao;
    @Override
    public List<Company> getAll() {
        return this.companyDao.findAll();
    }
}
