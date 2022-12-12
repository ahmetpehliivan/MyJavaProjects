import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(67);
        liste.add(20);
        liste.add(10);
        liste.add(8);

        liste.forEach(x -> {
            int y = x*x;
            System.out.println(y);
        });
        //liste.forEach();
    }
}