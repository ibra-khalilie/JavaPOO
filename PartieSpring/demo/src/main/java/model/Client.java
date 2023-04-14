package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "client")
public class Client {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "nom")
        private String nom;

        @Column(name = "prenom")
        private String prenom;

        @Column(name = "adresse")
        private String adresse;

        @Column(name = "telephone")
        private String telephone;

        @OneToOne(mappedBy = "client")
        private CompteBancaire compteBancaire;


}
