package ercanyurekli.kodlamaio.hrms.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "job_seekers")
@NoArgsConstructor
public class JobSeeker extends Person{


}
