import java.util.HashMap;
import java.util.Scanner;

public class Lesson1 {
    
   public static void main(String[] args) {
    HashMap<String, String> vaccination = new HashMap<>();
    vaccination.put("Natnael", "12/07/1998");
    vaccination.put("Yordanos", "06/20/1980");
    vaccination.put("Yonatan", "11/07/2013");
    vaccination.put("Eden", "06/18/2000");
    vaccination.put("Hawaz", "03/02/1993");
    vaccination.put("Mekdess", "10/13/1981");
    vaccination.put("Gelila", "12/31/2018");
    vaccination.put("Jose", "09/02/1990");
    vaccination.put("Abele", "10/18/1998");

    Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            if(vaccination.get(name) != null)
                System.out.println(name + " your birth date is: " + vaccination.get(name));
            else
                System.out.println("vaccination not found");

       
    
    




        
    }
}
