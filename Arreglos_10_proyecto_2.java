/*
    Una compañía de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente, uno 
    por la mañana, otro al mediodía y otro por la noche. Para administrar estos datos, utiliza 
    una  matriz,  donde  cada  fila  es  un  destino  y  en  cada  columna  se  guarda  la  cantidad  de 
    asientos disponibles.



    Desarrollo Web Full Stack con Java – Ing. Luisina de Paula 
    i. Se  necesita  un  programa  que  permita  la  carga  de  la  matriz  con  la  cantidad  de 
    asientos para cada vuelo. 

    ii. Al  mismo  tiempo,  el  programa  debe  permitir  a  un  usuario  ingresar  el  número  de 
    destino al que quiere dirigirse, el número de vuelo (dependiendo si quiere viajar a la 
    mañana, al mediodía o a la noche) y la cantidad de pasajes que necesita.  

    iii. A  partir  de  la  solicitud  del  usuario,  el  programa  debe  controlar  si  hay  la  cantidad 
    suficiente de asientos para la cantidad de pasajes que se requiere. En caso de que 
    así sea, se debe mostrar un cartel por pantalla que diga “su reserva fue realizada 
    con éxito” y se debe descontar del total de asientos los solicitados por el usuario. En 
    caso de no haber más asientos disponibles, se debe informar otro cartel que diga 
    “disculpe, no se pudo completar su operación dado que no hay asientos disponibles”.
 */

import java.util.Scanner;

public class Arreglos_10_proyecto_2 {

    static void muestra(int a[][]) {

        String destinos[] = {" Rio de Janeiro |", "     Cancun     |", "     Madrid     |", "      Roma      |", "      Milan     |", "     Iguazu     |"};
        String horarios = "                       |           Mañana    |    Mediodia    |   Noche    |";
        String numero = "                       |              0      |       1        |     2      |";
        System.out.println("" + horarios);
        System.out.println("" + numero);
        System.out.println("_______________________________________________________________________________");
        int j = 0;
        int i = 0;
        while (j < 5) {
            System.out.print(" [" + j + "] = " + destinos[j]);
            while (i < 3) {
                System.out.print("              " + a[i++][j]);
            }
            System.out.println("");
            i = 0;
            j++;
        }
        System.out.println("_______________________________________________________________________________");
    }

    static int[][] carga_vuelos(int a[][]) {
        int j = 0;
        int i = 0;
        int[][] aux = new int[3][5];
        Scanner cIn = new Scanner(System.in);
        muestra(a);
        while (j < 5) {
            System.out.println("cargar vuelos en " + ((j == 0) ? " Rio de Janeiro " : (j == 1) ? " Cancun" : (j == 2) ? " Madrid " : (j == 3) ? " Roma " : (j == 4) ? " Milan " : "Iguazu"));
            while (i < 3) {
                System.out.println(" cargar cantidad de vuelos a la " + ((i == 0) ? " Mañana " : (i == 1) ? " Mediodia" : "Noche "));
                aux[i++][j] = cIn.nextInt();
            }
            System.out.println("");
            i = 0;
            j++;
        }
        return aux;
    }

    static void comprar_vuelos(int a[][]) {
        int j = 0;
        int horario = 0;
        int cantidad = 0;
        int i = 0;
        int destino = 0;
        int[][] aux = new int[3][5];
        Scanner cIn = new Scanner(System.in);
        do {
            System.out.println("0 = | Rio de Janeiro |1 = |      Cancun     |2 = |     Madrid     |3 = |      Roma      |4 = |      Milan     |5 = |     Iguazu     |");
            System.out.println("Ingrese el destino donde desea comprar el vuelos: ");
            destino = cIn.nextInt();
            System.out.println("Ingrese el horario que desea para comprar el ticket de vuelo: ");
            horario = cIn.nextInt();
            if (destino < -1 || destino > 5) {
                System.out.println("Ingrese un numero entre 1 y 5, no hay mas destino en funcionamiento");
            }
            if (horario < -1 || horario > 3) {
                System.out.println("Ingrese un numero entre 1 y 3, no hay mas horarios disponibles");
            }
        } while (destino < -1 || destino > 5 || horario < -1 || horario > 3);
        do {
            System.out.println("Ingrese la cantidad de tickets que desea para el vuelo: ");
            cantidad = cIn.nextInt();

            if (a[horario][destino] - cantidad < 0) {
                System.out.println("disculpe, no se pudo completar su operación dado que no hay asientos disponibles");
            }
        } while (a[horario][destino] - cantidad < 0);
        a[horario][destino] = a[horario][destino] - cantidad;
        System.out.println("su reserva fue realizada \n" + "con éxito");
    }

    public static void main(String[] args) {

        int vuelos[][] = new int[3][5];
        Scanner cIn = new Scanner(System.in);
        int j = 0;
        int i = 0;
        String opcion = "";

        do {
            muestra(vuelos);
            System.out.println("Ingrese sus opciones correspondientes ");
            System.out.println("'carga': para cargar viajes ");
            System.out.println("'destino': para comprar viajes en donde y pasajes necesarios ");
            System.out.println("'finish' : para salir del programa");
            System.out.print("Ingrese la opcion deseada: -> ");
            opcion = cIn.next();
            switch (opcion) {
                case "carga":
                    System.out.println("Ingrese los datos para carga los pasajes en el sistema: ");
                    vuelos = carga_vuelos(vuelos);
                    break;
                case "destino":
                    System.out.println("Ingrese sus opciones de compra: ");
                    comprar_vuelos(vuelos);
                    break;
            }
        } while (!opcion.equals(("finish")));

    }
}
