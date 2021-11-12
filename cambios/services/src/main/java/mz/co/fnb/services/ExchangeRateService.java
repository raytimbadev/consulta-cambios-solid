package mz.co.fnb.services;

import mz.co.fnb.database.entity.ExchangeRate;

import java.util.List;

public interface ExchangeRateService {

    List<ExchangeRate> getRates(String provider,String baseCurrency);

    ExchangeRate save(ExchangeRate exchangeRate);

}
