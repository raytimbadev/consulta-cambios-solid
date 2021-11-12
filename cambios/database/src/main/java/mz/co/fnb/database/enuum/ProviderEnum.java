package mz.co.fnb.database.enuum;

public enum ProviderEnum {

    FNB("FNB");

    private String value;

    ProviderEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
