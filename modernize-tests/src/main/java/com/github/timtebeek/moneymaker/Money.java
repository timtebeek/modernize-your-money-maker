package com.github.timtebeek.moneymaker;

public class Money {
    // Nothing can go wrong with floats, right?
    float amount;

    public Money(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "com.github.timtebeek.moneymaker.Money{" +
                "amount=" + amount +
                '}';
    }
}
