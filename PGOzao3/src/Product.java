public class Product {
    String nazwa;
    double cena;
    int kodProduktu, liczbaSztuk = 0;

    //konstruktor 1


    //konstruktor 2
    public Product(String nazwa, double cena, int kodProduktu, int liczbaSztuk){
        this.nazwa = nazwa;
        this.cena = cena;
        this.kodProduktu = kodProduktu;
        this.liczbaSztuk = liczbaSztuk;
    }

    public void setCena(double cena){
        this.cena = cena;
    }

    /*
    public void setLiczbaSztuk(int liczbaSztuk) {
        if(warunek){
       informacja o tym, ze liczba sztuk nie moze byc mniejsza od 0
    }else{
        ustawiamy ilosc sztuk (podobnie jak w przypadku setCena)
    }
     */

    public String getNazwa(){
        return nazwa;
    }

    //getCena
    //getKodProduktu
    //getLiczbaSztuk



}
