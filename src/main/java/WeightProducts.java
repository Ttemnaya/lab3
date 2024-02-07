
import java.util.Objects;

//Весовые продукты

public class WeightProducts extends Product {

    public WeightProducts(String nameWeightProducts, String descriptionWeightProducts) {
        super(nameWeightProducts, descriptionWeightProducts);
    }

    public String getNameWeightProducts() {
        return getNameProduct();
    }

    public void setNameWeightProducts(String nameWeightProducts) {
        setNameProduct(nameWeightProducts);
    }

    public String getDescriptionWeightProducts() {
        return getDescriptionProduct();
    }

    public void setDescriptionWeightProducts(String descriptionWeightProducts) {
        setDescriptionProduct(descriptionWeightProducts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeightProducts that = (WeightProducts) o;
        return Objects.equals(getNameWeightProducts(), that.getNameWeightProducts()) && Objects.equals(getDescriptionWeightProducts(), that.getDescriptionWeightProducts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameWeightProducts(), getDescriptionWeightProducts());
    }

    @Override
    public String toString() {
        return "Весовой товар: \n" +
                "Имя товара: '" + getNameWeightProducts() + '\'' +
                ", описание товара: '" + getDescriptionWeightProducts() + '\'';
    }
}