

import java.util.Objects;

//Упакованный штучный товар

public class PackagedPieceProduct extends PackagedProduct{
    private final PieceProduct pieceProduct;
    private final int count;

    public PackagedPieceProduct(ProductPackaging productPackaging,  int count,PieceProduct pieceProduct){
        super(pieceProduct.getNamePieceProduct(), pieceProduct.getDescriptionProduct(),productPackaging);
        if (count < 0) throw new IllegalArgumentException();
        this.count=count;
        this.pieceProduct=pieceProduct;
    }

    //получить количество штук товара
    public int getCount() {
        return count;
    }

    public Product getPieceProduct() {
        return pieceProduct;
    }

    //получить массу нетто (суммарный вес всех единиц товара)
    public double getNetWeight() {
        return count * pieceProduct.getWeightPieceProduct();
    }

    //массу брутто (упаковки и всех единиц товара вместе)
    public double getGrossWeight() {
        return count * pieceProduct.getWeightPieceProduct() + productPackaging.getWeightProduct();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PackagedPieceProduct)) return false;
        PackagedPieceProduct that = (PackagedPieceProduct) o;
        return getCount() == that.getCount() && Objects.equals(getProductPackaging(),
                that.getProductPackaging()) && Objects.equals(getPieceProduct(), that.getPieceProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductPackaging(), getCount(), getPieceProduct());
    }

    @Override
    public String toString() {
        return "Упакованный штучный товар: \n" +
                "Имя товара: '" + pieceProduct.getNamePieceProduct() + '\'' +
                ", имя упаковки товара: '" + productPackaging.getNameProduct() + '\'' +
                " всего их: " + count;
    }
}