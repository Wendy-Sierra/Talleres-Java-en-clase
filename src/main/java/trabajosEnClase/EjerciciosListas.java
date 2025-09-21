package trabajosEnClase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Implementa un programa que permita al usuario crear una lista de compras. El programa debe permitir agregar elementos a la lista, mostrar la lista completa y eliminar elementos específicos.
public class EjerciciosListas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> listaProductos = new ArrayList<>();

        System.out.print ("Desea agregar un producto a la lista? (true/false):");
        boolean opcion = scanner.nextBoolean();
        scanner.nextLine();

        while (opcion){
                System.out.println("Escribe el producto que deseas agregar:");
                String producto = scanner.nextLine();
                listaProductos.add(producto);

                System.out.println("Desea agregar otro producto? (true/false): ");
                opcion = scanner.nextBoolean();
                scanner.nextLine();
        }

        System.out.println("Desea eliminar productos de su lista? (true/false)");
        opcion = scanner.nextBoolean();
        scanner.nextLine();

        while (opcion){
            System.out.println("Escribe el nombre del producto que deseas eliminar:");
            String eliminar = scanner.nextLine();
            listaProductos.remove(eliminar);

            System.out.println("Desea eliminar otro producto? (true/false)");
            opcion = scanner.nextBoolean();
        }

        for (String lista:listaProductos){
            System.out.println("Los productos agregados son: ");
            System.out.println(lista);
        }

        //Crea un programa que permita al usuario ingresar una lista de números y luego los ordene de menor a mayor.
    }
}
