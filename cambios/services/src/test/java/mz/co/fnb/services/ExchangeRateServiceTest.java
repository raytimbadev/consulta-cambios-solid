package mz.co.fnb.services;

import mz.co.fnb.database.entity.ExchangeRate;
import mz.co.fnb.services.config.AbstractServiceTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@EnableJpaRepositories("mz.co.fnb.database.repository")
@EntityScan("mz.co.fnb.database")
@EnableAutoConfiguration
public class ExchangeRateServiceTest extends AbstractServiceTest {

    @Autowired
    private ExchangeRateService exchangeRateService;

    @Test
    public void getRates() {
        List<ExchangeRate> exchangeRates = exchangeRateService.getRates("fnb", "MZN");
        assertNotNull(exchangeRates);
    }

}
