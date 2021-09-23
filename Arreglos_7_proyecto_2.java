/*
    Llevar a cabo un programa que permita completar con números 1 toda la diagonal principal 
   de una matriz de 6 x 6. Entiéndase por diagonal principal aquella que comienza en [0,0] y 
   termina en [6,6].
 */

import java.util.Scanner;

public class Arreglos_7_proyecto_2 {

    static void muestra_fila(int a[][], int b, int c) {
        int i = 0;
        System.out.println("____________________________");
        System.out.println("Muestra de datos cargados en Fila");

        do {
            System.out.println("------");
            System.out.println("| " + a[i++][c] + " | ");
            System.out.println("----");
        } while (i < b);

        System.out.println("");
    }

    static void muestra_matriz(int a[][], int b, int c) {
        int i = 0;
        int j = 0;
        System.out.println("____________________________");
        System.out.println("Muestra de datos en matriz");
        do {
            System.out.println("-------------------------------------------------------------");
            do {

                System.out.print("| " + a[i++][j] + " | ");

            } while (i < b);
            i = 0;
            j++;
            System.out.println("");
        } while (j < c);

        System.out.println("");
    }

    public static void main(String[] args) {
        int matriz[][] = new int[6][6];
        Scanner cIn = new Scanner(System.in);
        int j = 0;
        int i = 0;
        while (j < 6) {
            while (i < 6) {
                if (i == j) {
                    System.out.print("Ingrese datos para la matriz: [" + i + " ] [ " + i + " ]: ");
                    matriz[i][i++] = Integer.parseInt(cIn.nextLine());//veamos si da error aqui
                } else {
                    matriz[i++][j] = 0;
                }
            }
            System.out.println("");
            i = 0;
            j++;
        }
        muestra_matriz(matriz, 6, 6);

    }
}
