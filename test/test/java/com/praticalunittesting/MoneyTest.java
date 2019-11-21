package test.java.com.praticalunittesting;

import org.junit.Assert;
import org.junit.Test;
import src.main.com.praticalunittesting.Money;



/**
 *
 * @author glauc
 */
public class MoneyTest {
    @Test
    public void constructorShouldSetAmountAndCurrency(){
        Money m = new Money(100, "USD");
        Assert.assertEquals(100, m.getAmount());
        Assert.assertEquals("USD", m.getCurrency());
    }
    
    @Test
    public void constructorShouldSetAmountAndCurrencyWrongWay(){
        Money m = new Money(100, "USD");
        Assert.assertEquals(100, m.getAmount());
        Assert.assertEquals("USD", m.getCurrency());
        
        m = new Money(20, "EUR");
        Assert.assertEquals(20, m.getAmount());
        Assert.assertEquals("EUR", m.getCurrency());
    }
    
    
    
}
