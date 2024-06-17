package filesManagament;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.StringTokenizer;

public class manejoArchivos {

    public void iniciarP(){
        File archivo = new File("files/inventario.txt"); //abrir archivo
        RandomAccessFile buffer;
        try {
            buffer = new RandomAccessFile(archivo, "rw"); //modo read- write
            buffer.seek(archivo.length()); //indica la posicion que queremos escribir
            buffer.writeBytes(500 + "," + 150 + "," + "ARROZ\n");
            buffer.writeBytes(499 + "," + 200 + "," + "CARNE\n");
            buffer.writeBytes(498 + "," + 50 + "," + "PAPAS\n");
            buffer.writeBytes(501 + "," + 17 + "," + "TOMATE");
            buffer.close(); //cerrar el buffer
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }  //leer y escribir
        catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    public void agregarProducto(int codigo, String nombre, int cantidad) {
        File archivo = new File("files/inventario.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true));
            writer.write("\n"+codigo + "," + cantidad + "," + nombre);
            writer.close();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo" + e.getMessage());
        }
    }

    public void eliminarProducto(int codigo) {

    }

    public void actualizarCantidad(int codigo, int cantidad) {

    }

    public void mostrarInventario() {
        File archivo = new File("files/inventario.txt");

        try {
            RandomAccessFile buffer = new RandomAccessFile(archivo, "r");  //crear
            String linea = buffer.readLine();
            while (linea != null) {
                StringTokenizer tokens = new StringTokenizer(linea, ",");  //ira desd el inicio d la linea hasta la coma
                System.out.println("=============");
                System.out.println("CODIGO: "+tokens.nextToken());
                System.out.println("CANTIDAD: " + tokens.nextToken());
                System.out.println("NOMBRE: "+tokens.nextToken()+"\n");
                linea = buffer.readLine();
            }
            buffer.close(); //cerrar el buffer
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
}
