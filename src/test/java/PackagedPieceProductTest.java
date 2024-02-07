

import org.junit.Test;


import static org.junit.Assert.*;

public class PackagedPieceProductTest {
    private PieceProduct product = new PieceProduct("apple", "green apple", 200.00);
    PackagedPieceProduct packagedProduct = new PackagedPieceProduct(new ProductPackaging("pack", 10.0),
            10, product);


    @Test
    public void testGetCount() {
        assertEquals(packagedProduct.getCount(), 10);
    }

    @Test
    public void testGetProduct() {
        assertEquals(packagedProduct.getPieceProduct(), product);
    }

    @Test
    public void testGetNetWeight() {
        assertEquals(packagedProduct.getNetWeight(), 2000.0, 0.001);
    }

    @Test
    public void testGetGrossWeight() {
        assertEquals(packagedProduct.getGrossWeight(), 2010.0, 0.001);
    }
}