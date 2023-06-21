/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author VEL-USER
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String username;

    public Persona(String n, String a, String u) {
        this.nombre = n;
        this.apellido = a;
        this.username = u;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String a) {
        this.apellido = a;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String u) {
        this.username = u;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nApellido: " + apellido + "\nUsername: " + username;
    }
}
