package mz.co.fnb.manager;

import mz.co.fnb.domain.response.ExchangeRateResponse;
import mz.co.fnb.manager.config.AbstractManagerTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@EnableJpaRepositories("mz.co.fnb.database.repository")
@EntityScan("mz.co.fnb.database")
@EnableAutoConfiguration
public class ExchangeRateServiceTest extends AbstractManagerTest {

    @Autowired
    private ExchangeManager exchangeManager;

    @Test
    public void getRates(){
        ExchangeRateResponse exchangeRates = exchangeManager.getRates("fnb","MZN");
        assertNotNull(exchangeRates);
    }

}
