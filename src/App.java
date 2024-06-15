import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("1. AGREGAR PRODUCTO AL INVENTARIO.");
                System.out.println("2. ELIMINAR PRODUCTO DEL INVENTARIO.");
                System.out.println("3. BUSCAR PRODUCTO.");            
                System.out.println("4. ACTUALIZAR CANTIDAD");
                System.out.println("5. MOSTRAR INVENTARIO");
                System.out.println("6. SALIR");
                byte opcion = scanner.nextByte();

                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entre 1 y 6.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entre 1 y 6.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            

        }
    }
}
