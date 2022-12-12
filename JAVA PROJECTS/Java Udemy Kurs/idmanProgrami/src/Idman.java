public class Idman {
    private int burpeeNumber;
    private int pushupNumber;
    private int situpNumber;
    private int squatNumber;

    public Idman(int burpeeNumber, int pushupNumber, int situpNumber, int squatNumber) {
        this.burpeeNumber = burpeeNumber;
        this.pushupNumber = pushupNumber;
        this.situpNumber = situpNumber;
        this.squatNumber = squatNumber;
    }
    public void doExercise(String typeExercise, int number){
        if (typeExercise.equals("Burpee")){
            doBurpee(number);
        }else if (typeExercise.equals("Pushup")){
            doPushup(number);
        }else if (typeExercise.equals("Situp")){
            doSitup(number);
        }else if (typeExercise.equals("Squat")){
            doSquat(number);
        }else{
            System.out.println("Geçersiz hareket.");
        }
    }

    public void doPushup(int number){
        if (pushupNumber==0){
            System.out.println("Yapacak pushup kalmadı...");
        }if (pushupNumber-number<0){
            System.out.println("Hedeflediğin pushup sayısını geçtin.Tebrikler!");
            pushupNumber = 0;
            System.out.println("Kalan pushup sayısı : "+pushupNumber);
        }else{
            pushupNumber -= number;
            System.out.println("Kalan pushup sayısı :"+pushupNumber);
        }
    }
    public void doSitup(int number){
        if (situpNumber==0){
            System.out.println("Yapacak situp kalmadı...");
        }if (situpNumber-number<0){
            System.out.println("Hedeflediğin situp sayısını geçtin.Tebrikler!");
            situpNumber = 0;
            System.out.println("Kalan situp sayısı : "+situpNumber);
        }else{
            situpNumber -= number;
            System.out.println("Kalan situp sayısı :"+situpNumber);
        }
    }
    public void doBurpee(int number){
        if (burpeeNumber==0){
            System.out.println("Yapacak burpee kalmadı...");
        }if (burpeeNumber-number<0){
            System.out.println("Hedeflediğin burpee sayısını geçtin.Tebrikler!");
            burpeeNumber = 0;
            System.out.println("Kalan burpee sayısı : "+burpeeNumber);
        }else{
            burpeeNumber -= number;
            System.out.println("Kalan burpee sayısı :"+burpeeNumber);
        }
    }
    public void doSquat(int number){
        if (squatNumber==0){
            System.out.println("Yapacak squat kalmadı...");
        }if (squatNumber-number<0){
            System.out.println("Hedeflediğin squat sayısını geçtin.Tebrikler!");
            squatNumber = 0;
            System.out.println("Kalan squat sayısı : "+squatNumber);
        }else{
            squatNumber -= number;
            System.out.println("Kalan squat sayısı :"+squatNumber);
        }
    }

    public boolean isIdman(){
        return (burpeeNumber==0)&&(pushupNumber==0)&&(situpNumber==0)&&(squatNumber==0);
    }

    public int getBurpeeNumber() {
        return burpeeNumber;
    }

    public void setBurpeeNumber(int burpeeNumber) {
        this.burpeeNumber = burpeeNumber;
    }

    public int getPushupNumber() {
        return pushupNumber;
    }

    public void setPushupNumber(int pushupNumber) {
        this.pushupNumber = pushupNumber;
    }

    public int getSitupNumber() {
        return situpNumber;
    }

    public void setSitupNumber(int situpNumber) {
        this.situpNumber = situpNumber;
    }

    public int getSquatNumber() {
        return squatNumber;
    }

    public void setSquatNumber(int squatNumber) {
        this.squatNumber = squatNumber;
    }
}
