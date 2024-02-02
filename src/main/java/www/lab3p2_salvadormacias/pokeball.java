/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.lab3p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class pokeball {

    String color;
    int numero_serie;
    int eficencia;

    public pokeball(String color, int numero_serie, int eficencia) {
        this.color = color;
        this.numero_serie = numero_serie;
        this.eficencia = eficencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public int getEficencia() {
        return eficencia;
    }

    public void setEficencia(int eficencia) {
        this.eficencia = eficencia;
    }

    @Override
    public String toString() {
        return "pokeball{" + "color=" + color + ", numero_serie=" + numero_serie + ", eficencia=" + eficencia + '}';
    }

}
