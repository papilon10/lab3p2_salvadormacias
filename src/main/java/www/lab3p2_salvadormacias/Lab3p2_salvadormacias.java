/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package www.lab3p2_salvadormacias;

/**
 *
 * @author Apple
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3p2_salvadormacias {

    static ArrayList<pokemon> lista_pokemon = new ArrayList<>();
    static ArrayList<pokeball> lista_pokeball = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("\n---menu---:");
            System.out.println("1. agregar un  pokemon");
            System.out.println("2. agregar una  pokebola");
            System.out.println("3. listar los pokemones");
            System.out.println("4. eliminar pokemon");
            System.out.println("5. capturar pokemon");
            System.out.println("6. modificar pokemon");
            System.out.println("7. Salir");

            System.out.print("Elija una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    crear_pokemon();
                    break;
                case 2:
                    crear_pokebola();
                    break;
                case 3:
                    listar_pokemones();
                    break;
                case 4:
                    eliminar_pokemon();
                    break;
                case 5:
                    capturar();
                    break;
                case 6:
                    modificar_pokemon();
                    break;
                case 7:
                    System.out.println("saliendo del programa...");
                    break;
                default:
                    System.out.println("la opcion ingresas es invalida");
                    break;
            }
        } while (option != 7);
    }//fin main

    private static void crear_pokemon() {
        System.out.println("Elija el tipo de Pokémon (1. Fire, 2. Water, 3. Grass): ");
        int typeOption = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ingrese el nombre del pokemon: ");
        String nombre = scanner.nextLine();
        System.out.print("ingrese el numero de entrada en la pokedex:");
        int entrada = scanner.nextInt();
        scanner.nextLine();
        System.out.print("ingrese la naturaleza del pokemon: ");
        String naturaleza = scanner.nextLine();

        switch (typeOption) {
            case 1:
                System.out.print("Potencia de Llamas: ");
                int flamePower = scanner.nextInt();
                lista_pokemon.add(new fire(flamePower, nombre, entrada, naturaleza, false));
                break;
            case 2:
                System.out.print("¿Puede vivir fuera del agua? (true/false): ");
                boolean canLiveOutsideWater = scanner.nextBoolean();
                System.out.print("Rapidez al nadar: ");
                int swimSpeed = scanner.nextInt();
                lista_pokemon.add(new water(canLiveOutsideWater, swimSpeed, nombre, entrada, naturaleza, false));
                break;
            case 3:
                System.out.print("Hábitat del Pokémon: ");
                String habitat = scanner.nextLine();
                System.out.print("Dominio sobre las plantas (0 - 100): ");
                int plantDominance = scanner.nextInt();
                lista_pokemon.add(new grass(habitat, plantDominance, nombre, entrada, naturaleza, false));
                break;
            default:
                System.out.println("Opción no válida.");
        }
        System.out.println("Pokémon creado exitosamente.");

    }//fin crear

    private static void crear_pokebola() {
        System.out.print("Color de la Pokebola: ");
        String color = scanner.nextLine();
        System.out.print("Número de serie: ");
        int serialNumber = scanner.nextInt();
        System.out.print("Eficiencia de atrapado (1-3): ");
        int efficiency = scanner.nextInt();
        lista_pokeball.add(new pokeball(color, serialNumber, efficiency));
        System.out.println("Pokebola creada exitosamente.");
    }//fin crear pokebola

    private static void listar_pokemones() {
        System.out.println("\nListado de Pokémon:");
        for (pokemon pokemon : lista_pokemon) {
            System.out.println(pokemon.nombre + " - " + pokemon.getClass().getSimpleName());
        }
    }//fin listar pokemones

   private static void eliminar_pokemon() {
        System.out.println("Elija el tipo de Pokémon a eliminar (1. Fire-Type, 2. Water-Type, 3. Grass-Type): ");
        int typeOption = scanner.nextInt();
        scanner.nextLine();

        ArrayList<pokemon> filteredList = new ArrayList<>();

        switch (typeOption) {
            case 1:
                filteredList = filtrar_lista(fire.class);
                break;
            case 2:
                filteredList = filtrar_lista(water.class);
                break;
            case 3:
                filteredList = filtrar_lista(grass.class);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        if (!filteredList.isEmpty()) {
            System.out.println("seleccione el indice del pokemon que sera eliminado:");
            for (int i = 0; i < filteredList.size(); i++) {
                System.out.println(i + ". " + filteredList.get(i).nombre);
            }

            int indexToDelete = scanner.nextInt();
            if (indexToDelete >= 0 && indexToDelete < filteredList.size()) {
                lista_pokemon.remove(filteredList.get(indexToDelete));
                System.out.println("Pokémon eliminado exitosamente.");
            } else {
                System.out.println("Índice no válido.");
            }
        } else {
            System.out.println("No hay Pokémon de ese tipo para eliminar.");
        }
    }//fin eliminar pokemon

}//fin clase
