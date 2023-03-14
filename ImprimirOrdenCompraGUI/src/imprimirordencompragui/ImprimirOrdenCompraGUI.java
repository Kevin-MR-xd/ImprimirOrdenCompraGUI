package imprimirordencompragui;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevonnnn
 *
 * JOptiionPane
 * Este programa calcula e imprime un reporte de orden de compra.
 *
 */
public class ImprimirOrdenCompraGUI {
    
    public static void main(String[] args) {
        
        EntradaDatos entrada = new EntradaDatos();
        String nombreArticulo = entrada.obtenerNombreArticulo();
        double precio = entrada.obtenerPrecio();
        int cant = entrada.obtenerCantidad();
        
        SalidaDatos salida = new SalidaDatos();
        salida.mostrarOrdenCompra(nombreArticulo, precio, cant);
    }
}

class EntradaDatos {
    
    public String obtenerNombreArticulo() {
        return JOptionPane.showInputDialog("Nombre del artículo comprado:");
    }
    
    public double obtenerPrecio() {
        return Double.parseDouble(JOptionPane.showInputDialog("Precio del artículo:"));
    }
    
    public int obtenerCantidad() {
        return Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));
    }
}

class SalidaDatos {
    
    public void mostrarOrdenCompra(String nombreArticulo, double precio, int cant) {
        JOptionPane.showMessageDialog(null, "ORDEN DE COMPRA:\n\n"
                + "Artículo: " + nombreArticulo + "\nCantidad: " + cant
                + "\nPrecio total: $" + (precio * cant));
    }
}
