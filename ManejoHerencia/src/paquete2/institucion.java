/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author VEL-USER
 */
public class institucion {
    private String nombre;
    private String acronimo;

    public institucion(String n, String a) {
        this.nombre = n;
        this.acronimo = a;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String a) {
        this.acronimo = a;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nSiglas: " + acronimo;
    }
}
