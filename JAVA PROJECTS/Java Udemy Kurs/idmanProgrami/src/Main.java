import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===IDMAN PROGRAMINA HOSGELDINIZ===");
        String exercises = "Geçerli Hareketler...\n"
                            +"  Burpee\n"
                            +"  Pushup\n"
                            +"  Situp\n"
                            +"  Squat\n";
        System.out.println(exercises);
        System.out.println("Bir idman oluşturunuz...");
        System.out.print("Burpee sayısı : ");
        int burpee = scanner.nextInt();
        System.out.print("Pushup sayısı : ");
        int pushup = scanner.nextInt();
        System.out.print("Situp sayısı : ");
        int situp = scanner.nextInt();
        System.out.print("Squat sayısı : ");
        int squat = scanner.nextInt();

        Idman idman = new Idman(burpee,pushup,situp,squat);
        System.out.println("İdmanınız başlıyor.....");

        while (idman.isIdman()==false){
            System.out.print("Hareket türü(Burpee, Pushup, Situp, Squat) :");
            String type = scanner.next();
            System.out.print("Bu hareketten kaç tane yapacaksınız ? ");
            int number = scanner.nextInt();
            scanner.nextLine(); //hatayı güvenceye aldık.
            idman.doExercise(type,number);
        }
        System.out.println("==TEBRİKLER.. IDMANINIZ BITMISTIR..==");
    }
}
