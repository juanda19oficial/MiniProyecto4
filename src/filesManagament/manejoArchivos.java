package filesManagament;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class manejoArchivos {


    public void agregarProducto(int codigo, String nombre, int cantidad) {
        File archivo = new File("files/inventario.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true));
            writer.write("\r"+codigo + "," + nombre + "," + cantidad);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo" + e.getMessage());
        }
    }

    public void eliminarProducto(int codigo) {

    }

    public void buscarProducto(int codigo) {

    }

    public void actualizarCantidad(int codigo, int cantidad) {

    }

    public void mostrarInventario() {

    }
}
