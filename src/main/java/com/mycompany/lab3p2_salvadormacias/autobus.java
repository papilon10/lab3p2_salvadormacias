/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3p2_salvadormacias;

import java.awt.Color;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author papilon10
 */
public class autobus extends vehiculo {

    int capacidad_pasajeros;
    int numero_ejes;
    int longitud;

    public autobus() {
    }

    public autobus(int capacidad_pasajeros, int numero_ejes, int longitud) {
        super();
        this.capacidad_pasajeros = capacidad_pasajeros;
        this.numero_ejes = numero_ejes;
        this.longitud = longitud;
    }

    public autobus(int capacidad_pasajeros, int numero_ejes, int longitud, int numero_placa, String marca, String modelo, String tipo, String color, Date year) {
        super(numero_placa, marca, modelo, tipo, color, year);
        this.capacidad_pasajeros = capacidad_pasajeros;
        this.numero_ejes = numero_ejes;
        this.longitud = longitud;
    }

    autobus(int capacidad_pasajeros, int numero_ejes, int longitud, int numero_placa, String marca, String modelo, String tipo, String color, LocalDate year) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCapacidad_pasajeros() {
        return capacidad_pasajeros;
    }

    public void setCapacidad_pasajeros(int capacidad_pasajeros) {
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    public int getNumero_ejes() {
        return numero_ejes;
    }

    public void setNumero_ejes(int numero_ejes) {
        this.numero_ejes = numero_ejes;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getNumero_placa() {
        return numero_placa;
    }

    public void setNumero_placa(int numero_placa) {
        this.numero_placa = numero_placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "autobus{" + "capacidad_pasajeros=" + capacidad_pasajeros + ", numero_ejes=" + numero_ejes + ", longitud=" + longitud + '}';
    }

}
