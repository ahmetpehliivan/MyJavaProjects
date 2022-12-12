public class Academicien extends Employee{
    private String departmant;
    private String degree;

    public Academicien(String nameSurname, String mpNo, String email, String departmant, String degree) {
        super(nameSurname, mpNo, email);
        this.departmant = departmant;
        this.degree = degree;
    }
    public String getDepartmant(){
        return departmant;
    }
    public void setDepartmant(String departmant){
        this.departmant = departmant;
    }
    public String getDegree(){
        return degree;
    }
    public void setDegree(String degree){
        this.degree = degree;
    }

    public void attendCourse(){
        System.out.println(this.getNameSurname() + " Derse Giriş Yaptı !");
    }
}
