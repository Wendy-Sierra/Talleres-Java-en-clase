package Clase6;

import java.util.ArrayList;
import java.util.List;

public class MainCiclos {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 5){
            System.out.println(contador);
            contador++;
        }

        contador = 0;
        do{
            System.out.println(contador);
            contador++;
        }while (contador < 5);

        List<String> nombreLista = new ArrayList<>();
        nombreLista.add("Juan");
        nombreLista.add("Carlos");
        nombreLista.add("Pedro");

        for (int cont = 0; cont < nombreLista.size(); cont++) {
            System.out.println(nombreLista.get(cont));
        }

        for(String tmp:nombreLista){
            System.out.println(tmp);
        }
    }
}
