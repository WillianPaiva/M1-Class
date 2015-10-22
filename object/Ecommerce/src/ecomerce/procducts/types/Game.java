package ecomerce.procducts.types;

import ecomerce.procducts.Product;
import ecomerce.procducts.ProductType;

public class Game extends Product {
    private String creator;

    /**
     *
     */
    public Game(String title, String descrption , double price , String creator) {
        super(title, descrption, price);
        this.creator = creator;
    }

    public Game(Game g){
        this(g.getTitle(), g.getDescrption(), g.getPrice(), g.creator);
    }

    /**
     * @return the creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator the creator to set
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    @Override
    public Product getCopy(){
        return new Game(this);
    }
    @Override
    public ProductType getType(){
        return ProductType.Game;
    }
    @Override
    public String toString(){
        return super.toString() + " " + creator;
    }


}
