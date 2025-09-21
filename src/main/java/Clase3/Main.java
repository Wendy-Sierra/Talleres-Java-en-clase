package Clase3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Opcion 1 null
        //Scanner paraPonerDatosPorConsola=null;
        //Opcion 2 inicializar el objeto
        Scanner paraPonerDatosPorConsola= new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = paraPonerDatosPorConsola.nextLine();
        System.out.println("Imp..."+nombre);

        System.out.println("Ingrese su edad");
        int edad = paraPonerDatosPorConsola.nextInt();
        System.out.println("Imp..."+edad);

        //Se recomienda siempre cerrar el metodo Scanner
        paraPonerDatosPorConsola.close();
    }
}
