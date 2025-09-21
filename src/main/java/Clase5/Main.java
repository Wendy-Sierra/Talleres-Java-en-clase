package Clase5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int edad = 55;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su edad");

        edad = scanner.nextInt();

        if (edad >= 18 && edad <80) {

            System.out.println("Puede entrar al bar");
        }else{
            System.out.println("No puede entrar al bar");
        }

        scanner.close();

        int diaDeLaSemana = 2;

                switch (diaDeLaSemana){
                    case 1:
                        System.out.println("Es Lunes");
                        break;
                    case 2:
                        System.out.println("Es Martes");
                        break;
                    case 3:
                        System.out.println("Es Miercoles");
                        break;
                    default:
                        System.out.println("Es otro día");
                }
    }
}
