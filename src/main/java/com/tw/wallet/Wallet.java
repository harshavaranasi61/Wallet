package com.tw.wallet;

import java.util.List;

public class Wallet {

    private double totalAmountAvailableInWallet;
    private final double RUPEE_TO_DOLLAR_CONVERSION_FACTOR = 74.85;

    public void addMoneyToWallet(List<Money> moneyList) {
        moneyList.forEach(money -> totalAmountAvailableInWallet += money.moneyInBaseCurrency());
    }

    public double totalInDollars(){
        return totalAmountAvailableInWallet/RUPEE_TO_DOLLAR_CONVERSION_FACTOR;
    }

    public double totalInRupees(){
        return totalAmountAvailableInWallet;
    }
}
