/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.*;
import paquete5.*;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAuto;
    private String marcaAuto;
    private Persona garante;
    private double valorAuto;
    private double pagoMensual;

    public PrestamoAutomovil(Persona b, int pP, String cP, String tA, String mA,
            Persona gP, double vA) {

        super(b, pP, cP);

        this.tipoAuto = tA;
        this.marcaAuto = mA;
        this.garante = gP;
        this.valorAuto = vA;
        this.pagoMensual = vA / pP;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tA) {
        this.tipoAuto = tA;
    }

    public String getMarcaAuto() {
        return marcaAuto;
    }

    public void setMarcaAuto(String mA) {
        this.marcaAuto = mA;
    }

    public Persona getGarante() {
        return garante;
    }

    public void setGarante(Persona gP) {
        this.garante = gP;
    }

    public double getValorAuto() {
        return valorAuto;
    }

    public void setValorAuto(double vA) {
        this.valorAuto = vA;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoMensual(double pP) {
        this.pagoMensual = pP;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de auto: " + tipoAuto + "\nMarca del "
                + "auto: " + marcaAuto+ "\nNombre del garante: " + garante 
                + "\nValor del auto: " + valorAuto + "\nValor mensual: " + 
                pagoMensual;
    }
}
