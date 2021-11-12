package mz.co.fnb.manager.impl;

import mz.co.fnb.database.entity.ExchangeRate;
import mz.co.fnb.database.enuum.ResultEnum;
import mz.co.fnb.domain.response.ExchangeRateResponse;
import mz.co.fnb.domain.response.Rates;
import mz.co.fnb.manager.ExchangeManager;
import mz.co.fnb.manager.util.Utils;
import mz.co.fnb.services.ExchangeRateService;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ExchangeManagerImpl implements ExchangeManager {

    private final ExchangeRateService exchangeRateService;

    public ExchangeManagerImpl(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    @Override
    public ExchangeRateResponse getRates(String provider, String baseCurrency) {
        List<ExchangeRate> exchangeRates = exchangeRateService.getRates(provider, baseCurrency);
        String dateTime = Utils.dateFormat(new Date(),"E, dd MMM yyyy HH:mm:ss");

        if (exchangeRates.isEmpty()) return ExchangeRateResponse.builder()
                .provider(provider)
                .baseCurrency(baseCurrency)
                .dateTime(dateTime)
                .result(String.format(ResultEnum.ERROR.getCode().toLowerCase(), baseCurrency, provider))
                .build();

        List<Rates> rates = exchangeRates.stream().map(rate -> Rates.builder()
                .sale(rate.getSale())
                .purchase(rate.getPurchase())
                .currency(rate.getCurrency().getAcronym())
                .build()).collect(Collectors.toList());

        return ExchangeRateResponse.builder()
                .rates(rates)
                .provider(provider)
                .baseCurrency(baseCurrency)
                .dateTime(dateTime)
                .result(ResultEnum.SUCCESS.getCode().toLowerCase())
                .build();
    }
}
