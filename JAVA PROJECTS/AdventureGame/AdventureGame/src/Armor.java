public class Armor {
    private String name;
    private int id;
    private int block;
    private int price;

    public Armor( int id, String name, int block, int price) {
        this.name = name;
        this.id = id;
        this.block = block;
        this.price = price;
    }
    public static Armor[] armors(){ //geriye armor veri tipinde bir array döndürsün
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor(1,"Hafif Zırh",1,15);
        armorList[1] = new Armor(2,"Orta Zırh ",3,25);
        armorList[2] = new Armor(3,"Ağır Zırh ",5,45);
        return armorList;
    }
    public static Armor getArmorObjByID(int id){
        for (Armor a:Armor.armors()) {
            if (a.getId() == id)
                return a;
        }
        return null;
    }
    //getter and setters methods--
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    //-----------------------------------
}
