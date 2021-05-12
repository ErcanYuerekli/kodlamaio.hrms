package ercanyurekli.kodlamaio.hrms.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
public abstract class Person extends User {
    @Column(name = "first_name", length = 25)
    private String firstName;

    @Column(name = "last_name", length = 25)
    private String lastName;

    @Column(name = "birthday")
    private LocalDate birthDay;

    @Column(name = "national_identety", length = 11, unique = true) //unique heist die nummer darf es nur einmal geben
    private String nationalIdentity;
}
