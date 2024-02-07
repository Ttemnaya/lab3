
import java.util.Objects;

//Упакованный весовой товар

public class PackagedWeightProduct extends PackagedProduct {
    private WeightProducts weightProducts;
    private double weight;

    public PackagedWeightProduct(ProductPackaging productPackaging,double weight, WeightProducts weightProducts) {
        super(weightProducts.getNameWeightProducts(), weightProducts.getDescriptionWeightProducts(), productPackaging);
        if (Double.compare(weight, 0.0) == -1) throw new IllegalArgumentException();
        this.weight = weight;
        this.weightProducts = weightProducts;
    }

    public double getWeight() {
        return weight;
    }

    public Product getWeightProduct() {
        return weightProducts;
    }

    //массу нетто (только товара)
    @Override
    public double getNetWeight() {
        return weight;
    }

    //массу брутто (упаковки и товара вместе)
    @Override
    public double getGrossWeight() {
        return weight + productPackaging.getWeightProduct();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PackagedWeightProduct)) return false;
        PackagedWeightProduct that = (PackagedWeightProduct) o;
        return Double.compare(that.getWeight(), getWeight()) == 0 && Objects.equals(getProductPackaging(),
                that.getProductPackaging()) && Objects.equals(getWeightProduct(), that.getWeightProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductPackaging(), getWeight(), getWeightProduct());
    }

    @Override
    public String toString() {
        return "Упакованный весовой товар: \n" +
                "Имя товара: '" + weightProducts.getNameWeightProducts() + '\'' +
                ", имя упаковки товара: '" + productPackaging.getNameProduct() + '\'' +
                " с массой: " + weight;
    }
}