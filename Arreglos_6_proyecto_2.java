
import java.util.Scanner;

/*
    Llevar a cabo un programa que permite cargar completamente con números 5 una matriz 
    de 4x5 (4 filas, 5 columnas).
 */
public class Arreglos_6_proyecto_2 {

    static void muestra_fila(int a[][], int b , int c) {
        int i = 0;
        System.out.println("____________________________");
        System.out.println("Muestra de datos de Fila");

        do {
            System.out.println("------");
            System.out.println("| " + a[i++][c] + " | ");
            System.out.println("----");
        } while (i < b);

        System.out.println("");
    }
    
    static void muestra_matriz(int a[][], int b , int c) {
        int i = 0;
        int j= 0;
        System.out.println("____________________________");
        System.out.println("Muestra de datos de Fila");
        do {         
            System.out.println("-------------------------------------------------------------");
            do {
                
                System.out.print("| " + a[i++][j] + " | ");
               
            } while (i < b);
            i= 0;
            j++;
            System.out.println("");
        } while (j < c);

        System.out.println("");
    }

    public static void main(String[] args) {
        int matriz[][] = new int[5][4];
        Scanner cIn = new Scanner(System.in);
        int j = 0;
        int i = 0;
        while (j < 4) {
            while (i < 5) {
                System.out.print("Ingrese datos para la matriz: [" + i + " ] [ " + j + " ]: ");
                matriz[i++][j] = Integer.parseInt(cIn.nextLine());//veamos si da error aqui
                muestra_fila(matriz, (i - 1),j);
            }
            System.out.println("");
            i = 0;
            j++;
        }
        muestra_matriz(matriz, 5, 4);
    }
}
