/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.lab3p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class pokemon {

    String nombre;
    int entrada;
    String naturaleza;
    boolean atrapado;

    public pokemon() {
    }

    public pokemon(String nombre, int entrada, String naturaleza, boolean atrapado) {
        this.nombre = nombre;
        this.entrada = entrada;
        this.naturaleza = naturaleza;
        this.atrapado = atrapado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    @Override
    public String toString() {
        return "pokemon{" + "nombre=" + nombre + ", entrada=" + entrada + ", naturaleza=" + naturaleza + ", atrapado=" + atrapado + '}';
    }

}
