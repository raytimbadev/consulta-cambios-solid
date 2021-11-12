package mz.co.fnb.database.repository;

import mz.co.fnb.database.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency,Long> {
}
