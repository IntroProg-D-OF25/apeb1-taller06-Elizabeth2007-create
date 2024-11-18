/***
 * Clasificación de un triángulo Dado tres valores que representan las
 * longitudes de los lados de un triángulo, determinar su tipo. Las reglas son:

Si todos los lados son iguales, mostrar "Triángulo equilátero".
Si dos lados son iguales, mostrar "Triángulo isósceles".
Si todos los lados son diferentes, mostrar "Triángulo escaleno".
Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo".
 */
import java.util.Scanner;
public class Ejercicio02ClasificaciónTriangulos {
    public static void main(String[] args) {
        float lado1=0,lado2=0,lado3=0;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa lado1 :");
        lado1=tcl.nextFloat();
        System.out.print("Ingresa lado 2 :");
        lado2=tcl.nextFloat();
        System.out.print("Ingresa lado 3 :");
        lado3=tcl.nextFloat();
        if (lado1+lado2<=lado3||lado1+lado3<=lado2||lado3+lado2<=lado1){
            System.out.println("no es un triangulo ");
        }else if ((lado1==lado2)&&(lado2==lado3)&&(lado3==lado1)){
            System.out.println("Es un triangulo equilátero");
        }else if((lado1==lado2) ||(lado2==lado3)|| (lado1==lado3)){
            System.out.println("Es un triangulo isósceles ");
        }else if((lado1!=lado2) &&(lado2!=lado3)&& (lado1!=lado3)){
            System.out.println("Es un triangulo escaleno");
        }
    }
}
/***
 * Ingresa lado1 :5
Ingresa lado 2 :5
Ingresa lado 3 :5
Es un triangulo equil�tero
 */
