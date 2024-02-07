

import junit.framework.TestCase;
import org.junit.Test;


public class ProductTest extends TestCase {

    @Test
    public void testConstructorNullName() {
        try {
            Product product = new Product(null, "description string");
        }
        catch(Exception e){
            System.out.println("error");
        }
    }

    @Test
    public void testConstructorNullDescription() {
        try {
            Product product = new Product("Name", null);
        }
        catch(Exception e){
            System.out.println("error");
        }
    }

    @Test public void testEquals(){
        Product product = new Product("Name","description string");
        Product product2 = new Product("Name","description string");
        boolean result = product.equals(product2);
        assertTrue(result);
    }
    @Test public void testHashCode() {
        Product product = new Product("Name","description string");
        int expected = 2027879211;
        int result = product.hashCode();
        assertEquals(expected, result);
    }
    @Test public void TestToString(){
        Product product = new Product("Name","description string");
        String expected = "Продукт: \n" +
                " Имя продукта: 'Name', описание: 'description string'";
        String result = product.toString();
        assertEquals(expected, result);
    }

}