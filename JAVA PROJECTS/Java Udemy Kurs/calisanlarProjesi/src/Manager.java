public class Manager extends Employee{
    private int numberOfEmployee;

    public Manager(String firstName, String lastName, int id, int numberOfEmployee) {
        super(firstName, lastName, id);
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı : "+this.numberOfEmployee);
    }
    public void giveRaise(int quantityRaise){
        System.out.println(getFirstName()+" çalışanlara "+quantityRaise+" kadar zam yapıyoruz :)");
    }
}
