/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.*;
import paquete5.*;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private institucion centroEstudio;
    private double valorCarrera;
    private double pagoMensual;

    public PrestamoEducativo(Persona b, int pP, String cP, String nE,
            institucion cE, double vC) {

        super(b, pP, cP);

        this.nivelEstudio = nE;
        this.centroEstudio = cE;
        this.valorCarrera = vC;
        this.pagoMensual = (vC / pP) - (0.1 * (vC / pP));
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nE) {
        this.nivelEstudio = nE;
    }

    public institucion getCentroEstudio() {
        return centroEstudio;
    }

    public void setCentroEducativo(institucion cE) {
        this.centroEstudio = cE;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double vC) {
        this.valorCarrera = vC;
    }

    public double getPrestamoPago() {
        return pagoMensual;
    }

    public void setPrestamoPago(double pP) {
        this.pagoMensual = pP;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNivel de estudio: " + nivelEstudio + 
                "\nCentro de estudio: " + centroEstudio+ "\nValor de la carrera: " 
                + valorCarrera + "\nValor del pago mensual: " + pagoMensual;
    }
}
