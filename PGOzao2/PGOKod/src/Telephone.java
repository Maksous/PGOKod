public class Telephone {
    String brand;
    double res;
    int number;

    Telephone(String brand, double res, int number){
        this.brand = brand;
        this.res = res;
        this.number = number;
    }

    String sendMessage(String msg, int number){
        return "Wysyłam wiadomość " + msg + " na numer " + this.number;
    }

}
