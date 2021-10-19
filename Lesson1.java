import java.util.HashMap;
import java.util.Scanner;

public class Lesson1 {
    
   public static void main(String[] args) {
    HashMap<String, String> vaccination = new HashMap<>();
    vaccination.put("Natnael", "pfizer-alpha");
    vaccination.put("Yordanos", "moderna-alpha");
    vaccination.put("Yonatan", "johnson-alpha");
    vaccination.put("Eden", "pfizer-omega");
    vaccination.put("Hawaz",  "pfizer-kappa");
    vaccination.put("Mekdess", "moderna-delta");
    vaccination.put("Gelila", "moderna-gamma");
    vaccination.put("Jose", "moderna-zeta");
    vaccination.put("Abele", "moderna-zeta");

    Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            if(vaccination.get(name) != null)
                System.out.println(name + " your vaccination name is: " + vaccination.get(name));
            else
                System.out.println("vaccination not found");

       
    
    




        
    }
}
