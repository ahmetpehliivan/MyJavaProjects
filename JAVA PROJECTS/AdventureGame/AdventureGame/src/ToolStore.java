public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }
    @Override
    public boolean onLocation() {
        System.out.println("--------- Mağazaya Hoşgeldiniz! ---------");
        boolean showMenu = true;
        while(showMenu) {
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zırhlar");
            System.out.println("3 - Çıkış Yap");
            System.out.print("Seçiminiz : ");
            int selectCase = input.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Geçersiz giriş yaptınız. Tekrar deneyiniz.");
                selectCase = input.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Bir daha bekleriz...");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }
    //------------------------------------------------------------------------------------------------------------------
    public void printWeapon(){
        System.out.println("----------- WEAPONS -----------");
        for (Weapon w:Weapon.weapons()) {
            System.out.println(w.getId()+"- "+w.getName()+" <Para : "+w.getPrice()+" | Hasar : "+w.getDamage()+">");
        }
        System.out.println("0 - Çıkış Yap");
    }
    public void buyWeapon(){
        System.out.print("Bir silah seçiniz : ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID<0 || selectWeaponID > Weapon.weapons().length){ //Weapons array inin uzunluğu kadar
            System.out.println("Geçersiz giriş yaptınız. Tekrar deneyiniz.");
            selectWeaponID = input.nextInt();
        }

        if (selectWeaponID != 0){
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
            if (selectedWeapon != null){
                if (selectedWeapon.getPrice()>this.getPlayer().getMoney()){
                    System.out.println("--> Silah için yeterli paranız bulunmamaktadır !");
                    System.out.println("------------------------------------------------");
                }else{
                    //SATIN ALMANIN GERÇEKLEŞTİĞİ ALAN
                    System.out.println(selectedWeapon.getName()+" Silahını satın aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız : "+this.getPlayer().getMoney());
                    //System.out.println("Önceki Silahınız : "+this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    //System.out.println("Yeni Silahınız : "+this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }

    }
    //------------------------------------------------------------------------------------------------------------------
    public void printArmor(){
        System.out.println("----------- ARMORS -----------");
        for (Armor a:Armor.armors()) {
            System.out.println(a.getId()+"- "+a.getName()+" <Para : "+a.getPrice()+" | Blok : "+a.getBlock()+">");
        }
        System.out.println("0 - Çıkış Yap");
    }
    public void buyArmor(){
        System.out.print("Bir zırh seçiniz : ");
        int selectArmorID = input.nextInt();
        while (selectArmorID<0 || selectArmorID>Armor.armors().length){
            System.out.println("Geçersiz giriş yaptınız. Tekrar deneyiniz.");
            selectArmorID = input.nextInt();
        }
        if (selectArmorID != 0){
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);
            if (selectedArmor != null){
                if (selectedArmor.getPrice()>this.getPlayer().getMoney()){
                    System.out.println("--> Zırh için yeterli paranız bulunmamaktadır !");
                    System.out.println("------------------------------------------------");
                }else{
                    System.out.println(selectedArmor.getName()+" Seviye zırhını satın aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("--> Kalan Paranız : "+this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }

    }
}
