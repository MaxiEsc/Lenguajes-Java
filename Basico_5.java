
import java.util.Scanner;


public class Basico_5 {
    public static void main(String[] args) {
        String toque = "";
        Scanner cIn = new Scanner(System.in);
        while(!toque.equals("salir")){
            System.out.print("Ingrese por teclado palabras: ");
            toque = cIn.nextLine();
        }
        System.out.println("Bien hecho");
    }
}
