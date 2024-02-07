
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductBatchTest {
    ProductPackaging productPackaging = new ProductPackaging("коробка", 10.0);
    PieceProduct apple = new PieceProduct("яблоки", "зеленые", 100.0);
    WeightProducts pear = new WeightProducts("груша", "xxx");
    PackagedPieceProduct appleBox = new PackagedPieceProduct(productPackaging, 10, apple);
    PackagedWeightProduct pear2 = new PackagedWeightProduct(productPackaging, 12.0, pear);
    PackagedProduct[] products = {pear2, appleBox};
    PackagedSetProduct set = new PackagedSetProduct("фрукты", "разные фрукты", productPackaging, products);

    ProductBatch productBatch = new ProductBatch("груша", set);

    @Test
    public void testGetDescription() {
        assertEquals(productBatch.getDescription(), "груша" + "");
    }

    @Test
    public void testGetWeight() {
        assertEquals(productBatch.getGrossWeight() , 1042.0,0.0001);
    }
}