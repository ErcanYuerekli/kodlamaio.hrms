package ercanyurekli.kodlamaio.hrms.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Company extends User{

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "website")
    private String website;

    @OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private List<PhoneNumber> phoneNumbers;
}
