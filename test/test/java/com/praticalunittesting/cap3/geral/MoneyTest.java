package test.java.com.praticalunittesting.cap3.geral;

import org.junit.Assert;
import org.junit.Test;
import com.practicalunittesting.chp03.geral.Money;



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
