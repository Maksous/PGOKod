public class User {
    String imie, nazwisko, email, haslo;
    boolean jestGosciem = true;

    public User(String email){
        this.email = email;
    }

    public User(String imie, String nazwisko, String email, String haslo, boolean jestGosciem){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.haslo = haslo;
        this.jestGosciem = false;
    }

}
