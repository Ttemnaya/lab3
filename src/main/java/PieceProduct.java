
import java.util.Objects;

//Штучный товар

public class PieceProduct extends Product {
    private double weightPieceProduct;

    public PieceProduct(String namePieceProduct, String descriptionPieceProduct, double weightPieceProduct) {
        super(namePieceProduct, descriptionPieceProduct);
        if (Double.compare(weightPieceProduct, 0.0) == -1) throw new IllegalArgumentException();
        this.weightPieceProduct = weightPieceProduct;
    }

    public String getNamePieceProduct() {
        return getNameProduct();
    }

    public void setNamePieceProduct(String namePieceProduct) {
        setNameProduct(namePieceProduct);
    }

    public String getDescriptionPieceProduct() {
        return getDescriptionProduct();
    }

    public void setDescriptionPieceProduct(String descriptionPieceProduct) {
        setDescriptionProduct(descriptionPieceProduct);
    }

    public double getWeightPieceProduct() {
        return weightPieceProduct;
    }

    public void setWeightPieceProduct(int weightPieceProduct) {
        this.weightPieceProduct = weightPieceProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PieceProduct that = (PieceProduct) o;
        return weightPieceProduct == that.weightPieceProduct && Objects.equals(getNamePieceProduct(), that.getNamePieceProduct()) && Objects.equals(getDescriptionPieceProduct(), that.getDescriptionPieceProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNamePieceProduct(), getDescriptionPieceProduct(), weightPieceProduct);
    }

    @Override
    public String toString() {
        return "Штучный товар: \n" +
                "Имя товара: '" + getNamePieceProduct() + '\'' +
                ", описание товара: '" + getDescriptionPieceProduct() + '\'' +
                ", вес товара: " + weightPieceProduct;
    }
}