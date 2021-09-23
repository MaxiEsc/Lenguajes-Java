/*
    Un empleado desea almacenar en un vector sus 12 sueldos del año. apartir de esto 
    necesita un programa que determine y muestre por pantalla la suma total de sus 
    12 sueldos y el promedio de sueldo que tuvo en el año

 */

import java.util.Scanner;

public class Arreglos_4_proyecto_2 {
    public static void main(String[] args) {
        Scanner cIn = new Scanner(System.in);
        int longitud = 12;
        int[] arr = new int[longitud];
        int i = 0;
        double promedio = 0;
        while (i <= (longitud-1)) {
            System.out.print("Ingrese el numero del espacio: " + i + " : ");
            arr[i++] = cIn.nextInt();
            muestra(arr, i);    
            promedio += arr[(i-1)]; 
        }
        promedio = promedio / 12;
        System.out.println("El promedio total es: " + promedio);
    }
    
    public static void muestra(int a[], int b) {
        int j = 0;
        System.out.println("Muestra de sueldos cargados");
        do {
            System.out.print(" " + a[j++] + " + ");

        } while (j < b);
        System.out.println("");
    }
}
