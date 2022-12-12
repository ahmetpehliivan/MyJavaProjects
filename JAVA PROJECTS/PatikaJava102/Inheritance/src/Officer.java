public class Officer extends Employee {
    private String departmant;
    private String shift;

    public Officer(String nameSurname, String mpNo, String email, String departmant, String shift) {
        super(nameSurname, mpNo, email);
        this.departmant = departmant;
        this.shift = shift;
    }
    public String getDepartmant(){
        return departmant;
    }
    public void setDepartmant(String departmant){
        this.departmant = departmant;
    }
    public String getShift(){
        return shift;
    }
    public void setShift(String shift){
        this.shift = shift;
    }

    public void work(){
        System.out.println(this.getNameSurname() + " memur görevini yapıyor !");
    }
}
