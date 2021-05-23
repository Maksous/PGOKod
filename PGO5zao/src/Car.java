public class Car extends Vehicle {
    int iloscMiejsc;

    public Car(boolean czyWlaczony, int iloscMiejsc) {
        super(czyWlaczony);
        this.iloscMiejsc = iloscMiejsc;
    }

    public int getNumberOfSeats(){
        return iloscMiejsc;
    }

    @Override
    public boolean start() {
        return super.start();
    }

    @Override
    public boolean stop() {
        return super.stop();
    }
}
