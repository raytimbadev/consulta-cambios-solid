package mz.co.fnb.services.util;

import mz.co.fnb.database.entity.Currency;
import mz.co.fnb.database.entity.ExchangeRate;
import mz.co.fnb.database.entity.Provider;
import mz.co.fnb.database.enuum.CurrencyEnum;
import mz.co.fnb.database.enuum.ProviderEnum;
import mz.co.fnb.services.CurrencyService;
import mz.co.fnb.services.ExchangeRateService;
import mz.co.fnb.services.ProviderService;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInit {
    private final CurrencyService currencyService;
    private final ProviderService providerService;
    private final ExchangeRateService exchangeRateService;

    public DatabaseInit(CurrencyService currencyService, ProviderService providerService,
                        ExchangeRateService exchangeRateService) {
        this.currencyService = currencyService;
        this.providerService = providerService;
        this.exchangeRateService = exchangeRateService;
    }


    public void dummyData() {

        Currency mzn = currencyService.save(Currency.builder()
                .acronym(CurrencyEnum.MZN.getValue())
                .build());

        Currency gbp = currencyService.save(Currency.builder()
                .acronym(CurrencyEnum.GBP.getValue())
                .build());

        Currency zar = currencyService.save(Currency.builder()
                .acronym(CurrencyEnum.ZAR.getValue())
                .build());

        Currency eur = currencyService.save(Currency.builder()
                .acronym(CurrencyEnum.EUR.getValue())
                .build());

        Currency usd = currencyService.save(Currency.builder()
                .acronym(CurrencyEnum.USD.getValue())
                .build());

        Provider provider = providerService.save(Provider.builder()
                .acronym(ProviderEnum.FNB.getValue())
                .build());

        exchangeRateService.save(ExchangeRate.builder()
                .baseCurrency(mzn)
                .provider(provider)
                .currency(gbp)
                .sale(86.540)
                .purchase(84.850)
                .build());

        exchangeRateService.save(ExchangeRate.builder()
                .baseCurrency(mzn)
                .provider(provider)
                .currency(eur)
                .sale(74.010)
                .purchase(72.570)
                .build());

        exchangeRateService.save(ExchangeRate.builder()
                .baseCurrency(mzn)
                .provider(provider)
                .currency(usd)
                .sale(64.460)
                .purchase(63.200)
                .build());

        exchangeRateService.save(ExchangeRate.builder()
                .baseCurrency(mzn)
                .provider(provider)
                .currency(zar)
                .sale(4.180)
                .purchase(4.100)
                .build());
    }

}
