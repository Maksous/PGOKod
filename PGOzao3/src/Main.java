import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //zad 1
        User u1 = new User("aaa");
        // DRUGI USER
        User u3 = new User("Jan","Kowalski",u1.email,"haslo",false);

        System.out.println(u3.email);

        //zad 2

        Product p1 = new Product("Chleb",1.50,7890,200);
        p1.setCena(2.00);
        //drugi produkt
        //zmiana ilosci na 5 danego produktu

        //zad 3
        ArrayList<Product> produkty = new ArrayList<>();

        Category c1 = new Category();
        //Category c2 = new Category("wypieki",);

        c1.produkt.add(p1);
        c1.produkt.remove(p1);
        //c2 dodanie produktu2;
    }
}
