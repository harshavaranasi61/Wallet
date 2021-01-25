package com.tw.wallet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {

    @Test
    void checkWhetherTotalInRupeesIsCorrectOrNot() {
        List<Money> moneyList = new ArrayList<>();
        moneyList.add(Money.rupee(50.0));
        moneyList.add(Money.dollar(1));
        Wallet wallet = new Wallet();

        wallet.addMoneyToWallet(moneyList);

        assertEquals(124.85,wallet.totalInRupees(),0.001);
    }

    @Test
    void checkWhetherTotalInDollarsIsCorrectOrNot() {
        List<Money> moneyList = new ArrayList<>();
        moneyList.add(Money.rupee(149.7));
        moneyList.add(Money.dollar(2));
        moneyList.add(Money.rupee(74.85));
        Wallet wallet = new Wallet();

        wallet.addMoneyToWallet(moneyList);

        assertEquals(5,wallet.totalInDollars(),0.001);
    }
}
