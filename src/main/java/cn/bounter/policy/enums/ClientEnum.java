package cn.bounter.policy.enums;

/**
 * 客户枚举
 */
public enum ClientEnum {
    SIMON(1,"Simon"),
    SUSAN(2,"Susan");

    private Integer value;

    private String name;

    private ClientEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
