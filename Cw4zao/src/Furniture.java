public class Furniture {
    String nazwa;
    double cena;
    static final double VAT = 0.23;

    public Furniture(String nazwa, double cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }

    //GetPrice -> cena

    //GetPriceIncludingVat -> cena + (cena*Vat);


}
