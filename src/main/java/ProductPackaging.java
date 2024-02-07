
import java.util.Objects;

//Упаковка товара

public class ProductPackaging {
    private String packageName;
    private double weightProduct;

    public ProductPackaging(String packageName, double weightProduct) {
        if (Double.compare(weightProduct, 0.0) == -1) throw new IllegalArgumentException();
        if (packageName == null) throw new IllegalArgumentException();
        this.packageName = packageName;
        this.weightProduct = weightProduct;
    }

    public String getNameProduct() {
        return packageName;
    }

    public void setNameProduct(String nameProduct) {
        this.packageName = nameProduct;
    }

    public double getWeightProduct() {
        return weightProduct;
    }

    public void setWeightProduct(double weightProduct) {
        this.weightProduct = weightProduct;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductPackaging)) return false;
        ProductPackaging that = (ProductPackaging) o;
        return Double.compare(that.getWeightProduct(), getWeightProduct()) == 0 && getNameProduct().equals(that.getNameProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageName, weightProduct);
    }

    @Override
    public String toString() {
        return "имя упаковки: '" + packageName + '\'' +
                ", вес упаковки: " + weightProduct + '\'';
    }
}