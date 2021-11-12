package mz.co.fnb.database.enuum;

public enum ResultEnum {

    SUCCESS("SUCCESS"),
    ERROR("O cambio do %s não esta disponivel no provedor %s");

    private String value;

    ResultEnum(String value) {
        this.value = value;
    }

    public String getCode() {
        return this.value;
    }
}
