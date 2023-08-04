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
public class motocicleta extends vehiculo {

    int velocidad_maxima;
    double kg;
    int consumo_combustible;

    public motocicleta() {
    }

    public motocicleta(int velocidad_maxima, double kg, int consumo_combustible) {
        super();
        this.velocidad_maxima = velocidad_maxima;
        this.kg = kg;
        this.consumo_combustible = consumo_combustible;
    }

    public int getVelocidad_maxima() {
        return velocidad_maxima;
    }

    public void setVelocidad_maxima(int velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public int getConsumo_combustible() {
        return consumo_combustible;
    }

    public void setConsumo_combustible(int consumo_combustible) {
        this.consumo_combustible = consumo_combustible;
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
        return "motocicleta{" + "velocidad_maxima=" + velocidad_maxima + ", kg=" + kg + ", consumo_combustible=" + consumo_combustible + '}';
    }

}
