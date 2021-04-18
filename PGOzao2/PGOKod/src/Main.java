public class Main {

    public static void main(String[] args) {
        Telephone telephone1 = new Telephone("Samsung",4.6,654785121);
        // dodaj 2 telefon

        System.out.println(telephone1.sendMessage("Tresc wiadomosc",telephone1.number));

        //Car car1 = new Car("kolor","marka",2.0);

        //System.out.println(car1.showInfo(car1.color, car1.capacity));

        //car1.changeCapacity(1.0);
        //System.out.println(car1.capacity);

        //car1.isHigh();

    }
}
