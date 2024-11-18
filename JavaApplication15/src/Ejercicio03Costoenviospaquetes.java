/**
 * Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas 
 * según la región y el peso del paquete. Si el peso es menor de 5 kg y la 
 * región es "local", el costo es de $5. Si pesa entre 5 y 10 kg, el costo es 
 * de $10 para la región "nacional". Para cualquier otro caso, el costo es
 * de $15.
 */
import java.util.Scanner;
public class Ejercicio03Costoenviospaquetes {
    public static void main(String[] args) {
        String region; //Local,Nacional 
        float pesoKg;
        int costo=0;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa la region a la que deseas enviar(Local,Nacional) ");
        region = tcl.next();
        System.out.print("Ingreaa el peso en kg");
        pesoKg=tcl.nextFloat();
        if (pesoKg<5 && region.equals("Local")){
            costo= 5 ;
        }else if(pesoKg>=5 &&pesoKg<=10 &&region.equals("Nacional")){
            costo=10;
        }else {
            costo = 15;
        }
        System.out.println("El costo del envio es:"+costo );
    }
}
/**
 * Ingresa la region a la que deseas enviar(Local,Nacional) nacional
 *Ingreaa el peso en kg5
 *El costo del envio es:15
 */