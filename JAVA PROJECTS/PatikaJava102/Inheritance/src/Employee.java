public class Employee {
    private String nameSurname;
    private String mpNo;
    private String email;

    public Employee(String nameSurname, String mpNo, String email) {
        this.nameSurname = nameSurname;
        this.mpNo = mpNo;
        this.email = email;
    }

    public String getNameSurname(){
        return nameSurname;
    }
    public void setNameSurname(String nameSurname){
        this.nameSurname = nameSurname;
    }
    public String getMpNo(){
        return mpNo;
    }
    public void setMpNo(String mpNo){
        this.mpNo = mpNo;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void entry(){
        System.out.println(this.nameSurname + " Üniversiteye Giriş Yaptı..");
    }
    public void exit(){
        System.out.println(this.nameSurname + " Üniversiteden Çıkış Yaptı..");
    }
    public void hall(){
        System.out.println(this.nameSurname + " Yemekhaneye girdi..");
    }
}
