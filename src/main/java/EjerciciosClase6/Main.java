package EjerciciosClase6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //1. Número par o impar: Solicita un número entero y determina si es par o impar usando if/else.
        int numero;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un número entero");

        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número "+numero+" es par");
        } else {
            System.out.println("El número "+numero+" es impar");
        }

        //2. Mayor de tres números: Pide tres números al usuario y muestra cuál es el mayor utilizando if/else.
        int numero1;
        int numero2;
        int numero3;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite el primer numero entero");
        numero1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite el segundo numero entero");
        numero2 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Digite el tercer numero entero");
        numero3 = scanner3.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) {
                System.out.println("El mayor numero es "+numero1);
            } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("El mayor numero es "+numero2);
        } else {
        System.out.println("El mayor numero es "+numero3);
        }

        //3. Clasificación de edad: Solicita la edad y clasifícala como Niño, Adolescente, Adulto o Adulto mayor.
        int edad;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite su edad");
        edad = scan.nextInt();

        if (edad >= 1 && edad < 12){
            System.out.println("La edad corresponde a la de un Niño");
        } else if (edad >= 12 && edad < 18) {
            System.out.println("La edad corresponde a la de un adolescente");
        } else if (edad >= 18 && edad <60) {
            System.out.println("La edad corresponde a la de un adulto");
        } else {
            System.out.println("La edad corresponde a la de un adulto mayor");
        }

        //4. Calculadora básica: Pide dos números y una operación (+, -, *, /). Usa switch para ejecutar la operación.

        int operador1;
        int operador2;
        int operacion;

        Scanner scannerOp1 = new Scanner(System.in);
        System.out.println("Digite el primer numero");
        operador1 = scannerOp1.nextInt();

        Scanner scannerOp2 = new Scanner(System.in);
        System.out.println("Digite el segundo numero");
        operador2 = scannerOp2.nextInt();

        Scanner scannerOperacion = new Scanner(System.in);
        System.out.println("Escriba el numero de la opcion de la operación que desea realizar: ");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        operacion = scannerOperacion.nextInt();

        switch (operacion){
            case 1:
                int sum = operador1 + operador2;
                System.out.println("El resultado de la suma es "+sum);
                break;
            case 2:
                int rest = operador1 - operador2;
                System.out.println("El resultado de la resta es "+rest);
                break;
            case 3:
                int mult = operador1 * operador2;
                System.out.println("El resultado de la multiplicación es "+mult);
                break;
            case 4:
                int div = operador1 / operador2;
                System.out.println("El resultado de la división es "+div);
                break;
        }

        //5. Calificación con letras: Solicita una nota (0-100) y muestra la letra correspondiente (A-F) usando if/else.

        int nota;

        Scanner notaEstudiante = new Scanner(System.in);
        System.out.println("Digite la nota del estudiante de 0 a 100");
        nota = notaEstudiante.nextInt();

        if (nota >= 0 && nota < 20){
            System.out.println("La calificación es F");
        } else if (nota >= 20 && nota < 40) {
            System.out.println("La calificación es E");
        } else if (nota >= 40 && nota < 60) {
            System.out.println("La calificación es D");
        } else if (nota >= 60 && nota < 70) {
            System.out.println("La calificación es C");
        } else if (nota >= 80 && nota < 90) {
            System.out.println("La calificación es B");
        } else if (nota >= 90 && nota <= 100){
            System.out.println("La calificación es A");
        }

        // 6. Mes a estación: Pide el número de un mes (1-12) y muestra la estación del año con switch.

        int mes;
        
        Scanner estacion = new Scanner(System.in);
        System.out.println("Digite el mes del año que desea consultar");
        mes = estacion.nextInt();
        
        switch ( mes ){
            case 12:
            case 1:
            case 2:
                System.out.println("La estación es Invierno");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("La estación es Primavera");
            case 6:
            case 7:
            case 8:
                System.out.println("La estación es Verano");
            case 9:
            case 10:
            case 11:
                System.out.println("La estación es Otoño");
        }

        //7. Día de la semana: Solicita un número (1-7) y muestra el día correspondiente con switch.

        int dia;

        Scanner semana = new Scanner(System.in);
        System.out.println("Digite un número de 1 a 7 para conocer el día de la semana correspondiente");
        dia = semana.nextInt();

        switch (dia){
            case 1:
                System.out.println("El día es Lunes");
                break;
            case 2:
                System.out.println("El día es Martes");
                break;
            case 3:
                System.out.println("El día es Miércoles");
                break;
            case 4:
                System.out.println("El día es Jueves");
                break;
            case 5:
                System.out.println("El día es Viernes");
                break;
            case 6:
                System.out.println("El día es Sábado");
                break;
            case 7:
                System.out.println("El día es Domingo");
                break;
        }

        //8. Positivo, negativo o cero: Solicita un número y muestra si es positivo, negativo o cero usando if/else.

        int tipoNumero;

        Scanner tipo = new Scanner(System.in);
        System.out.println("Digite un número");
        tipoNumero = tipo.nextInt();

        if (tipoNumero > 0){
            System.out.println("El número es positivo");
        } else if (tipoNumero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        //9. Menú de conversión: Muestra un menú con opciones de conversión (Celsius/Fahrenheit, km/millas) usando switch.

        float conversion;
        int menu;
        float k = 0.621371f;

        Scanner opciones = new Scanner(System.in);
        System.out.println("Elija la opción que desea usar para la conversión:");
        System.out.println("1. Celsius/Fahrenheit");
        System.out.println("2. Km/Millas");
        menu = opciones.nextInt();

        Scanner convertir = new Scanner(System.in);
        System.out.println("Digite el número que desea convertir");
        conversion = convertir.nextFloat();

        switch (menu){
            case 1:
                float resultado = (conversion*1.8f)+32;
                System.out.println("La conversión en grados fahrenheit es "+resultado);
                break;
            case 2:
                float resultadoKm = conversion * k;
                System.out.println("La conversión a millas es "+resultadoKm);
                break;
        }

        //10. Cajero automático: Simula un cajero con saldo inicial de $1000 y opciones (consultar, retirar, depositar, salir).

        int saldo = 1000;
        int opcionesCajero;

        Scanner cajero = new Scanner(System.in);
        System.out.println("Digite el número de la opción que desea realizar:");
        System.out.println("1. Consulta");
        System.out.println("2. Retiro");
        System.out.println("3. Deposito");
        System.out.println("4. Salir");
        opcionesCajero = cajero.nextInt();

        switch (opcionesCajero){
            case 1:
                System.out.println("Su saldo es: "+saldo);
                break;
            case 2:
                System.out.println("Digite el valor que desea retirar");
                break;
            case 3:
                System.out.println("Digite el valor que desea depositar");
                break;
            default:
                System.out.println("Opción invalida");
        }

    }
}
