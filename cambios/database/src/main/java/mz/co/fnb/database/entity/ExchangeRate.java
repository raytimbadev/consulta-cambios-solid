package mz.co.fnb.database.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "exchange_rate")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeRate extends BaseEntity<String> implements Serializable {

    private Double purchase;
    private Double sale;
    @OneToOne
    @JoinColumn(name = "currency_id", referencedColumnName = "id")
    private Currency currency;
    @OneToOne
    @JoinColumn(name = "baseCurrency", referencedColumnName = "id")
    private Currency baseCurrency;
    @OneToOne
    @JoinColumn(name = "provider_id", referencedColumnName = "id")
    private Provider provider;

}

