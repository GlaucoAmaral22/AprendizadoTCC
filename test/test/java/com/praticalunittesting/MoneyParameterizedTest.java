/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.com.praticalunittesting;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.junit.runner.RunWith;
import src.main.com.praticalunittesting.Money;

/**
 *
 * @author glauc
 */
@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedTest {

    private static final Object[] getMoney() {
        return new Object[]{
            new Object[]{10, "USD"},
            new Object[]{20, "EUR"}
        };
    }

    private static final Object[] getMoney2() {
        return $(
                $(10, "USD"),
                $(20, "EUR")
        );
    }

    @Test
    @Parameters(method = "getMoney")
    public void constructorShouldSetAmountAndCurrency(int amount, String currency) {
        Money m = new Money(amount, currency);
        assertEquals(amount, m.getAmount());
        assertEquals(currency, m.getCurrency());

    }

    @Test
    @Parameters(method = "getMoney2")
    public void constructorShouldSetAmountAndCurrency2(int amount, String currency) {
        Money m = new Money(amount, currency);
        assertEquals(amount, m.getAmount());
        assertEquals(currency, m.getCurrency());
    }

}
