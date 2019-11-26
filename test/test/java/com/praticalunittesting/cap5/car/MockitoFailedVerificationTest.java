package test.java.com.praticalunittesting.cap5.car;

import com.practicalunittesting.cap5.car.Car;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MockitoFailedVerificationTest {

    private Car myFerrari = mock(Car.class);

    @Test
    public void testVerificationFailure() {
        myFerrari.needsFuel();

        verify(myFerrari).getEngineTemperature();
    }
}
