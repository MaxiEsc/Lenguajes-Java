/*
    Llevar a cabo un programa que permita cargar mediante teclado una matriz de 3 x 3 (3 filas, 
    3 columnas) con razas de perros. Una vez cargada, se debe permitir al usuario ingresar por 
    teclado  una  raza  de  perro  que  quiera  buscar;  el  programa  deberá  poder  encontrarla  y 
    mostrar un mensaje con la posición  (fila, columna) donde la encontró. En caso de que la 
    raza de perro no se encuentre en la matriz, se deberá informar la situación mediante un 
    mensaje por pantalla. 
*/

import java.util.Scanner;

class Cordenadas{
    int a = 0;
    int b = 0;
    boolean si_hay = true;
}

public class Arreglos_8_proyecto_2 {
    
    static void muestra_matriz(String a[][], int b, int c) {
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

        
        
    }
    
    static Cordenadas buscar_raza(String a[][],String b, int c, int d) {        
        int i = 0;
        int j = 0;
        Cordenadas aux = new Cordenadas();
        System.out.println("____________________________");
        System.out.println("Buscar raza");
        aux.si_hay = false;
        do {            
            do {                
                if(a[i][j].equals(b)){
                    aux.a = i;
                    aux.b = j;
                    aux.si_hay = true;
                }
                i++;
            } while (i < c);
            i = 0;
            j++;
        } while (j < d);

        System.out.println("");
        return aux;
    }
     
    static void muestra_fila(String a[][], int b , int c) {
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
    
    public static void main(String[] args) {
        String razas_Perros[][] = new String[3][3];
        Cordenadas c1 = new Cordenadas();
        Scanner cIn = new Scanner(System.in);
        String busca = new String();
        int j = 0;
        int i = 0;
        while (j < 3) {
            while (i < 3) {
                System.out.print("Ingrese datos para la matriz: [" + i + " ] [ " + j + " ]: ");
                razas_Perros[i++][j] = cIn.next();
                
            }
            System.out.println("");
            i = 0;
            j++;
           
        }
        
        System.out.println("Mostrar matriz de razas de perros");
        
        System.out.println("Ingrese el nombre que Buscar en el arreglo: ");
        busca = cIn.next();
        
        muestra_matriz(razas_Perros, 3, 3);
         
        c1 = buscar_raza(razas_Perros, busca, 3, 3);
        
        System.out.println("Resultado de la busqueda : " + c1.si_hay);
        System.out.println("El resultado es columna: " + c1.a + " fila: " + c1.b);
         
        
    }
}
