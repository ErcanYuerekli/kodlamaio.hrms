package ercanyurekli.kodlamaio.hrms.dataAccess.abstracts;

import ercanyurekli.kodlamaio.hrms.entities.concretes.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDao extends JpaRepository<Personal, Integer> {
}
