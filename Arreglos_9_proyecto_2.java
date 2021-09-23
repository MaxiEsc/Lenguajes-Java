
/*
    En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundario. 
    Cada fila corresponde a las notas y al promedio de cada alumno. 

    i. Se  necesita  un  programa  que  permita  a  un  profesor  cargar  en  las  3  primeras 
    posiciones de cada fila las notas del alumno y que en la última columna se calculen 
    los promedios. 
    ii. Una vez realizados los cálculos, se desea mostrar las 3 notas de cada alumno y el 
    promedio correspondiente recorriendo la matriz. Ejemplo
 */

import java.util.Scanner;

public class Arreglos_9_proyecto_2 {
    
    static void muestra_matriz(double a[][], int b, int c) {
        int i = 0;
        int j = 0;
        System.out.println("____________________________");
        System.out.println("Muestra de datos de notas en matriz");
        do {
            System.out.println("-------------------------------------------------------------");
            do {

                System.out.print("| " + a[i++][j] + " | " );

            } while (i < b);
            i = 0;
            j++;
            System.out.println("");
        } while (j < c);        
    }
    
    public static void main(String[] args) {
        final int limite = 4;
        double notas[][] = new double[limite][limite];
        Scanner cIn = new Scanner(System.in);
        int j = 0;
        int i = 0;
        while (j < limite) {
            while (i < limite-1) {
                System.out.print("Ingrese las notas del alumno : " + (j+1) + " | Nota " + (i+1) + " : ");
                notas[i][j] = cIn.nextInt();
                notas[limite-1][j] += notas[i++][j];
            }
            System.out.println("");
            i = 0;
            j++;           
        }
        muestra_matriz(notas, limite, limite);
        System.out.println("Notas Promediadas");
        j = 0;
        while (j < limite) {
            notas[limite-1][j] = notas[limite-1][j++]/3;           
        }
        System.out.println(" Nota 1 | Nota 2 | Nota 3 | PROMEDIO |");
        muestra_matriz(notas, limite, limite);
    }    
}
