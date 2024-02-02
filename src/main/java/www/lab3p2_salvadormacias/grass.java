/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.lab3p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class grass extends pokemon{
    
    String habitat;
    int dominio;

    public grass(String habitat, int dominio) {
        this.habitat = habitat;
        this.dominio = dominio;
    }

    public grass(String habitat, int dominio, String nombre, int entrada, String naturaleza, boolean atrapado) {
        super(nombre, entrada, naturaleza, atrapado);
        this.habitat = habitat;
        this.dominio = dominio;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getDominio() {
        return dominio;
    }

    public void setDominio(int dominio) {
        this.dominio = dominio;
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
        return "grass{" + "habitat=" + habitat + ", dominio=" + dominio + '}';
    }
    
    
}
