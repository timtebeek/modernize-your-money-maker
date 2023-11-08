package com.github.timtebeek.moneymaker;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestTwo {

    @Test
    public void testMoneyAmount() {
        Money money = MoneyMaker.makeMoney();
        assertThat(money, is(not(nullValue())));
        assertThat(money.amount, is(100.0f));
        assertThat(money, is(not(equalTo(99.99f))));
    }

}

