package ecomerce.procducts.types;

import java.util.ArrayList;
import java.util.List;
import ecomerce.procducts.Product;
import ecomerce.procducts.ProductType;

public class CD extends Product {
    private ArrayList<String> artists;
    private String editor;

    /**
     *
     */
    public CD(String title , String descrption , double price
                , List<String> artists , String editor) {
        super(title, descrption , price);
        this.artists = new ArrayList<String>(artists);
        this.editor = editor;
    }
    public CD(CD d){
        this(d.getTitle(), d.getDescrption(), d.getPrice()
                , d.artists , d.editor);
    }

    /**
     * @return the artists
     */
    public ArrayList<String> getArtists() {
        return artists;
    }

    /**
     * @param artists the artists to set
     */
    public void setArtists(List<String> artists) {
        this.artists = new ArrayList<String>(artists);
    }

    /**
     * @return the editor
     */
    public String getEditor() {
        return editor;
    }

    /**
     * @param editor the editor to set
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }
    @Override
    public Product getCopy(){
        return new CD(this);
    }
    @Override
    public ProductType getType(){
        return ProductType.CD;
    }
    @Override 
    public String toString(){
        return super.toString() + " " + artists +" "+ editor;
    }

}
