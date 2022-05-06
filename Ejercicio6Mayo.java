import java.util.Scanner;

public class Ejercicio6Mayo {
    
    public int campo=20;
    // escribi main y ocupe el autocompletar

    public static void main(String[] args) {
        // estoy creando una variable, llamada sc y del tipo Scanner.
        // Scanner es una clase definida en el JDK (en las librerias de JAVA)
        // Si aparece error, no olvidar agregar el import (usando la ampolleta)
        Scanner sc=new Scanner(System.in);

        // escribir sout y usar el autocompletar        
        System.out.println("Ingrese un texto:");
        
        // voy a crear una varible llamada "st", del tipo string
        // y ademas, voy a asignarle un valor
        String st;
        st=sc.nextLine();
        System.out.println("Ingrese un numero:");
        // creo otra variable del tipo entero llamada "num".
        // y le asigno el valor que va a ingresar el usuario
        int num=sc.nextInt();
        System.out.println("El texto es "+st);
        System.out.println("el numero es "+num);
    }


}
