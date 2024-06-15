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
        nodoBinario nodoInicial = nodoInicial();
        nodoInicial.insertar(codigo, cantidad, nombre, nodoInicial);
        archivos.agregarProducto(codigo, nombre, cantidad);
    }

    public void eliminarProducto(int codigo) {
        nodoBinario nodoInicial = nodoInicial();
        nodoInicial = nodoBinario.eliminar(nodoInicial, codigo);
        archivos.eliminarProducto(codigo);

    }

    public void buscarProducto(int codigo) {
        nodoBinario nodoInicial = nodoInicial();

    }

    public void actualizarCantidad(int codigo, int cantidad) {
        nodoBinario nodoInicial = nodoInicial();

    }

    public void mostrarInventario() {
        nodoBinario nodoInicial = nodoInicial();

    }

}
