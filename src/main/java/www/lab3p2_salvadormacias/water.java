/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.lab3p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class water extends pokemon {

    boolean vivir;
    int rapidez;

    public water(boolean vivir, int rapidez) {
        this.vivir = vivir;
        this.rapidez = rapidez;
    }

    public water(boolean vivir, int rapidez, String nombre, int entrada, String naturaleza, boolean atrapado) {
        super(nombre, entrada, naturaleza, atrapado);
        this.vivir = vivir;
        this.rapidez = rapidez;
    }

    public boolean isVivir() {
        return vivir;
    }

    public void setVivir(boolean vivir) {
        this.vivir = vivir;
    }

    public int getRapidez() {
        return rapidez;
    }

    public void setRapidez(int rapidez) {
        this.rapidez = rapidez;
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
        return "water{" + "vivir=" + vivir + ", rapidez=" + rapidez + '}';
    }

}
