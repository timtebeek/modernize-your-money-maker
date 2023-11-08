package com.github.timtebeek.moneymaker;

import lombok.Value;

@Value
public class Money {
    String currency;
    int amount;
}
