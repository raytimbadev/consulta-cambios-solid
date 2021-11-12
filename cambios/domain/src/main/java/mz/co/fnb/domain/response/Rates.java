package mz.co.fnb.domain.response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Rates implements Serializable {

    private Double purchase;
    private Double sale;
    private String currency;
}
