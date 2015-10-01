import ecomerce.procducts.Catalogue;
import ecomerce.procducts.CatalogueByPrice;
import ecomerce.procducts.Product;

public class Main {
    public static void main(String[] args)
    {
        Catalogue t = new Catalogue();
        Catalogue t2 = new CatalogueByPrice();
        t.addItem(new Product("TV","a big TV",1,500.00));
        t2.addItem(new Product("TV","a big TV",1,500.00));
        t.addItem(new Product("radio","a big radio",1,55.00));
        t2.addItem(new Product("radio","a big radio",1,55.00));
        t.addItem(new Product("PS3","a big PS3",1,1000.00));
        t2.addItem(new Product("PS3","a big PS3",1,1000.00));
        for(Product prod: t.getList()){
            System.out.println(prod);
        }
        System.out.println("-----------------------------------------------------------");
        for(Product prod: t2.getList()){
            System.out.println(prod);
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("aftter remove");
        t.removeProductByTitle("TV");
        for(Product prod: t.getList()){
            System.out.println(prod);
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("aftter remove");
        t2.removeProductByTitle("TV");
        for(Product prod: t2.getList()){
            System.out.println(prod);
        }
    } 
}
