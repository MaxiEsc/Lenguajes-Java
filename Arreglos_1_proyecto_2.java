/*
 Llevar a cabo un programa que incluya un vector que almacene los nombres
Alejandra,Leonardo,Rosa,Guillermo,Gabriel,Daniel,Luisa y Ludmila.
Realizar un recorido del vector para cargar los datos y otro para mostrar los mismos

*/
public class Arreglos_1_proyecto_2 {
    public static void main(String[] args) {
     
        String [] nombres = {"Alejandra","Leonardo","Rosa","Guillermo","Gabriel","Daniel","Luisa","Ludmila"};
        muestra(nombres);

    }    
    
    public static void muestra(String a[]){
        int i = 0;
        System.out.println("Listado de nombres: ");
        do {            
            System.out.print(" " + a[i++] + " |");
            
        } while (i < a.length);
        System.out.println("");
    }
}
