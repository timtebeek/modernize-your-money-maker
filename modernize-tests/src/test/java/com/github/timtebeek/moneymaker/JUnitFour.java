package com.github.timtebeek.moneymaker;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JUnitFour {

    @Test
    public void testMoneyAmount() {
        Money money = MoneyMaker.makeMoney();
        assertNotNull(money);
        assertEquals(100.0f, money.amount, 0.0f);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Money money = MoneyMaker.makeMoney();
        float error = (int) money.amount / 0;
    }

    @Test(timeout = 1000)
    public void testTimeout() throws InterruptedException {
        Thread.sleep(500);
    }

    @Test
    public void testMoneyAmountWithMessage() {
        Money money = MoneyMaker.makeMoney();
        assertNotNull("Money should not be null", money);
        assertEquals("Money amount should be 100.0f", 100.0f, money.amount, 0.0f);
    }

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void testMoneyAmountWithMessageSupplier() throws Exception {
        File file = folder.newFile("account.txt");
        Money money = MoneyMaker.makeMoney();
        Files.write(file.toPath(), String.valueOf(money.amount).getBytes());
        String read = new String(Files.readAllBytes(file.toPath()));
        assertEquals("Money amount should be 100.0f", "100.0", read);
    }

}
