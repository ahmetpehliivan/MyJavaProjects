import java.util.Random;

public abstract class BattleLoc extends Location{
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLoc(Player player, String name, Obstacle obstacle,String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleRandom();
        System.out.println("Şuan buradasınız : "+this.getName());
        System.out.println("Dikkatli Ol! Burada "+obsNumber+" tane "+this.getObstacle().getName()+" yaşıyor..!");
        System.out.print("<S>avaş veya <K>aç : ");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase(); //küçük harfi büyük yapar
        if(selectCase.equals("S")&&combat(obsNumber)){   //stringlerde equals ile işlem yapıyoruz
            System.out.println(this.getName()+" tüm düşmanları yendiniz..!");
            return true;
        }
        if (this.getPlayer().getHealth()<=0){
            System.out.println("Öldünüz !");
            return false;
        }
        return true;
    }
    public boolean combat(int obsNumber){ //savaşma metodu
        for (int i=1 ; i<= obsNumber; i++){
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());
            playerStats();
            obstacleStats(i);
            while(this.getPlayer().getHealth()>0 && this.getObstacle().getHealth()>0){
                System.out.print("<V>ur veya <K>aç :");
                String selectCombat = input.nextLine().toUpperCase(); //girilen değerin büyük harfini al
                if (selectCombat.equals("V")){
                    System.out.println("Siz vurdunuz : "+this.getPlayer().getTotalDamage());
                    this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth()>0){
                        System.out.println("---------------------------");
                        System.out.println("Canavar size vurdu !");
                        int obstacleDamage = this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamage<0){
                            obstacleDamage=0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth()-obstacleDamage);
                        afterHit();
                    }
                }else {
                    return false;
                }
            }
            if (this.getObstacle().getHealth()<this.getPlayer().getHealth()){
                System.out.println("Düşmanı Yendiniz !");
                System.out.println(this.getObstacle().getAward()+" para kazandınız !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Güncel paranız : "+this.getPlayer().getMoney());
            }else
                return false;
        }
        return true;
    }
    //Vurduktan sonraki durum
    public void afterHit(){
        System.out.println("Canınız : "+this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName()+" Canı : "+this.getObstacle().getHealth());
    }
    //Oyuncu değerlerini ekrana yazdıran kodlar
    public void playerStats(){
        System.out.println("=== OYUNCU DEGERLERI ===");
        System.out.println("----------------------");
        System.out.println("Sağlık    : "+this.getPlayer().getHealth());
        System.out.println("Silah     : "+this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar     : "+this.getPlayer().getTotalDamage());
        System.out.println("Zırh      : "+this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama  : "+this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para      : "+this.getPlayer().getMoney());
        System.out.println("----------------------");
    }
    //Canavar değerlerini ekrana yazdıran kodlar
    public void obstacleStats(int i){
        System.out.println("=== "+i+"."+this.getObstacle().getName()+" DEGERLERİ ===");
        System.out.println("Sağlık    : "+this.getObstacle().getHealth());
        System.out.println("Hasar     : "+this.getObstacle().getDamage());
        System.out.println("Ödül      : "+this.getObstacle().getAward());
    }
    //random bir değer üreterek canavar oluşturuyoruz
    public int randomObstacleRandom(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    //getter and setters methods
    public Obstacle getObstacle() {
        return obstacle;
    }
    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }
    public String getAward() {
        return award;
    }
    public void setAward(String award) {
        this.award = award;
    }
    public int getMaxObstacle() {
        return maxObstacle;
    }
    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
    //----------------------------------------------------------------
}
