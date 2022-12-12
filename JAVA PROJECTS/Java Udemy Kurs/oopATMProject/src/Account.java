public class Account {
    private String customerName;
    private String password;
    private int balance;

    public Account(String customerName, String password, int balance) {
        this.customerName = customerName;
        this.password = password;
        this.balance = balance;
    }

    public void paying(int price){
        this.balance += price;
        System.out.println("Yeni bakiyeniz : "+this.balance);
    }
    public void withdrawal(int price){
        if ((balance-price)<0){
            System.out.println("Yeterli bakiyeniz yok!");
        }else{
            this.balance -= price;
            System.out.println("Yeni bakiyeniz : "+this.balance);
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
