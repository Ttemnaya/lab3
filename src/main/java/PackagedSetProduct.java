
import java.util.Arrays;

//«Упакованный набор товаров».

public class PackagedSetProduct extends PackagedProduct {
    private PackagedProduct[] packagedProducts;

    public PackagedSetProduct( String name, String description, ProductPackaging productPackaging, PackagedProduct... products) {
        super(name, description, productPackaging);
        this.packagedProducts = products;
    }

    public PackagedProduct[] getProducts() {
        return packagedProducts;
    }

    @Override
    public String toString() {
        return "Упакованный набор товаров: \n" +
                ", имя упаковки набора товаров: '" + productPackaging.getNameProduct() + '\'';
    }

    //масса нетто (суммарная масса брутто всех элементов набора, но без массы упаковки самого набора)
    public static double getProductWeight(PackagedProduct[] packagedProducts) {
        return Arrays.stream(packagedProducts).mapToDouble(PackagedProduct::getGrossWeight).sum();
    }
    @Override
    public double getNetWeight() {
        return getProductWeight(getProducts());

    }

    //масса брутто (суммарная масса всего набора с упаковкой).
    @Override
    public double getGrossWeight() {
        return getProductWeight(getProducts()) + productPackaging.getWeightProduct();
    }
}