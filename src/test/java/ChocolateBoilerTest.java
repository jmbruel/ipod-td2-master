import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class ChocolateBoilerTest {

    @Test
    public void twoChocolateBoilersMightBlowTheFactory() {
        ChocolateBoiler c1 = new ChocolateBoiler();
        ChocolateBoiler c2 = new ChocolateBoiler();

        String result = new String();
        result = c1.fill() + "/" + c1.boil() + "/" + c2.fill();
        String unExpected = "Filling/Boiling/Filling";
        assertFalse(unExpected.equals(result));
    }
}