package Clase6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] nombres = new String[10];
        System.out.println(nombres.length);

        nombres[0]="Wendy";
        nombres[1]="Carlos";
        nombres[2]="Carlota";
        nombres[3]="Wilson";

        Arrays.stream(nombres).forEach(System.out::println);
    }
}
