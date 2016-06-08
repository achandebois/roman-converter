package com.chandebois.roman;

/**
 * Created by nonok on 05/05/2016.
 */
public enum RomanLitteralEnum {
    ONE_ROMAN("I", 1),
    FIVE_ROMAN("V", 5),
    TEN_ROMAN("X", 10),
    FIFTY_ROMAN("L", 50),
    ONE_HUNDRED_ROMAN("C", 100),
    HALF_THOUSAND_ROMAN("D", 500),
    ONE_THOUSAND_ROMAN("M", 1000),;

    private String code;
    private int number;

    RomanLitteralEnum(String code, int number) {
        this.code = code;
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public int getNumber() {
        return number;
    }

    public static RomanLitteralEnum resolveEnumByNumber(int number) {
        RomanLitteralEnum romanLitteralEnumFound = null;
        for (RomanLitteralEnum romanLitteralEnum : RomanLitteralEnum.values()) {
            if (romanLitteralEnum.getNumber() == number) {
                romanLitteralEnumFound = romanLitteralEnum;
            }
        }
        return romanLitteralEnumFound;
    }
}
