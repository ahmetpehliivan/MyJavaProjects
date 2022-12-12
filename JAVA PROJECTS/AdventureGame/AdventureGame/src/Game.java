import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("\t\t-----------------------------------------");
        System.out.println("\t\t|      MACERA OYUNUNA HOSGELDINIZ!      |");
        System.out.println("\t\t-----------------------------------------");
        System.out.print("    Lütfen bir isim giriniz : ");
        //String playerName = input.nextLine();
        Player player = new Player("Ahmet");
        System.out.println("--Sayın "+player.getName()+" bu karanlık ve sisli adaya hosgeldiniz..!--");
        System.out.println("\t\t==LUTFEN BIR KARAKTER SECINIZ==");
        player.selectChar();

        Location location = null;
        while (true){
            player.printInfo();
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("|\t\t\t\t\t========= BOLGELER =========\t\t\t\t\t    |");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("| 1 - Güvenli Ev   --> Burası sizin için güvenli bir alan, düşman yok.  |");
            System.out.println("| 2 - Eşya Dükkanı --> Silah veya zırh satın alabilirsiniz.             |");
            System.out.println("| 3 - Mağara       --> Mağaraya gir, ve zombilerle savaşmaya hazır ol..!|");
            System.out.println("| 4 - Orman        --> Ormana git, ve vampirlerle savaşmaya hazır ol..! |");
            System.out.println("| 5 - Nehir        --> Nehire git, ve ayılarla savaşmaya hazır ol..!    |");
            System.out.println("| 0 - Oyundan çıkış yap !                                               |");
            System.out.println("-------------------------------------------------------------------------");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");
            int selectLoc = input.nextInt();

            if (selectLoc == 0) {
                System.out.println("Bu karanlık ve sisli dünyadan çabuk vazgeçtin.");
                break;
            }
            switch (selectLoc){
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir bölge giriniz !");
            }
            if (!location.onLocation()){
                System.out.println("GAME OVER!");
                break;
            }

        }

    }
}
