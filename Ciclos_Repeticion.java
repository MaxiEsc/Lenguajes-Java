package ciclos;

public class Ciclos_Repeticion {

    public static void main(String[] args) {
        int a = 100;
        //Ciclo while
        System.out.println("ciclo while");
        while (a > 0) {

            if (a % 2 == 0) {
                System.out.println("Numero par: " + a);
            }
            a--;
        }
        System.out.println("ciclo do while");
        a = 100;
        //Ciclo do while
        do {
            if (a % 2 == 0) {
                System.out.println("Numero par: " + a);
            }
            a--;
        } while (a > 0);
        //Ciclo for
        System.out.println("ciclo for");
        for (a = 100; a > 0; a--) {
            if (a % 2 == 0) {
                System.out.println("Numero par: " + a);
            }
        }

    }
}
