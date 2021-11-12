package mz.co.fnb.web.controller;

import mz.co.fnb.domain.response.ExchangeRateResponse;
import mz.co.fnb.manager.ExchangeManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cambio")
public class ExchangeRateController {

    private final ExchangeManager exchangeManager;

    public ExchangeRateController(ExchangeManager exchangeManager) {
        this.exchangeManager = exchangeManager;
    }

    @GetMapping("{provider}")
    public ResponseEntity<ExchangeRateResponse> getRates(@PathVariable("provider") String provider,
                                                                    @RequestParam("baseCurrency") String baseCurrency) {
        ExchangeRateResponse response = exchangeManager.getRates(provider.toUpperCase(), baseCurrency.toUpperCase());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
