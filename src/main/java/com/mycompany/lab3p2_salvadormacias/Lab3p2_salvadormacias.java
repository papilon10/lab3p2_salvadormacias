/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab3p2_salvadormacias;

import java.awt.Color;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author papilon10
 */
public class Lab3p2_salvadormacias {

    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);
    public static ArrayList<vehiculo> vehiculos = new ArrayList();

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 8) {
            System.out.println("---Bienvenido al sitema de registro---\n");
            System.out.println("1.Agregar automovil\n"
                    + "2.Agregar motocicleta\n"
                    + "3.Agregar autobus\n"
                    + "4.Modificar vehiculo\n"
                    + "5.Eliminar vehiculo\n"
                    + "6.Mostrar vehiculo\n"
                    + "7.Generar boletas\n"
                    + "8.Salir\n");
            opcion = lea.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese el numero de placa: ");
                String numero_placa = str.nextLine();
                System.out.println("Ingrese la marca: ");
                String marca = str.nextLine();
                System.out.println("Ingrese el modelo: ");
                String modelo = str.nextLine();
                System.out.println("Ingrese el tipo: ");
                String tipo = str.nextLine();
                System.out.println("Ingrese el color: ");
                String color = str.nextLine();
                System.out.println("Ingrese el ano de creacion en formato \"dd/MM/yyyy\");\n");
                String fecha = str.nextLine();
                DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate year = LocalDate.parse(fecha, formatoFecha);
                System.out.println("Ingrese el tipo de combustible: ");
                String tipo_combustible = str.nextLine();
                System.out.println("Ingrese el numero de puertas: ");
                int numero_puertas = lea.nextInt();
                String tipo_transmision = "";
                System.out.println("Ingrese el tipo de trasmision [1.Automatica/2.Mecanica]: ");
                int x = lea.nextInt();
                if (x == 1) {
                    tipo_transmision = "automatica";

                } else if (x == 2) {
                    tipo_transmision = "mecanica";
                }
                System.out.println("Ingrese el numero de asientos: ");
                int numero_asientos = lea.nextInt();
                vehiculos.add(new automovil(tipo_combustible, numero_puertas, tipo_transmision, numero_asientos));

            } else if (opcion == 2) {
                System.out.println("Ingrese el numero de placa: ");
                String numero_placa = str.nextLine();
                System.out.println("Ingrese la marca: ");
                String marca = str.nextLine();
                System.out.println("Ingrese el modelo: ");
                String modelo = str.nextLine();
                System.out.println("Ingrese el tipo: ");
                String tipo = str.nextLine();
                System.out.println("Ingrese el color: ");
                String color = str.nextLine();
                System.out.println("Ingrese el ano de creacion en formato \"dd/MM/yyyy\");\n");
                String fecha = str.nextLine();
                DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate year = LocalDate.parse(fecha, formatoFecha);
                System.out.println("Ingrese la velocidad maxima: ");
                int velocidad_maxima = lea.nextInt();
                System.out.println("Ingrese el peso: ");
                double peso = lea.nextDouble();
                System.out.println("Ingrese el consumo de combustible: ");
                int tipo_combustible = lea.nextInt();
                vehiculos.add(new motocicleta(velocidad_maxima, peso, tipo_combustible));

            } else if (opcion == 3) {
                System.out.println("Ingrese el numero de placa: ");
                String numero_placa = str.nextLine();
                System.out.println("Ingrese la marca: ");
                String marca = str.nextLine();
                System.out.println("Ingrese el modelo: ");
                String modelo = str.nextLine();
                System.out.println("Ingrese el tipo: ");
                String tipo = str.nextLine();
                System.out.println("Ingrese el color: ");
                String color = str.nextLine();
                System.out.println("Ingrese el ano de creacion en formato \"dd/MM/yyyy\");\n");
                String fecha = str.nextLine();
                DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate year = LocalDate.parse(fecha, formatoFecha);
                System.out.println("Ingrese la capacidad de pasajeros: ");
                int capacidad_pasajeros = lea.nextInt();
                System.out.println("Ingrese el numero de ejes: ");
                int numero_ejes = lea.nextInt();
                System.out.println("Ingrese la longitud: ");
                int longitud = lea.nextInt();
                vehiculos.add(new autobus(capacidad_pasajeros, numero_ejes, longitud, numero_placa, marca, modelo, tipo, color, year));

            } else if (opcion == 4) {
                listarvehiculos();
                listarvehiculos2();
                listarvehiculos3();
                System.out.println("Ingrese la posicion del vehiculo a modificar: ");
                int pos = lea.nextInt();
                if (vehiculos.size() > 0 && vehiculos.size() >= pos) {
                    if (vehiculos.get(pos) instanceof automovil) {
                        System.out.println("Ingrese el numero de placa: ");
                        String numero_placa = str.nextLine();
                        System.out.println("Ingrese la marca: ");
                        String marca = str.nextLine();
                        System.out.println("Ingrese el modelo: ");
                        String modelo = str.nextLine();
                        System.out.println("Ingrese el tipo: ");
                        String tipo = str.nextLine();
                        System.out.println("Ingrese el color: ");
                        String color = str.nextLine();
                        System.out.println("Ingrese el ano de creacion en formato \"dd/MM/yyyy\");\n");
                        String fecha = str.nextLine();
                        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate year = LocalDate.parse(fecha, formatoFecha);
                        System.out.println("Ingrese el tipo de combustible: ");
                        String tipo_combustible = str.nextLine();
                        System.out.println("Ingrese el numero de puertas: ");
                        int numero_puertas = lea.nextInt();
                        String tipo_transmision = "";
                        System.out.println("Ingrese el tipo de trasmision [1.Automatica/2.Mecanica]: ");
                        int x = lea.nextInt();
                        if (x == 1) {
                            tipo_transmision = "automatica";

                        } else if (x == 2) {
                            tipo_transmision = "mecanica";
                        }
                        System.out.println("Ingrese el numero de asientos: ");
                        int numero_asientos = lea.nextInt();
                        vehiculos.add(new automovil(tipo_combustible, numero_puertas, tipo_transmision, numero_asientos));

                    } else if (vehiculos.get(pos) instanceof motocicleta) {
                        System.out.println("Ingrese el numero de placa: ");
                        String numero_placa = str.nextLine();
                        System.out.println("Ingrese la marca: ");
                        String marca = str.nextLine();
                        System.out.println("Ingrese el modelo: ");
                        String modelo = str.nextLine();
                        System.out.println("Ingrese el tipo: ");
                        String tipo = str.nextLine();
                        System.out.println("Ingrese el color: ");
                        String color = str.nextLine();
                        System.out.println("Ingrese el ano de creacion en formato \"dd/MM/yyyy\");\n");
                        String fecha = str.nextLine();
                        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate year = LocalDate.parse(fecha, formatoFecha);
                        System.out.println("Ingrese la velocidad maxima: ");
                        int velocidad_maxima = lea.nextInt();
                        System.out.println("Ingrese el peso: ");
                        double peso = lea.nextDouble();
                        System.out.println("Ingrese el consumo de combustible: ");
                        int tipo_combustible = lea.nextInt();
                        vehiculos.add(new motocicleta(velocidad_maxima, peso, tipo_combustible));

                    } else if (vehiculos.get(pos) instanceof autobus) {
                        System.out.println("Ingrese el numero de placa: ");
                        String numero_placa = str.nextLine();
                        System.out.println("Ingrese la marca: ");
                        String marca = str.nextLine();
                        System.out.println("Ingrese el modelo: ");
                        String modelo = str.nextLine();
                        System.out.println("Ingrese el tipo: ");
                        String tipo = str.nextLine();
                        System.out.println("Ingrese el color: ");
                        String color = str.nextLine();
                        System.out.println("Ingrese el ano de creacion en formato \"dd/MM/yyyy\");\n");
                        String fecha = str.nextLine();
                        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate year = LocalDate.parse(fecha, formatoFecha);
                        System.out.println("Ingrese la capacidad de pasajeros: ");
                        int capacidad_pasajeros = lea.nextInt();
                        System.out.println("Ingrese el numero de ejes: ");
                        int numero_ejes = lea.nextInt();
                        System.out.println("Ingrese la longitud: ");
                        int longitud = lea.nextInt();
                        vehiculos.add(new autobus(capacidad_pasajeros, numero_ejes, longitud, numero_placa, marca, modelo, tipo, color, year));

                    }

                } else {
                    System.out.println("La posicion ingresada esta fuera de rango o el inventario de vehiculos esta vacio");

                }

            } else if (opcion == 5) {
                listarvehiculos();
                listarvehiculos2();
                listarvehiculos3();
                if (vehiculos.size() > 0) {
                    System.out.println("Ingrese la posicion del vehiculo a eliminar");
                    int remove = lea.nextInt();
                    System.out.println("Confirme la eliminacion del vehiculo[s/n]");
                    String confirmacion = str.nextLine();
                    if (confirmacion.contentEquals("s") || confirmacion.contentEquals("S")) {
                        vehiculos.remove(remove);

                    }

                } else {

                    System.out.println("el inventario de vehiculos esta vacio, no se pueden eliminar vehiculos");
                }

            } else if (opcion == 6) {
                System.out.println("---Automoviles---");

                for (int i = 0; i < vehiculos.size(); i++) {
                    if (vehiculos.get(i) instanceof automovil) {
                        System.out.println(i + "." + (vehiculo) vehiculos.get(i));
                    }
                    System.out.println("\n\n");

                }
                System.out.println("---Motocicletas---");
                for (int i = 0; i < vehiculos.size(); i++) {
                    if (vehiculos.get(i) instanceof motocicleta) {
                        System.out.println(i + "." + (vehiculo) vehiculos.get(i));
                    }
                    System.out.println("\n\n");

                }
                System.out.println("---Autobuses---");
                for (int i = 0; i < vehiculos.size(); i++) {
                    if (vehiculos.get(i) instanceof autobus) {
                        System.out.println(i + "." + (vehiculo) vehiculos.get(i));
                    }
                    System.out.println("\n\n");

                }

            } else if (opcion == 7) {
                if (vehiculos.size() < 0) {
                    System.out.println("El inventario de vehiculos esta vacio,no se puede generar una boleta");
                } else {
                    listarvehiculos();
                    listarvehiculos2();
                    listarvehiculos3();
                    System.out.println("Ingrese la posicion del vehiculo al cual se le generara una boleta: ");
                    int pos = lea.nextInt();
                    if (pos > vehiculos.size()) {
                        System.out.println("La posicion es invalida");
                    } else {
                        if (vehiculos.get(pos) instanceof automovil) {
                            System.out.println("---Boleta de revision vehicular---");
                            double tot_pagar = 275.0 + 250.0 + 1200.0;
                            System.out.println("total a pagar: " + tot_pagar + " lps");

                        } else if (vehiculos.get(pos) instanceof motocicleta) {
                            System.out.println("---Boleta de revision vehicular---");
                            double tot_pagar = 275.0 + 250.0 + 200.0;
                            System.out.println("total a pagar: " + tot_pagar + " lps");

                        } else if (vehiculos.get(pos) instanceof autobus) {
                            System.out.println("---Boleta de revision vehicular---");
                            double tot_pagar = 275.0 + 250.0 + 1000.0;
                            System.out.println("total a pagar: " + tot_pagar + " lps");

                        }

                    }

                }

            } else {
                System.out.println("La opcion ingresada es invalida");
            }

        }//fin while

    }//fin main

    public static void listarvehiculos() {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i) instanceof automovil) {
                System.out.println(i + "." + (vehiculo) vehiculos.get(i));
            }
            System.out.println("\n\n");

        }
    }

    public static void listarvehiculos2() {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i) instanceof motocicleta) {
                System.out.println(i + "." + (vehiculo) vehiculos.get(i));
            }
            System.out.println("\n\n");

        }

    }

    public static void listarvehiculos3() {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i) instanceof autobus) {
                System.out.println(i + "." + (vehiculo) vehiculos.get(i));
            }
            System.out.println("\n\n");

        }

    }

}//fin clase
