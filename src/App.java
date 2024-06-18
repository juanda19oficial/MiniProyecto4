import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import filesManagament.manejoArchivos;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        manejoArchivos manejoArchivos = new manejoArchivos();
        manejoArchivos.iniciarP();

        while (true) {
            try {
                byte opcion;
                System.out.println("## BIENVENIDO A ALMACEN LA 41 ##");
                System.out.println("1. AGREGAR PRODUCTO AL INVENTARIO.");
                System.out.println("2. ELIMINAR PRODUCTO DEL INVENTARIO.");
                System.out.println("3. BUSCAR PRODUCTO.");
                System.out.println("4. ACTUALIZAR CANTIDAD");
                System.out.println("5. MOSTRAR INVENTARIO");
                System.out.println("6. SALIR");
                opcion = scanner.nextByte();

                switch (opcion) {
                    case 1:
                        int codigo;
                        while (true) {
                            try {
                                System.out.println("Ingrese el código del producto: ");
                                codigo = scanner.nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("INGRESE UN DATO NUMERICO!!!");
                                scanner.nextLine();
                            } catch (Exception e) {
                                System.out.println("Ha ocurrido un error inesperado!!");
                                scanner.nextLine();
                            }
                        }

                        if (inventario.buscarProducto(codigo, false)) {
                            System.out.println("El producto con el código " + codigo + " ya se encuentra agregado.");
                        } else {
                            System.out.println("Ingrese el nombre del producto: ");
                            scanner.nextLine();
                            String nombre = (scanner.nextLine()).toUpperCase();
                            int cantidad;
                            while (true) {
                                try {
                                    System.out.println("Ingrese la cantidad: ");
                                    cantidad = scanner.nextInt();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("INGRESE UN DATO NUMERICO!!!");
                                    scanner.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Ha ocurrido un error inesperado!!");
                                    scanner.nextLine();
                                }
                            }
                            if (cantidad <= 0) {
                                System.out.println("Por favor ingrese una cantidad válida");
                            } else {
                                inventario.agregarProducto(codigo, nombre, cantidad);
                                System.out.println("Producto agregado correctamente.");
                            }
                        }
                        break;
                    case 2:
                        int codigo2;
                        while (true) {
                            try {
                                System.out.println("Ingrese el codigo del producto a eliminar: ");
                                codigo2 = scanner.nextInt();
                                inventario.eliminarProducto(codigo2);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("INGRESE DIGITOS!!!");
                                scanner.nextLine();
                            } catch (Exception e) {
                                System.out.println("Ha ocurrido un error inesperado!!!");
                                scanner.nextLine();
                            }
                        }
                        break;
                    case 3:
                        int codigo1;
                        while (true) {
                            try {
                                System.out.println("Ingrese el codigo del producto a buscar: ");
                                codigo1 = scanner.nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("INGRESE DIGITOS!!!");
                                scanner.nextLine();
                            } catch (Exception e) {
                                System.out.println("Ha ocurrido un error inesperado!!!");
                                scanner.nextLine();
                            }
                        }

                        if (!inventario.buscarProducto(codigo1, true)) {
                            System.out.println("Producto con codigo " + codigo1 + " no encontrado");
                        } else {
                            inventario.buscarProducto(codigo1, true);
                        }
                        break;
                        case 4:
                        int codigo3;
                        while (true) {
                            try {
                                System.out.println("Ingrese el codigo del producto a actualizar: ");
                                codigo3 = scanner.nextInt();
                                if (!inventario.buscarProducto(codigo3, false)) {
                                    System.out.println("Producto con codigo " + codigo3 + " no encontrado");
                                    break;
                                } else {
                                    System.out.println("Ingrese la nueva cantidad: ");
                                    int nuevaCantidad = scanner.nextInt();
                                    if (nuevaCantidad <= 0) {
                                        System.out.println("Por favor ingrese una cantidad válida");
                                    } else {
                                        inventario.actualizarCantidad(codigo3, nuevaCantidad); // Llamada al método de actualización en el inventario
                                        System.out.println("Cantidad actualizada correctamente.");
                                    }
                                    break; // Importante salir del bucle while después de la actualización
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("INGRESE DIGITOS!!!");
                                scanner.nextLine();
                            } catch (Exception e) {
                                System.out.println("Ha ocurrido un error inesperado!!!");
                                scanner.nextLine();
                            }
                        }
                        break;
                    
                    case 5:
                        inventario.mostrarInventario();
                        break;
                    case 6:
                        File archivo = new File("files/inventario.txt");
                        if (!archivo.exists()) {
                            System.out.println("El archivo data no existe.");
                        } else {
                            FileWriter fw;
                            try {
                                fw = new FileWriter(archivo);
                                fw.flush();
                                fw.close();
                                System.out.println("El archivo data fue eliminado.");
                            } catch (IOException ex) {
                                System.out.println("Error al borrar contenido del fichero");
                            }
                        }
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entre 1 y 6.");
                scanner.next();
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entre 1 y 6.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
