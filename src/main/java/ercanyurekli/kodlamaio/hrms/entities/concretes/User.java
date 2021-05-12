package ercanyurekli.kodlamaio.hrms.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
@NoArgsConstructor
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    private String eMail;

    @Column(name = "passwort")
    private String password;

    @Column(name = "is_verified")
    private boolean isVerified;

}
