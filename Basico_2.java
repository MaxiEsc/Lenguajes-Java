
import java.util.Scanner;


public class Basico_2 {
    public static void main(String[] args) {
        int f,g;
        Scanner cIn = new Scanner(System.in);
        System.out.print("Ingrese un numero de tope: ");
        f = cIn.nextInt();
        g = 0;
        while(g < f){
            System.out.println("numero: " + (++g));            
        }        
    }
}
