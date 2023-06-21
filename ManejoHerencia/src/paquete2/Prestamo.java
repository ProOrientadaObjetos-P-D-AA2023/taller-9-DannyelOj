/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.*;

/**
 *
 * @author reroes
 */
public class Prestamo {

    private Persona beneficiario;
    private int plazoPrestamo;
    private String ciudadPrestamo;

    public Prestamo(Persona b, int pP, String cP) {
        this.beneficiario = b;
        this.plazoPrestamo = pP;
        this.ciudadPrestamo = cP;
    }

    // Getters y setters
    public Persona getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona b) {
        this.beneficiario = b;
    }

    public int getPlazoPrestamos() {
        return plazoPrestamo;
    }

    public void setPlazoPrestamos(int pP) {
        this.plazoPrestamo = pP;
    }

    public String getCiudadPrestamo() {
        return ciudadPrestamo;
    }

    public void setCiudadPrestamo(String cP) {
        this.ciudadPrestamo = cP.toLowerCase();
    }

    @Override
    public String toString() {
        return "=========================================\nBeneficiario: "
                + beneficiario + "\nPlazo del prestamo: "+ plazoPrestamo+ 
                "\nCiudad donde se dio el préstamo: " + ciudadPrestamo;
    }
}
