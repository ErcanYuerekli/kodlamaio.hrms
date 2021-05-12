package ercanyurekli.kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "phone_number")
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "phone_number")
    private String phoneNumber;
}
