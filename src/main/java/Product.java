
import java.util.Objects;

// Товар

public class Product {
    private String nameProduct;
    private String descriptionProduct;

    public Product(String nameProduct, String description) {
        if (nameProduct == null || description == null) throw new IllegalArgumentException();
        this.nameProduct = nameProduct;
        this.descriptionProduct = description;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameProduct, product.nameProduct) && Objects.equals(descriptionProduct, product.descriptionProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, descriptionProduct);
    }

    @Override
    public String toString() {
        return "Продукт: \n " +
                "Имя продукта: '" + nameProduct + '\'' +
                ", описание: '" + descriptionProduct + '\'';
    }
}