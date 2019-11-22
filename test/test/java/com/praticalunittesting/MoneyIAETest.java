/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.com.praticalunittesting;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import src.main.com.praticalunittesting.Money;

/**
 *
 * @author glauc
 */
@RunWith(JUnitParamsRunner.class)
public class MoneyIAETest {

    public final static int VALID_AMOUNT = 5;
    public final static String VALID_CURRENCY = "USD";

    private static final Object[] getInvalidAmount() {
        return new Integer[][]{
            {-12387},
            {-5},
            {-1}
        };
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidAmount")
    public void constructorShouldThrowIAEForInvalidAmount(int invalidAmount) {
        new Money(invalidAmount, VALID_CURRENCY);
    }

    private static final Object[] getInvalidCurrency() {
        return new String[][]{{null}, {""}};
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidCurrency")
    public void constructorShouldThrowIAEForInvalidCurrency(
            String invalidCurrency) {
        new Money(VALID_AMOUNT, invalidCurrency);
    }

}
