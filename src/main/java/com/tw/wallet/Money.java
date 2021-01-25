package com.tw.wallet;

import static com.tw.wallet.Currency.DOLLAR;
import static com.tw.wallet.Currency.RUPEE;

public class Money {

    private final double money;
    private final Currency currency;

    private Money(double money, Currency currency) {
        this.money = money;
        this.currency = currency;
    }

    public static Money rupee(double rupees) {
        return new Money(rupees, RUPEE);
    }

    public static Money dollar(double dollars) {
        return new Money(dollars, DOLLAR);
    }

    public double moneyInBaseCurrency(){
        return currency.moneyInBaseUnit(this.money);
    }
}
