package mz.co.fnb.domain.response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class ExchangeRateResponse implements Serializable {

    private String result;
    private String provider;
    private String dateTime;
    private String baseCurrency;
    private List<Rates> rates;

}
