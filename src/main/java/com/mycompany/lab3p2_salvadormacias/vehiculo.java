/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3p2_salvadormacias;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author papilon10
 */
public class vehiculo {

    String numero_placa;
    String marca;
    String modelo;
    String tipo;
    String color;
    Date year;

    public vehiculo() {
    }

    public vehiculo(String numero_placa, String marca, String modelo, String tipo, String color, Date year) {
        this.numero_placa = numero_placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.year = year;
    }

    public String getNumero_placa() {
        return numero_placa;
    }

    public void setNumero_placa(String numero_placa) {
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
        return "vehiculo{" + "numero_placa=" + numero_placa + ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", color=" + color + ", year=" + year + '}';
    }

}
