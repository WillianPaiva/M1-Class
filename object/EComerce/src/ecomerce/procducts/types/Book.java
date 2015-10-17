package ecomerce.procducts.types;

import java.util.ArrayList;
import java.util.List;
import ecomerce.procducts.Product;
import ecomerce.procducts.ProductType;

public class Book extends Product{
    private ArrayList<String> authors;
    private String editor;

    /**
     *
     */
    public Book(String title, String descrption , 
            double price , List<String> authors, String editor) {
        super(title, descrption, price) ;
        this.authors = new ArrayList<String>(authors);
        this.editor = editor;
    
    }

    public Book(Book b){
        this(b.getTitle(), b.getDescrption(), b.getPrice()
                , b.authors , b.editor);
    }
   
    @Override
    public Product getCopy(){
        return new Book(this);
    }
    
    @Override
    public ProductType getType(){
        return ProductType.Book;
    }
    @Override
    public String toString(){
        return super.toString() + " " + authors + " " + editor;
    }

    /**
     * @return the authors
     */
    public ArrayList<String> getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(List<String> authors) {
        this.authors = new ArrayList<String>(authors);
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

}
