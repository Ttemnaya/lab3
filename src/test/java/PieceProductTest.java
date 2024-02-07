
import org.junit.Test;

import static org.junit.Assert.*;

public class PieceProductTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeWeight() {
        PieceProduct product = new PieceProduct("Name", "description", -90.0);
    }

    @Test public void testEquals(){
        PieceProduct product = new PieceProduct("Name", "description", 90.0);
        PieceProduct product2 = new PieceProduct("Name", "description", 90.0);
        boolean result = product.equals(product2);
        assertTrue(result);
    }
    @Test public void TestToString(){
        PieceProduct product = new PieceProduct("Name", "description", 90.0);
        String expected = "Штучный товар: \n" +
                "Имя товара: 'Name', описание товара: 'description', вес товара: 90.0";
        String result = product.toString();
        assertEquals(expected, result);
    }
}