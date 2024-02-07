


public class ServiceProducts {
    public static int countByFilter(ProductBatch batch, IFilter str){
        int count = 0;
        for(int i = 0;i < batch.getProducts().length; i++)
        {
            if(str.apply(batch.getProducts()[i].getNameProduct()) ) {
                count++;
            }
        }
        return count;
    }
}
