package ecomerce.procducts;

public class Product implements Comparable<Product>{

    private String title;
    private String descrption;
    private int type;
    private double price;

    public Product(String title, String descrption,int type, double price) { 
        this.title = title;
        this.descrption = descrption;
        this.type = type;
        this.price = price;
    }
    public String toString(){
        return title +"  "+ descrption +"  "+type +"  "+price;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the descrption
     */
    public String getDescrption() {
        return descrption;
    }

    /**
     * @param descrption the descrption to set
     */
    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public int hashCode(){
        int hash = 32;
        hash = hash * 31 + Double.valueOf(this.price).hashCode();
        hash = hash * 31 + Integer.valueOf(this.type).hashCode();
        hash = hash * 31 + this.title.hashCode();
        hash = hash * 31 + this.descrption.hashCode();
        return hash;
    }
    @Override
    public int compareTo(Product o) {
        // TODO Auto-generated method stub
        return Integer.compare(this.hashCode(),o.hashCode());
    }

}
