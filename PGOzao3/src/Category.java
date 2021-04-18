import java.util.ArrayList;

public class Category {
    String kategoria;
    ArrayList<Product> produkt = new ArrayList<>();

    //konstruktor 0 - przykładowy, pusty konstruktor
    public Category(){

    }
    //konstruktor 1

    //konstruktor 2
    public Category(String kategoria, ArrayList<Product> produkt){
        this.kategoria = kategoria;
        this.produkt = produkt;
    }

    //setKategoria

}
