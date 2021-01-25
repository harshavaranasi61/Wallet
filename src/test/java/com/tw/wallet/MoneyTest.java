package com.tw.wallet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void createRupeesWithValueOf50() {
        Money fiftyRupees = Money.rupee(50.0);

        assertEquals(50.0,fiftyRupees.moneyInBaseCurrency());
    }
}
