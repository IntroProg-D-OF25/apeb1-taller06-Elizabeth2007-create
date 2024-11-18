/***
 * Determinar el tipo de operación matemática. Dado un número del 1 al 4 que
 * representa una operación matemática básica (suma, resta, multiplicación, 
 * división), muestra el nombre de la operación correspondiente. Por ejemplo,
 * si el usuario ingresa 1, debe mostrar "Suma"; si ingresa 2, debe mostrar
 * "Resta", y así sucesivamente.
 */
import java.util.Scanner;
public class Ejercicio05OperaciónMatematica {
    public static void main(String[] args) {
        int numero ;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa un numero ");
        numero =tcl.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Suma");
                break;
            case 2:
                System.out.println("Resta");
                break;
            case 3:
                System.out.println("División ");
                break;
            case 4:
                System.out.println("Multiplicación ");
                break;    
            default:
                System.out.println("error en el número que ingresaste");
        }
    }
}
/***
 * Ingresa un numero 4
 * Multiplicaci�n 
 */