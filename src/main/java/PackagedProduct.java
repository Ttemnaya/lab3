
//упакованные продукты

import java.util.Objects;
// Упакованные товары
abstract public class PackagedProduct extends Product{
    protected final ProductPackaging productPackaging;

    public PackagedProduct(String name, String description, ProductPackaging productPackaging) {
        super(name, description);
        this.productPackaging = productPackaging;
    }
    public ProductPackaging getProductPackaging() {
        return productPackaging;
    }

    abstract public double getNetWeight();
    abstract public double getGrossWeight();
}