
import org.junit.Test;

import static org.junit.Assert.*;

public class WeightProductsTest {
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullName() {
        WeightProducts product = new WeightProducts(null, "description string");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullDescription() {
        WeightProducts product = new WeightProducts("Name", null);
    }


    @Test public void testEquals(){
        WeightProducts product = new WeightProducts("Name","description string");
        WeightProducts product2 = new WeightProducts("Name","description string");
        boolean result = product.equals(product2);
        assertTrue(result);
    }
    @Test public void TestToString(){
        WeightProducts product = new WeightProducts("Name","description string");
        String expected = "Весовой товар: \n" +
                "Имя товара: 'Name', описание товара: 'description string'";
        String result = product.toString();
        assertEquals(expected, result);
    }
}