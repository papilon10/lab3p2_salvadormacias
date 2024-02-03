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

    public static ArrayList<pokemon> lista_pokemon = new ArrayList<>();
    public static ArrayList<pokeball> lista_pokeball = new ArrayList<>();
    public static Scanner lea = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int opc;

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
            opc = lea.nextInt();
            lea.nextLine();

            switch (opc) {
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
        } while (opc != 7);
    }//fin main

    private static void crear_pokemon() {
        System.out.println("Elija el tipo de Pokémon (1. Fire, 2. Water, 3. Grass): ");
        int tipo_opc = lea.nextInt();
        lea.nextLine();
        System.out.print("ingrese el nombre del pokemon: ");
        String nombre = lea.nextLine();
        System.out.print("ingrese el numero de entrada en la pokedex:");
        int entrada = lea.nextInt();
        lea.nextLine();
        System.out.print("ingrese la naturaleza del pokemon: ");
        String naturaleza = lea.nextLine();

        switch (tipo_opc) {
            case 1:
                System.out.print("Ingrese la potencia de las llamas: ");
                int potencia = lea.nextInt();
                lista_pokemon.add(new fire(potencia, nombre, entrada, naturaleza, false));
                break;
            case 2:
                System.out.print("ingrese si puede vivir fuera del agua [true/false]): ");
                boolean vivir = lea.nextBoolean();
                System.out.print("ingrese la rapidez al nadar: ");
                int rapidez = lea.nextInt();
                lista_pokemon.add(new water(vivir, rapidez, nombre, entrada, naturaleza, false));
                break;
            case 3:
                System.out.print("ingrese el habitat del pokemon: ");
                String habitat = lea.nextLine();
                System.out.print("ingrese el dominio [0-100]: ");
                int dominio = lea.nextInt();
                lista_pokemon.add(new grass(habitat, dominio, nombre, entrada, naturaleza, false));
                break;
            default:
                System.out.println("Opción no válida.");
        }
        System.out.println("Pokémon creado exitosamente.");

    }//fin crear

    private static void crear_pokebola() {
        System.out.print("Color de la Pokebola: ");
        String color = lea.nextLine();
        System.out.print("Número de serie: ");
        int numero_serie = lea.nextInt();
        System.out.print("Eficiencia de atrapado (1-3): ");
        int eficencia = lea.nextInt();
        lista_pokeball.add(new pokeball(color, numero_serie, eficencia));
        System.out.println("Pokebola creada exitosamente.");
    }//fin crear pokebola

    private static void listar_pokemones() {
        System.out.println("\nListado de Pokémon:");
        for (pokemon pokemon : lista_pokemon) {
            System.out.println(pokemon.nombre + " - " + pokemon.getClass().getSimpleName());
        }
    }//fin listar pokemones

    private static void eliminar_pokemon() {
        System.out.println("ingrese el tipo de pokemon a eliminar (1. Fire, 2. Water, 3. Grass): ");
        int tipo_opc = lea.nextInt();
        lea.nextLine();
        ArrayList<pokemon> lista_filtrada = new ArrayList<>();

        switch (tipo_opc) {
            case 1:
                lista_filtrada = filtrar_lista(fire.class);
                break;
            case 2:
                lista_filtrada = filtrar_lista(water.class);
                break;
            case 3:
                lista_filtrada = filtrar_lista(grass.class);
                break;
            default:
                System.out.println("la opcion ingresada es invalidad.");
        }

        if (!lista_filtrada.isEmpty()) {
            System.out.println("seleccione el indice del pokemon que sera eliminado:");
            for (int i = 0; i < lista_filtrada.size(); i++) {
                System.out.println(i + ". " + lista_filtrada.get(i).nombre);
            }

            int indexToDelete = lea.nextInt();
            if (indexToDelete >= 0 && indexToDelete < lista_filtrada.size()) {
                lista_pokemon.remove(lista_filtrada.get(indexToDelete));
                System.out.println("el pokemon se elimino con exito.");
            } else {
                System.out.println("indice ingresado es invalido.");
            }
        } else {
            System.out.println("No hay pokemones de ese tipo para eliminar.");
        }
    }//fin eliminar pokemon

    private static ArrayList<pokemon> filtrar_lista(Class<?> type) {
        ArrayList<pokemon> filtro = new ArrayList<>();
        for (pokemon pokemon : lista_pokemon) {
            if (type.isInstance(pokemon)) {
                filtro.add(pokemon);
            }
        }
        return filtro;
    }

    private static void capturar() {
        if (lista_pokeball.isEmpty() || lista_pokemon.isEmpty()) {
            System.out.println("no hay pokebolas o pokemones para capturar.");
            return;
        }

        System.out.println("Ingrese la pokebola:");
        for (int i = 0; i < lista_pokeball.size(); i++) {
            System.out.println(i + ". " + lista_pokeball.get(i).color);
        }

        int indice_pokebola = lea.nextInt();
        if (indice_pokebola < 0 || indice_pokebola >= lista_pokeball.size()) {
            System.out.println("el indice ingresado es invalido.");
            return;
        }

        pokeball seleccionada = lista_pokeball.get(indice_pokebola);

        ArrayList<pokemon> pokemones_disponibles = pokemones_encontrados();
        if (pokemones_disponibles.isEmpty()) {
            System.out.println("No hay pokemones disponibles para capturar .");
            return;
        }

        pokemon capturado = pokemones_disponibles.get(random.nextInt(pokemones_disponibles.size()));
        System.out.println("el pokemon " + capturado.nombre + " se ha aparecido!!!!");

        System.out.println("Ingrese si desea intentar capturarlo o huir? [1.capturar/2.huir]: ");
        int captura_opc = lea.nextInt();
        if (captura_opc == 1) {
            intento_captura(seleccionada, capturado);
        } else if (captura_opc == 2) {
            System.out.println("Huyo del encuentro.");
        } else {
            System.out.println("la opcion ingresada es invalida.");
        }
    }//fin capturar

    private static ArrayList<pokemon> pokemones_encontrados() {
        ArrayList<pokemon> pokemones_disponibles = new ArrayList<>();
        for (pokemon pokemon : lista_pokemon) {
            if (!pokemon.atrapado) {
                pokemones_disponibles.add(pokemon);
            }
        }
        return pokemones_disponibles;
    }

    private static void intento_captura(pokeball pokeball, pokemon pokemon) {
        double chance_cap = 0.0;

        switch (pokeball.eficencia) {
            case 1:
                chance_cap = 1.0 / 3.0;
                break;
            case 2:
                chance_cap = 2.0 / 3.0;
                break;
            case 3:
                chance_cap = 1.0;
                break;
        }

        if (random.nextDouble() <= chance_cap) {
            pokemon.atrapado = true;
            lista_pokeball.remove(pokeball);
            System.out.println("¡se ha capturado a" + pokemon.nombre + " exitosamente!!!!");
        } else {
            lista_pokeball.remove(pokeball);
            System.out.println("No se ha podido capturar a " + pokemon.nombre + "");
        }
    }//fin captura2

    private static void modificar_pokemon() {
        if (lista_pokemon.isEmpty()) {
            System.out.println("No hay pokemones disponibles a modificar.");
            return;
        }

        System.out.println("Seleccione el tipo de Pokémon a modificar (1. fire, 2. water, 3. grass): ");
        int tipo_opc = lea.nextInt();
        lea.nextLine();

        ArrayList<pokemon> lista_filtrada = new ArrayList<>();

        switch (tipo_opc) {
            case 1:
                lista_filtrada = filtrar_lista(fire.class);
                break;
            case 2:
                lista_filtrada = filtrar_lista(water.class);
                break;
            case 3:
                lista_filtrada = filtrar_lista(grass.class);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        if (!lista_filtrada.isEmpty()) {
            System.out.println("Seleccione el indice del pokemon a modificar:");
            for (int i = 0; i < lista_filtrada.size(); i++) {
                System.out.println(i + ". " + lista_filtrada.get(i).nombre);
            }

            int indice_mod = lea.nextInt();
            if (indice_mod >= 0 && indice_mod < lista_filtrada.size()) {
                modificar_atributos(lista_filtrada.get(indice_mod));
            } else {
                System.out.println("el indice es invalido.");
            }
        } else {
            System.out.println("no hay pokemons de este tipo a modificar");
        }
    }//fin modificar

    private static void modificar_atributos(pokemon pokemon) {
        System.out.println("Seleccione el atributo a modificar:");
        System.out.println("1. nombre");
        System.out.println("2. numero de la pokedex");
        System.out.println("3. Atributo especifico de un tipo de pokemon");

        int atributo = lea.nextInt();
        lea.nextLine();

        switch (atributo) {
            case 1:
                System.out.print("ingrese el nuevo nombre: ");
                String nuevo_nombre = lea.nextLine();
                pokemon.nombre = nuevo_nombre;
                System.out.println("Nombre modificado exitosamente.");
                break;
            case 2:
                System.out.print("ingrese el nuevo numero de la pokedex: ");
                int nuevo_numero = lea.nextInt();
                pokemon.entrada = nuevo_numero;
                System.out.println("se modifico el numero de la pokedex.");
                break;
            case 3:
                if (pokemon instanceof fire) {
                    modificar_fuego((fire) pokemon);
                } else if (pokemon instanceof water) {
                    modificar_agua((water) pokemon);
                } else if (pokemon instanceof grass) {
                    modificar_grass((grass) pokemon);
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }//fin mod especifico

    private static void modificar_fuego(fire tipo_agua) {
        System.out.print("Nueva potencia de llamas: ");
        int potencia = lea.nextInt();
        tipo_agua.potencia = potencia;
        System.out.println("se modifico exitosamente...");
    }

    private static void modificar_agua(water tipo_water) {
        System.out.print("¿Puede vivir fuera del agua? (true/false): ");
        boolean vivir = lea.nextBoolean();
        System.out.print("Nueva rapidez al nadar: ");
        int rapidez = lea.nextInt();
        tipo_water.vivir = vivir;
        tipo_water.rapidez = rapidez;
        System.out.println("se modifico exitosamente...");
    }

    private static void modificar_grass(grass tipo_grass) {
        System.out.print("Nuevo hábitat del Pokémon: ");
        String nuevo_habitat = lea.nextLine();
        System.out.print("Nuevo dominio sobre las plantas [0-100]: ");
        int dominio = lea.nextInt();
        tipo_grass.habitat = nuevo_habitat;
        tipo_grass.dominio = dominio;
        System.out.println("se modifico exitosamente...");
    }

}//fin clase
