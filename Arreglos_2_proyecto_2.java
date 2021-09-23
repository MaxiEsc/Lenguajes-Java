
/*
Realizar un programa que permita la carga de 10 numeros en un vector. Una vez 
cargados,se necesita que el programa determine cual es el menor de ellos.
 */
import java.util.Scanner;

public class Arreglos_2_proyecto_2 {

    public static void main(String[] args) {
        Scanner cIn = new Scanner(System.in);
        int[] arr = new int[10];
        int i = 0;
        int menor;
        while (i <= 9) {
            System.out.print("Ingrese el numero del espacio: " + i + " : ");
            arr[i++] = cIn.nextInt();
            muestra(arr, i);
        }
        menor = arr[0];
        for (int j = 0; j < 10; j++) {
            
            if (menor > arr[j]) {
                menor = arr[j];
            }
        }
        System.out.println("El menor es: " + menor);
    }

    public static void muestra(int a[], int b) {
        int j = 0;
        System.out.println("Muestra de datos cargados");
        do {
            System.out.print("| " + a[j++] + " |");

        } while (j < b);
        System.out.println("");
    }
}
