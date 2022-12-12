import java.util.Scanner;

public abstract class Location {
    private Player player;
    private String name;
    public static Scanner input = new Scanner(System.in); //private dersem alt sınıflarda erişemem getter ve setter gerekir

    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }
    public abstract boolean onLocation();   //Bütün location sınıfları bunu kullansın istediğimiz için abstract tanımladık.


    //Getter and setter methods--
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //-----------------------------------------------
}
