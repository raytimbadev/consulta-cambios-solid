package mz.co.fnb.manager;

import mz.co.fnb.domain.response.ExchangeRateResponse;

public interface ExchangeManager {

    ExchangeRateResponse getRates(String provider, String baseCurrency);
}
