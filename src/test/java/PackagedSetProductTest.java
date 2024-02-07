

import org.junit.Test;

import static org.junit.Assert.*;

public class PackagedSetProductTest {
    ProductPackaging productPackaging = new ProductPackaging("коробка", 10.0);
    PieceProduct apple = new PieceProduct("яблоки", "зеленые", 100.0);
    WeightProducts pear = new WeightProducts("груша", "xxx");
    PackagedPieceProduct appleBox = new PackagedPieceProduct(productPackaging, 10, apple);
    PackagedWeightProduct pear2 = new PackagedWeightProduct(productPackaging, 12.0, pear);
    PackagedProduct[] products = {pear2, appleBox};
    PackagedSetProduct set = new PackagedSetProduct("фрукты", "разные фрукты", productPackaging, products);

    @Test
    public void testGetProducts() {
        assertEquals(set.getProducts(), products);
    }

    @Test
    public void testGetNetWeight() {
        assertEquals(set.getNetWeight(), 1032.0, 0.0001);
    }

    @Test
    public void testGetGrossWeight() {
        assertEquals(set.getGrossWeight(), 1042.0,0.0001);
    }
}
