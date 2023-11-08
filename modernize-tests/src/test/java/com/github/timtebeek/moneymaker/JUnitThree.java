package com.github.timtebeek.moneymaker;

public class JUnitThree extends junit.framework.TestCase {

    // Look ma, no annotations!
    // The test prefix is enough.
    public void testMoneyAmount() {
        Money money = MoneyMaker.makeMoney();
        // Nor static imports!
        assertNotNull(money);
        assertEquals(100.0f, money.amount, 0.0f);
    }

}
