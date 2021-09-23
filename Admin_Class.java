
import java.util.Scanner;
//Ejercicio 3
public class Admin_Class {

    public static void main(String[] args) {
        String text;
        int ctr = 0;
        int clave = 123;
        Scanner teclado = new Scanner(System.in);
        while (ctr < 3) {
            System.out.println("Ingrese el usuario y la contraseña");
            System.out.println("Ingrese el usuario: ");
            text = teclado.nextLine();
            System.out.println("Ingrese la clave: ");
            clave = Integer.parseInt(teclado.nextLine());

            if (text.equals("admin") && clave == 123) {
                System.out.println("Contraseña Correcta");
                break;
            } else {
                System.out.println("Contraseña incorrecta " + (2 - ctr) + " Intentos restantes ");
                ctr++;
            }
        }
        if (ctr == 3) {
            System.out.println("Ingreso bloqueados por abuso de intentos");
        } else {
            System.out.println("Ingreso satisfactorio, Bienvenido");
        }
    }
}
