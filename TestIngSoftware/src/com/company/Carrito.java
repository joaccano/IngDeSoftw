package com.company;

import java.util.ArrayList;

public class Carrito {
    ArrayList<Detalle> detalles = new ArrayList();
    public Carrito() {
        //Creo los detalles dentro del método para no hacerlo tan largo
        Detalle det1 = new Detalle("Equipo-de-Música", 4500, "negro", 3);
        Detalle det2 = new Detalle("MackBook Pro", 10000, "Gris", 1);
        Detalle det3 = new Detalle("Auriculares beats", 5000, "amarillo", 2);
        detalles.add(det1);
        detalles.add(det2);
        detalles.add(det3);
    }


    public void totalCarrito(){
    double total = 0;
        for (Detalle d: detalles) {
            total = total + d.getPrecioProd() * d.getCantidad();
        }
        System.out.println("El total es: " + total);
    }

}
