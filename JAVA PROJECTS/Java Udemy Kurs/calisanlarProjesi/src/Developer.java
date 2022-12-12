public class Developer extends Employee{
    private String languages;

    public Developer(String firstName, String lastName, int id,String languages) {
        super(firstName, lastName, id);
        this.languages = languages;
    }
    public void doReset(String operatingSystem){
        System.out.println(getFirstName()+" "+operatingSystem+" yüklüyor..");
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Yazılımcının bildiği diller : "+languages);
    }
}
