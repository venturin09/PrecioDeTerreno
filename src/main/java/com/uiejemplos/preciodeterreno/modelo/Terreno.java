package com.uiejemplos.preciodeterreno.modelo;

public class Terreno {
    private double largo;
    private double ancho;
    private double costoPorMetroCuadrado;

    public Terreno(double largo, double ancho, double costoPorMetroCuadrado ) {
        this.largo = largo;
        this.costoPorMetroCuadrado = costoPorMetroCuadrado;
        this.ancho = ancho;
    }
    public double calcularArea(){
        return largo * ancho;
    }
    public double calcularPrecio() {
        return calcularArea() * costoPorMetroCuadrado;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getCostoPorMetroCuadrado() {
        return costoPorMetroCuadrado;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setCostoPorMetroCuadrado(double costoPorMetroCuadrado) {
        this.costoPorMetroCuadrado = costoPorMetroCuadrado;
    }
}
