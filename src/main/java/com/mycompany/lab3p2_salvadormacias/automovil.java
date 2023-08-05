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
public class automovil extends vehiculo {

    static void setTipoCombustible(String nuevoTipoCombustible) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void setTipoTransmision(String automatica) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String tipo_combustible;
    int numero_puertas;
    String tipo_transmision;
    int numero_asientos;

    public automovil() {
        super();
    }

    public automovil(String tipo_combustible, int numero_puertas, String tipo_transmision, int numero_asientos) {
        super();
        this.tipo_combustible = tipo_combustible;
        this.numero_puertas = numero_puertas;
        this.tipo_transmision = tipo_transmision;
        this.numero_asientos = numero_asientos;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public int getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    public String getTipo_transmision() {
        return tipo_transmision;
    }

    public void setTipo_transmision(String tipo_transmision) {
        this.tipo_transmision = tipo_transmision;
    }

    public int getNumero_asientos() {
        return numero_asientos;
    }

    public void setNumero_asientos(int numero_asientos) {
        this.numero_asientos = numero_asientos;
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
        return "automovil{" + "tipo_combustible=" + tipo_combustible + ", numero_puertas=" + numero_puertas + ", tipo_transmision=" + tipo_transmision + ", numero_asientos=" + numero_asientos + '}';
    }

    void setNumeroPuertas(int nuevoNumeroPuertas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
