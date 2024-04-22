/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author espin
 */
public class Caja {
    private double ancho;
    private double alto;
    private double largo;
    private double peso;
    private String guiaEnvio;

    // Constructor
    public Caja(double ancho, double alto, double largo, double peso, String guiaEnvio) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
        this.guiaEnvio = guiaEnvio;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGuiaEnvio() {
        return guiaEnvio;
    }

    public void setGuiaEnvio(String guiaEnvio) {
        this.guiaEnvio = guiaEnvio;
    }

    
}
