package trabajosEnClase;
//Conversion de pesos a dolares
import Clase2.Main;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de pesos que desea convertir a dolares:");
        int pesos = scanner.nextInt();
        System.out.println("La cantidad en dolares es $"+pesos/4000);

        scanner.close();
    }
}
