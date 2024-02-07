
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceProductsTest {

    private ProductBatch batch;
    private ProductBatch weightBatch;

    @Before
    public void setUp() {
        ProductPackaging productPackaging = new ProductPackaging("коробка", 10.0);
        PieceProduct apple = new PieceProduct("яблоки", "зеленые", 100.0);
        PackagedPieceProduct appleBox = new PackagedPieceProduct(productPackaging, 10, apple);

        PackagedProduct[] d = new PackagedProduct[]{appleBox, appleBox};
        PackagedSetProduct set = new PackagedSetProduct("фрукты", "разные фрукты", productPackaging, d);
        PackagedProduct[] ddd = new PackagedProduct[]{appleBox, set};
        batch = new ProductBatch("Партия товаров", appleBox,
                set, new PackagedSetProduct("овощи", "разные фрукты", productPackaging, ddd));
        WeightProducts weightProduct = new WeightProducts("мармеладки", "вкусные");
        PackagedWeightProduct marshmallowBox = new PackagedWeightProduct(productPackaging, 100.0, weightProduct);
        weightBatch = new ProductBatch("Партия мармеладок", marshmallowBox);
    }


    @Test
    public void testCounter() {
        assertEquals(ServiceProducts.countByFilter(batch, new BeginStringFilter("яблоки")), 1);
        assertEquals(ServiceProducts.countByFilter(batch, new ContainsStringFilter("зеленые")), 0);
        assertEquals(ServiceProducts.countByFilter(batch, new EndStringFilter("фрукты")), 1);
    }

}