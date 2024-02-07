
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductPackagingTest {
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullName() {
        ProductPackaging productPack = new ProductPackaging(null, 90.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeWeight() {
        ProductPackaging productPack = new ProductPackaging("Name", -90.0);
    }

    @Test public void testEquals(){
        ProductPackaging productPack = new ProductPackaging("Name", 90.0);
        ProductPackaging productPack2 = new ProductPackaging("Name", 90.0);
        boolean result = productPack.equals(productPack2);
        assertTrue(result);
    }
    @Test public void TestToString(){
        ProductPackaging productPack = new ProductPackaging("Name", 90.0);
        String expected = "имя упаковки: 'Name', вес упаковки: 90.0'";
        String result = productPack.toString();
        assertEquals(expected, result);
    }
}