package Clase4;

import trabajosEnClase.Bebida;

public class Main {
    public static void main(String[] args) {
        Bebida bebida = new Bebida("Maracumbé", 340, "Maracuyá");
        bebida.setSabor("Lulo");
        System.out.println(bebida.getContenido());
        System.out.println(bebida.getSabor());
    }
}
