package ercanyurekli.kodlamaio.hrms.business.abstracts;

import ercanyurekli.kodlamaio.hrms.entities.concretes.Personal;

import java.util.List;

public interface PersonalService {
    List<Personal> getAll();
}
