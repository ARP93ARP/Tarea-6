/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.ed6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ARP
 */
public class Tarea6 {

    Logger logger = Logger.getLogger("Logger");

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
      
        if (numProductos > 3) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            total = precioProducto * 0.8;
            logger.log(Level.INFO, "El total a pagar es: {}", total);
            logger.info("Enviado");
        } else {
            total = precioProducto * 0.95;
            logger.log(Level.INFO, "El total a pagar es: {}", total);
            logger.info("Enviado");
        }
    }
}
