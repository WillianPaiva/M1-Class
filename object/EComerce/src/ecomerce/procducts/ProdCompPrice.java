package ecomerce.procducts;
import java.util.Comparator;

class ProdCompPrice implements Comparator<Product>{
    @Override
    public int compare(Product a, Product b){
        if(a.getPrice() > b.getPrice()){
            return 1;
        }else{
            return -1;
        }
    }
}
