package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CarritoTest {
    ArrayList<Detalle> detalles = new ArrayList();
    public CarritoTest() {
        //Creo los detalles dentro del método para no hacerlo tan largo
        Detalle det1 = new Detalle("Equipo-de-Música", 4500, "negro", 3);
        Detalle det2 = new Detalle("MackBook Pro", 10000, "Gris", 1);
        Detalle det3 = new Detalle("Auriculares beats", 5000, "amarillo", 2);
        detalles.add(det1);
        detalles.add(det2);
        detalles.add(det3);
    }

    @org.junit.jupiter.api.Test
    void totalCarrito() {
        //El total del carrito debe ser la suma del total de cada detalle, siendo total de detalle = precioProd*cantidad
        double total = 0;
        for (Detalle d: detalles) {
            total = total + d.getPrecioProd() * d.getCantidad();
        }
        System.out.println("El total es: " + total);
        assertEquals(33500,total);
    }
    @Test
    void eliminar1Producto(){
        Detalle deti = detalles.get(1);
        System.out.println(deti.nombreProd);
        int control  = 1;
        if(deti.getCantidad() == 1){
            detalles.remove(detalles.indexOf(deti));
            control  = 0;
        }
        assertEquals(0,control);
    }
}