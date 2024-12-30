package ma.mundia.ebankingback.repositories;

import ma.mundia.ebankingback.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
