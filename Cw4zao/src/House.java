import java.util.ArrayList;

public class House {
    //pokoje (lista)
    //iloscPokoi (atrybut statyczny)
    String adres;

    public House(String adres){
        this.adres = adres;
    }

    public static House createHouse(String adres){
        House h = new House(adres);
        return h;
    }

    public void addRoom(Room r){
        //pokoje.add(r);
    }

    //addRoom(ArrayList<Room> listaPokoi){
    //
    //}

    //getRoomCount(){
    //petla(r : pokoje)
    //iloscPokoi += 1;
    //}
    //return
}
