import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("===ÇALISANLAR PROGRAMINA HOSGELDINIZ===");
        String operations = "İşlemler\n"+
                            "1. Yazılımcı İşlemleri\n"+
                            "2. Yönetici İşlemleri\n"+
                            "Çıkış için q'ya basınız";
        System.out.println("****************************************");
        System.out.println(operations);
        System.out.println("****************************************");

        while (true){
            System.out.print("İşlemi Seçiniz : ");
            String operation = scanner.nextLine();
            if (operation.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            } else if (operation.equals("1")) {
                Developer developer = new Developer("Ahmet","Pehlivan",325,"Python,C,Java");
                String developerOperations = "1. Format At\n"+
                                             "2. Bilgileri Göster\n"+
                                             "Çıkış için q'ya basın";
                System.out.println(developerOperations);
                while(true){
                    System.out.print("İşlemi Seçiniz : ");
                    String dOperation = scanner.nextLine();
                    if (dOperation.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                        break;
                    } else if (dOperation.equals("1")) {
                        System.out.println("İşletim Sistemi : ");
                        String operatingSystem = scanner.nextLine();
                        developer.doReset(operatingSystem);
                    }else if (dOperation.equals("2")){
                        developer.showInformation();
                    }else
                        System.out.println("Geçersiz yazılımcı işlemi...");
                }
            } else if (operation.equals("2")) {
                Manager manager = new Manager("Engin","Demiroğ",111,10);
                String managerOperations = "1. Zam yap\n"+
                                             "2. Bilgileri Göster\n"+
                                             "Çıkış için q'ya basın";
                System.out.println(managerOperations);
                while(true){
                    System.out.print("İşlemi Seçiniz : ");
                    String mOperation = scanner.nextLine();
                    if (mOperation.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    } else if (mOperation.equals("1")) {
                        System.out.println("Zam miktarı : ");
                        int quantityRaise = scanner.nextInt();
                        scanner.nextLine();//hata önlemek için
                        manager.giveRaise(quantityRaise);
                    }else if (mOperation.equals("2")){
                        manager.showInformation();
                    }else
                        System.out.println("Geçersiz yönetici işlemi...");
                }
            }else
                System.out.println("Geçersiz bir işlem girdiniz...");
        }

    }
}
