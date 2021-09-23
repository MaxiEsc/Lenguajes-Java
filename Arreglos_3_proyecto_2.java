/*

    Realizar un programa que permita la carga de 15 numeros en un vector. una vez 
    cargados, se necesita que el programa cuente e informe por pantalla cuantas se 
    cargo el numero 3

 */

import java.util.Scanner;

public class Arreglos_3_proyecto_2 {
    public static void main(String[] args) {
        Scanner cIn = new Scanner(System.in);
        int longitud = 15;
        int[] arr = new int[longitud];
        int i = 0;
        int centinela = 0;
        while (i <= (longitud-1)) {
            System.out.print("Ingrese el numero del espacio: " + i + " : ");
            arr[i++] = cIn.nextInt();
            muestra(arr, i);
            if(arr[i-1] == 3){
                centinela++;
            }
        }
        System.out.println("Se cargaron el numero 3 un total de: " + centinela + ((centinela > 1)? " veces ": " vez") );
        
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
