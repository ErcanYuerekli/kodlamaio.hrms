package ercanyurekli.kodlamaio.hrms.dataAccess.abstracts;


import ercanyurekli.kodlamaio.hrms.entities.concretes.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDao extends JpaRepository<Company, Integer> {
}
