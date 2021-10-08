package com.company;

public class Trader {
    private String Name;
    private Account account;

    public void addTrade(Trade trade){
        float newTotalValue = account.getTotalValueTrade() + trade.getPrice()* trade.getQuantity();
        account.setTotalValueTrade(newTotalValue);
    }
}

