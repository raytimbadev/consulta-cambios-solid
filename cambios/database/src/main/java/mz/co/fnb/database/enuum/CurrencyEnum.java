package mz.co.fnb.database.enuum;

public enum CurrencyEnum {

    MZN("MZN"),
    USD("USD"),
    GBP("GBP"),
    EUR("EUR"),
    ZAR("ZAR");

    private String value;

    CurrencyEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
