package mz.co.fnb.services.impl;

import mz.co.fnb.database.entity.Currency;
import mz.co.fnb.database.repository.CurrencyRepository;
import mz.co.fnb.services.CurrencyService;
import org.springframework.stereotype.Component;

@Component
public class CurrencyServiceImpl implements CurrencyService {

    private final CurrencyRepository currencyRepository;

    public CurrencyServiceImpl(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    @Override
    public Currency save(Currency currency) {
        return currencyRepository.save(currency);
    }
}
