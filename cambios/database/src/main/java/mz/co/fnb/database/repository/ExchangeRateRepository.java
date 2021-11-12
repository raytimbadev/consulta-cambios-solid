package mz.co.fnb.database.repository;

import mz.co.fnb.database.entity.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate,Long> {

    @Query("select u from ExchangeRate u where u.provider.acronym = ?1 and u.baseCurrency.acronym = ?2")
    List<ExchangeRate> getRates(String provider, String baseCurrency);

}
