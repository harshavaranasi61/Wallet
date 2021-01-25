package com.tw.wallet;

public enum Currency {
    RUPEE(1),
    DOLLAR(74.85);

    private final double baseUnitConversionFactor;

    Currency(double baseUnitConversionFactor) {
        this.baseUnitConversionFactor = baseUnitConversionFactor;
    }

    public double moneyInBaseUnit(double money) {
        return money * baseUnitConversionFactor;
    }
}
