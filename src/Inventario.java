import filesManagament.manejoArchivos;

public class Inventario {

    nodoBinario raiz;
    manejoArchivos archivos;

    public Inventario() {
        this.raiz = nodoInicial();
        this.archivos = new manejoArchivos();
    }

    public nodoBinario nodoInicial() {
        nodoBinario producto1 = new nodoBinario(500, 150, "ARROZ");
        producto1.insertar(499, 200, "CARNE", producto1);
        producto1.insertar(498, 50, "PAPAS", producto1);
        producto1.insertar(501, 17, "TOMATE", producto1);
        return producto1;
    }

    public void agregarProducto(int codigo, String nombre, int cantidad) {
        if (!buscarProducto(codigo, false)) {
            raiz = raiz.insertar(codigo, cantidad, nombre, raiz);
            archivos.agregarProducto(codigo, nombre, cantidad);
        } else {
            System.out.println("El producto con código " + codigo + " ya está en el inventario.");
        }
    }

    public void eliminarProducto(int codigo) {

    }
    
    public boolean buscarProducto(int codigo, boolean mostrarInfo) {
        // return raiz.buscarNodo(codigo, raiz, mostrarInfo);
        return raiz != null && raiz.buscarNodo(codigo, raiz, mostrarInfo);
    }

    public void actualizarCantidad(int codigo, int cantidad) {
        nodoBinario nodoInicial = nodoInicial();

    }

    public void mostrarInventario() {
        nodoBinario nodoInicial = nodoInicial();

    }

}
