package com.in28minutes.exception.handling;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that){
        if(!this.currency.equals(that.currency))
            throw new RuntimeException("Currencies Don't Match");
        this.amount = this.amount + that.amount;
    }
}

public class ThrowingExceptionRunner {
    public static void main(String[] args) {

        Amount amount = new Amount("USD",10);
        Amount amount1 = new Amount("EUR",20);
        amount.add(amount1);

    }
}
