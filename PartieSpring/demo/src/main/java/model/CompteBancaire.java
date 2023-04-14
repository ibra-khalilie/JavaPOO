package model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "compte_bancaire")
public class CompteBancaire {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "solde")
        private Double solde;

        @OneToOne
        @JoinColumn(name = "client_id", referencedColumnName = "id")
        private Client client;
}
