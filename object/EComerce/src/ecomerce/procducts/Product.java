package ecomerce.procducts;

public abstract class Product implements Comparable<Product>{

    private static int SERIAL_COUNTER = 1;
    private String title;
    private String descrption;
    private double price;

    private final int id = SERIAL_COUNTER++;

    public Product(String title, String descrption, double price) { 
        this.title = title;
        this.descrption = descrption;
        this.price = price;
    }

    public Product(Product p){
        this(p.title,p.descrption,p.price);
    }
    public String toString(){
        return title +"  "+ descrption +"  "+price;
    }
    @Override
    public int hashCode(){
        return new Integer(id).hashCode();
    }
    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.hashCode(),o.hashCode());
    }
    public abstract Product getCopy();
    public abstract ProductType getType();

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the descrption
     */
    public String getDescrption() {
        return descrption;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }
    
    public int getId(){
        return id;
    }

}
