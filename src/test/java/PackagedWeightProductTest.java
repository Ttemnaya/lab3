
import org.junit.Test;
import static org.junit.Assert.*;

public class PackagedWeightProductTest {
    private PackagedWeightProduct product = new PackagedWeightProduct(new ProductPackaging("Пакет", 90.0),
            9000.99, new WeightProducts("Угли", "Древесные угли"));

    @Test(expected= IllegalArgumentException.class)
    public void testConstructorNegativeWeight() {
        PackagedWeightProduct product = new PackagedWeightProduct(new ProductPackaging("Пакет", 90.0),
                -9000.99, new WeightProducts("Угли", "Древесные угли"));
    }

    @Test
    public void testGetNetWeight() {
        double actual = product.getNetWeight();
        double expected = 9000.99;
        assertEquals(expected,actual, 0.0001);
    }

    @Test
    public void testGetGrossWeight() {
        assertEquals(product.getGrossWeight(), 9090.99,0.0001);
    }
}