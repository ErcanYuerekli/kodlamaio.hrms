package ercanyurekli.kodlamaio.hrms.dataAccess.abstracts;


import ercanyurekli.kodlamaio.hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
