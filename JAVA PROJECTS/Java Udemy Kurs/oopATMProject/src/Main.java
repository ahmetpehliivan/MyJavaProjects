public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Account account = new Account("Ahmet Pehlivan","11620325",18000);
        atm.run(account);
        System.out.println("Programdan çıkılıyor..");
    }
}
