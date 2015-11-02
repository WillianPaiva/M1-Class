package ecomerce.procducts;

import java.util.List;

public interface CatalogUserItf {
    public List<Integer> listProduct();
    public double getPrice(int productId);
    public String getDescription(int productId);
    public List<Integer> findProductByType(String type);
    public List<Integer> listProductByIcreasingPrice();
    public Product findProductById(int id);
    String getTitle(int productId);
}
