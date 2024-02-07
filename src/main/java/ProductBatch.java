
import java.util.Arrays;
import java.util.Objects;
//«Партия товаров».

public class ProductBatch {
    private final String description;
    private final PackagedProduct[] packagedProducts;

    public ProductBatch(String description, PackagedProduct... packagedProducts) {
        if (description == null) throw new IllegalArgumentException();
        this.description = description;
        this.packagedProducts = packagedProducts;
    }

    public String getDescription() {
        return description;
    }

    public PackagedProduct[] getProducts() {
        return packagedProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductBatch)) return false;
        ProductBatch that = (ProductBatch) o;
        return Objects.equals(getDescription(), that.getDescription()) && Arrays.equals(getProducts(), that.getProducts());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getDescription());
        result = 31 * result + Arrays.hashCode(getProducts());
        return result;
    }

    @Override
    public String toString() {
        return "Партия товаров: \n" +
                ", описание: '" + description + '\'' +
                ", товары: '" + Arrays.toString(packagedProducts) +  '\'' ;
    }

    public static double getProductWeight(PackagedProduct[] packagedProducts) {
        return Arrays.stream(packagedProducts).mapToDouble(PackagedProduct::getGrossWeight).sum();
    }

    //получить массу всей партии (суммарная масса брутто всех товаров в партии).
    public double getGrossWeight() {
        return  getProductWeight(packagedProducts);
    }
}
