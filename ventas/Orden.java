package ventas;

import java.util.function.IntToDoubleFunction;

import javax.swing.text.PlainView;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    public int contacorProductos;
    private static int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contacorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contacorProductos++] = producto;
        } else {
            System.out.println("se  ha  superado la cantidad max de productos" + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contacorProductos; i++) {
            // Producto producto=this.productos[i];
            total += this.productos[i].getPrecio();

        }
        return total;
    }
    public void mostrarOrden(){
        System.out.println("idOrden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("total de la orden $"+ totalOrden);
        System.out.println("productos de la ordem: /n");
         for(int i=0; i<this.contacorProductos; i++){
            System.out.println(this.productos[i]);
         }
    }
}
