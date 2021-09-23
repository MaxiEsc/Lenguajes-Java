/*
    En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas 
    de 5 ciudades de la provincia de Misiones. En el primer vector se guardan los nombres de 
    las  ciudades,  en  el  segundo  las  temperaturas  mínimas  alcanzadas  y  en  el  tercero  las 
    temperaturas  máximas  alcanzadas  en  la  última  semana.  Se  necesita  un  programa  que 
    permita la carga de las ciudades, sus temperaturas mínimas y máximas; además, deberá 
    poder informar por pantalla cual fue la ciudad con la temperatura más baja y cual con la 
    temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).
 */

import java.util.Scanner;

public class Arreglos_5_proyecto_2 {
     static void muestra_cadenas(String a[], int b) {
        int j = 0;
        System.out.println("____________________________");
        System.out.println("Muestra de datos del arreglo");
        do {
             System.out.println("--------------------");
            System.out.println("| " + a[j++] + " | ");
            System.out.println("--------------------");

        } while (j < b);
        System.out.println("");
    }
    
    static void muestra_arreglos(double a[], int b) {
        int j = 0;
        System.out.println("____________________________");
        System.out.println("Muestra de datos del arreglo");
        do {
            System.out.println("--------------------");
            System.out.println("| " + a[j++] + " | ");
            System.out.println("--------------------");

        } while (j < b);
        System.out.println("");
    }
    public static void main(String[] args) {
        final int can_prov = 5;
        String [] nombres = new String[can_prov];
        double [] temp_Min = new double[can_prov];
        double [] temp_Max = new double[can_prov];
        Scanner cIn = new Scanner(System.in);
        int i = 0;
        while (i < can_prov) {
            System.out.print("Ingrese el nombre de la ciudad: ");            
            nombres[i] = cIn.next();//nextLine por alguna razon dio error
            muestra_cadenas(nombres,(i));
            System.out.print("Ingrese la temperatura minima de la ciudad: ");
            temp_Min[i] = cIn.nextDouble();
            muestra_arreglos(temp_Min,(i));
            System.out.print("Ingrese la temperatura minima de la ciudad: ");
            temp_Max[i++] = cIn.nextDouble();            
            muestra_arreglos(temp_Max,(i-1));            
        }      
        System.out.println("Datos en total: ");
        muestra_cadenas(nombres, can_prov);
        muestra_arreglos(temp_Max, can_prov);
        muestra_arreglos(temp_Min, can_prov);
    }    
}
