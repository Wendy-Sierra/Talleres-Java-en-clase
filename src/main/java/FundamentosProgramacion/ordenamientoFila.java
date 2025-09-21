package FundamentosProgramacion;

import java.util.Random;

public class ordenamientoFila {
    public static void main(String[] args) {
        String[] nombres = {"Camila", "Mateo", "Luis", "Wendy", "Yordy", "Valeria", "Piedad", "Jose", "Wilson", "Brian", "Lupita", "Jack", "Alejandra", "Laura", "Luisa", "Sofia", "Luciana", "Camilo", "Juan", "Ernesto", "Santiago", "David", "Isa", "Martin", "Rodrigo"};

        Random random = new Random();

        String[] filaBanco = new String[25];
        for(int i=0; i < 25; i++){
            int index = random.nextInt(nombres.length);
            filaBanco[i] = nombres[index];
        }

        int min;
        String temp;

        for (int i = 0; i < filaBanco.length - 1; i++){
            min = i;
            for (int j = i + 1; j < filaBanco.length; j++){
                if(filaBanco[j].compareTo(filaBanco[min])<0){
                    min = j;
                }
            }
            temp = filaBanco[i];
            filaBanco[i] = filaBanco[min];
            filaBanco[min] = temp;
        }
        System.out.println("\nFila ordenada alfabeticamente");
        for(String nombre : filaBanco){
            System.out.println(nombre);
        }
    }
}
