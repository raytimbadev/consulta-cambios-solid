package mz.co.fnb.services.impl;

import mz.co.fnb.database.entity.ExchangeRate;
import mz.co.fnb.database.repository.ExchangeRateRepository;
import mz.co.fnb.services.ExchangeRateService;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class ExchangeRateServiceImpl implements ExchangeRateService {

    private final ExchangeRateRepository exchangeRateRepository;

    public ExchangeRateServiceImpl(ExchangeRateRepository exchangeRateRepository) {
        this.exchangeRateRepository = exchangeRateRepository;
    }

    @Override
    public List<ExchangeRate> getRates(String provider, String baseCurrency) {
        return exchangeRateRepository.getRates(provider, baseCurrency);
    }

    @Transactional
    public ExchangeRate save(ExchangeRate exchangeRate) {
        return exchangeRateRepository.save(exchangeRate);
    }

}
