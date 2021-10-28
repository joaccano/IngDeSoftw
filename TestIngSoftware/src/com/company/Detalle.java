package com.company;

public class Detalle {
    String nombreProd;
    double precioProd;
    String descripcionProd;
    int cantidad;

    public Detalle(String nombreProd, double precioProd, String descripcionProd, int cantidad){
        this.nombreProd = nombreProd;
        this.precioProd = precioProd;
        this.descripcionProd = descripcionProd;
        this.cantidad = cantidad;

    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public double getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(double precioProd) {
        this.precioProd = precioProd;
    }

    public String getDescripcionProd() {
        return descripcionProd;
    }

    public void setDescripcionProd(String descripcionProd) {
        this.descripcionProd = descripcionProd;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
