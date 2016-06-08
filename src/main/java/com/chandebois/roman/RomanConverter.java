package com.chandebois.roman;

/**
 * Created by nonok on 05/05/2016.
 */
public class RomanConverter {


    public String convert(int numberToConvert) {
        StringBuilder sbLitteralRoman = new StringBuilder();

        for (int i = 1000; i >= 1; i = i / 10) {// We loops for thousands, hundreds, tens and units
            int unitExtracted = extractUnitFromNumber(numberToConvert, i);

            if (unitExtracted == 4) {
                sbLitteralRoman.append(RomanLitteralEnum.resolveEnumByNumber(i).getCode());
                sbLitteralRoman.append(RomanLitteralEnum.resolveEnumByNumber(i * 5).getCode());
                unitExtracted = unitExtracted - 4;
            } else if (unitExtracted == 9) {
                sbLitteralRoman.append(RomanLitteralEnum.resolveEnumByNumber(i).getCode());
                sbLitteralRoman.append(RomanLitteralEnum.resolveEnumByNumber(i * 10).getCode());
                unitExtracted = unitExtracted - 9;
            } else if (unitExtracted >= 5) {
                sbLitteralRoman.append(RomanLitteralEnum.resolveEnumByNumber(i * 5).getCode());
                unitExtracted = unitExtracted - 5;
            }

            while (unitExtracted > 0) {
                sbLitteralRoman.append(RomanLitteralEnum.resolveEnumByNumber(i).getCode());
                unitExtracted = unitExtracted - 1;
            }
        }

        return sbLitteralRoman.toString();
    }

    private int extractUnitFromNumber(int numberToConvert, int i) {
        return (numberToConvert % (10 * i)) / i;
    }
}
