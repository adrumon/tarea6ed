/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author adrum
 */
public class Tarea6EDClase {

    public static final double DESCUENTO_COMPRA_NORMAL = 0.95;
    public static final double DESCUENTO_COMPRA_GRANDE = 0.8;

    public void Mensaje_Salida(double Precio_Total) {
        System.out.println("El total a pagar es:" + Precio_Total);
        System.out.println("Enviado");
    }

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double Precio_Total;
        if (numProductos > 3) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            Precio_Total = precioProducto * DESCUENTO_COMPRA_GRANDE;
            Mensaje_Salida(Precio_Total);
        } else {
            Precio_Total = precioProducto * DESCUENTO_COMPRA_NORMAL;
            Mensaje_Salida(Precio_Total);
        }
    }

}
