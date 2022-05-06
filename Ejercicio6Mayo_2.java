import java.util.Scanner;

import modelo.Factura;

public class Ejercicio6Mayo_2 {

    // main
    public static void main(String[] args) {
        // fact es un objeto (variable), pero esta vacia
        Factura fact=new Factura();
        Scanner ingreso=new Scanner(System.in);
        System.out.println("facturas:");
        System.out.print("Ingrese numero de factura:");
        fact.numFactura=ingreso.nextInt();

        System.out.print("Ingrese el nombre del cliente:");
        fact.nombreCliente=ingreso.next();

        System.out.print("Ingrese el apellido del cliente:");
        fact.apellidoCliente=ingreso.next();

        System.out.print("ingrese el monto:");
        fact.monto=ingreso.nextInt();    
        // \n indica un salto de linea
        // \t indica una tabulacion
        System.out.printf("Factura #%s,El nombre del cliente es %s %s, el monto es %s\n",
            fact.numFactura,fact.nombreCliente,fact.apellidoCliente,fact.monto);
        System.out.println("Factura #"+fact.numFactura+",El nombre del cliente es "+
            fact.nombreCliente+" "+fact.apellidoCliente+", el monto es "+fact.monto);
    }
    
}
