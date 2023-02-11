package test;

import ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("pantalla", 1000);
        Producto producto2 = new Producto("mouse", 100);
        Producto producto3 = new Producto("teclado", 80);
        Producto producto4 = new Producto("torre", 2000);

        
        Orden  orden1= new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.mostrarOrden();       
        
        }
    }

