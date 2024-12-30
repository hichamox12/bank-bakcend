package ma.mundia.ebankingback.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.mundia.ebankingback.enums.OperationType;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class AccountOperation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate;
    private double amount ;
    @Enumerated(EnumType.STRING) // par defaul => ORDINAL
    private OperationType type;
    private String description;
    @ManyToOne
    private BankAccount bankAccount;


}
