
import java.util.Scanner;
//Ejercicio 2

public class Dias_Mes_Numero {
    public static void main(String[] args) {
       int dias,mes,numero;
       Scanner teclado = new Scanner(System.in);
       String s_dias = " ";
       String s_mes = " ";
       
       do{
           
           System.out.println("Ingrese el mes ( 1 al 12): ");
           mes = teclado.nextInt();
           System.out.println("Ingrese el dia ( 1 al 7): ");
           dias = teclado.nextInt();
           System.out.println("Ingrese el numero del mes (1 al 31 con excepciones): ");
           numero = teclado.nextInt();
           
           if((dias < 0 || dias > 7 && mes < 0 || mes >  12 && numero < 0 || numero > 31) || (mes == 2 && (numero < 0 || numero >= 29)) || 
               (( mes == 4 || mes == 6 || mes == 9 || mes == 11 ) && ( numero < 0 || numero >= 30))){
               System.out.println("Ingrese un numero que cumpla con las condiciones de mes, dia y numero correspondiente, fijarse que hay meses que tienen hasta solo 30 dias");
               
           }else{
               switch(dias){
                   case 1: s_dias = "Lunes";
                       break;
                   case 2: s_dias = "Martes";
                       break;
                   case 3: s_dias = "Miercoles";
                       break;
                   case 4: s_dias = "Jueves";
                       break;                       
                   case 5: s_dias = "Viernes";
                       break;
                   case 6: s_dias = "Sabado";
                       break;
                   case 7: s_dias = "Domingo";
                       break;                   
               }
               switch(mes){
                   case 1: s_mes = "Enero";
                       break;
                   case 2: s_mes = "Febrero";
                       break;
                   case 3: s_mes = "Marzo";
                       break;
                   case 4: s_mes = "Abril";
                       break;                       
                   case 5: s_mes = "Mayo";
                       break;
                   case 6: s_mes = "Junio";
                       break;
                   case 7: s_mes = "Julio";
                       break;
                   case 8: s_mes = "Agosto";
                       break;
                   case 9: s_mes = "Septiembre";
                       break;
                   case 10: s_mes = "Octubre";
                       break;
                   case 11: s_mes = "Noviembre";
                       break;
                   case 12: s_mes = "Diciembre";
               }
               
               System.out.println("La fecha ingresada es: " + s_dias + " " + numero + " " + s_mes);
               
           }           
       }while((dias < 0 || dias > 7 && mes < 0 || mes >  12 && numero < 0 || numero > 31) || (mes == 2 && (numero < 0 || numero >= 29)) || 
               (( mes == 4 || mes == 6 || mes == 9 || mes == 11 ) && ( numero < 0 || numero >= 30)));
    
    }
}
