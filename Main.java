@@ -0,0 +1,61 @@
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        

        Scanner scanner = new Scanner(System.in);
        
        File file = new File("CKay - Love Nwantiti.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while(!response.equals("Q")){
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.print("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch(response){
                case ("P"): clip.start();
                break;
                case ("S"): clip.stop();
                break;
                case ("R"): clip.setMicrosecondPosition(0);
                break;
                case ("Q"): clip.close();
                break;
                default: System.out.println("Not a valid respons"); 

                #include <stdio.h>
                #include <conio.h>
                int main ()
                {
                   FILE *fptr;
                   fptr = fopen("an_2.txt","w+");
                   fputs("Welcome_to_educba", fptr);
                   fseek( fptr, 7 , SEEK_SET );
fputs("Learning_to_code_Java", fptr);
fclose(fptr);
return(0);
}
    
}

            
            
            }
 
        }

        System.out.println("Byeeee!");



        
        

        
   
        
    }
    
}

