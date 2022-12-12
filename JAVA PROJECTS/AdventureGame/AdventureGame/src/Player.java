import gameCharacter.Archer;
import gameCharacter.GameCharacter;
import gameCharacter.Knight;
import gameCharacter.Samurai;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int orjinalHealth;
    private int money;
    private String charName;
    private String name;
    Scanner input = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory(); //bu oluştuğunda varsayılan yumruk oluşur
    }

    public void selectChar(){
        GameCharacter[] charList = {new Samurai(),new Knight(), new Archer()};
        System.out.println("------------------------------------------------------------------");
        for (GameCharacter gameCharacters:charList) {
            System.out.println("ID : "+gameCharacters.getId()+"  KARAKTER :" +gameCharacters.getName()+"\t| " +
                    "Hasar: "+gameCharacters.getDamage()+"\t| " +
                    "Sağlık: "+gameCharacters.getHealth()+"\t| " +
                    "Para: "+gameCharacters.getMoney());
        }
        System.out.println("------------------------------------------------------------------");
        System.out.print("Lütfen Bir Karakter Numarası Giriniz : ");
        int selectChar = input.nextInt();

        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Knight());
                break;
            case 3:
                initPlayer(new Archer());
                break;
            default:
                initPlayer(new Samurai());
        }
        /*System.out.println("KARAKTER : "+this.getName()+" | Hasar : "+this.getDamage()+" | Sağlık : "+this.getHealth()+" | Para : "+this.getMoney());
        System.out.println("------------------------------------------------------------------");*/
    }
    public void selectLoc(){

    }

    public void initPlayer(GameCharacter gameCharacter){
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setOrjinalHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
        this.setName(gameCharacter.getName());
    }

    public void printInfo(){
        System.out.println("Silahınız : "+this.inventory.getWeapon().getName()+
                " | Zırhınız : "+this.inventory.getArmor().getName()+
                " | Bloklama : "+this.inventory.getArmor().getBlock()+
                " | Hasar : "+this.getTotalDamage()+
                " | Sağlık : "+this.getHealth()+
                " | Para : "+this.getMoney());
    }

    //Getter and setter methods
    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public String getCharName() {
        return charName;
    }
    public void setCharName(String charName) {
        this.charName = charName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Inventory getInventory() {
        return inventory;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    public int getOrjinalHealth() {
        return orjinalHealth;
    }
    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }
    //-----------------------------------------------
}
