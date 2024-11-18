/***
 * Problema-1
 * 
 *Facturación de 2 productos: La empresa Amazon.com le contrata 
 * como desarrollador de Sistemas Informáticos para programar su sistema de 
 * compras online, el cual calcule el precio total de la compra para un cliente.
 * Para ello, se necesita utilizar estructuras secuenciales y de selección 
 * (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.

Requisitos:

La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos
* variantes.
Al costo total de la factura, se debe incluir los gastos por concepto de 
* transporte/envío del paquete, del cual no se aplican ningún tipo de descuentos
* o impuestos dada la excepción descrita en el punto 3.b.
El objetivo es presentar al usuario los detalles de su compra: costos, impuestos,
* descuentos, monto final dadas las siguientes condiciones: a. Si el subtotal de
* la compra (sin descuentos o gastos de envío), supera los $1000, se le otorga
* un 20% de descuento; y si es al menos los $1000 el descuento es como mínimo 
* 5%. b. Adicional, si la compra es mayor a $5000, el envío será gratuito. c.
* El IVA del 10% se debe aplicar a todos los artículos antes de agregar 
* cualquier tipo de descuesto o promoción.

 */
import java.util.Scanner;
public class Ejercicio01Facturacion {
    public static void main(String[] args) {
        String productoEscojido;
        float precioTotal=0f;
        float subTotal = 0f;
        float producto1=1200f; 
        float producto2=1000f;
        float iva=0.10f;
        float costoEnvio=7f; 
        float descuento;
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Cual de los siguintes productos deseas comprar: (A,B) ");
        System.out.println("    (A) un mircroondas   "+producto1);
        System.out.println("    (B) una bicicleta "+producto2);
        productoEscojido= tcl.next();
        switch (productoEscojido) {
            case "A", "a":
                subTotal=producto1 ;
                
                break;
            case "B","b":
                subTotal=producto2 ;
                break;
            default:
                System.out.println("Error");
                
                
        }
        if (subTotal>5000){
            costoEnvio=0f;
            descuento=0f;
        }else if (subTotal==1000.){
            descuento = 0.05f;
        }else if (subTotal>1000){
            descuento = 0.20f; 
        }else{
            descuento=0f;
        }
        
        precioTotal = subTotal - (subTotal*descuento)+costoEnvio+producto1*iva;
        System.out.println("el costo de su compra es :"+subTotal 
                +" el iva es " +iva*100+"% descuento es "+descuento*100+"%"+
                " El precio final es "+precioTotal+ "el costo del envioes"
                +costoEnvio);
        
        
        
        
    }
}
/***
 * Cual de los siguintes productos deseas comprar: (A,B) 
 *   (A) un mircroondas   1200.0
 *   (B) una bicicleta 1000.0
 *   a
*el costo de su compra es :1200.0 el iva es 10.0% descuento es 20.0% 
* El precio final es 1087.0el costo del envioes7.0
 */
