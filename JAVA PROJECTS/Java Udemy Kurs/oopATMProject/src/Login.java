import java.util.Scanner;

public class Login {
    public boolean login(Account account){
        Scanner scanner = new Scanner(System.in);
        String name;
        String password;

        System.out.print("Kullanıcı adı : ");
        name = scanner.nextLine();
        System.out.print("Parola : ");
        password = scanner.nextLine();

        if (account.getCustomerName().equals(name)&&account.getPassword().equals(password)){
            return true;
        }else {
            return false;
        }
    }
}
