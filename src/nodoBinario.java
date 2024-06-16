public class nodoBinario {
    int codigo;
    int cantidad;
    String nombre;
    nodoBinario left;
    nodoBinario right;

    public nodoBinario(int codigo, int cantidad, String nombre) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public nodoBinario() {
    };

    public nodoBinario insertar(int nuevoCodigo, int nuevaCant, String nuevoNombre, nodoBinario nodo) {
        if (nodo == null) {
            nodo = new nodoBinario(nuevoCodigo, nuevaCant, nuevoNombre);
        } else if (nuevoCodigo > nodo.codigo) {
            nodo.right = insertar(nuevoCodigo, nuevaCant, nuevoNombre, nodo.right);
        } else {
            nodo.left = insertar(nuevoCodigo, nuevaCant, nuevoNombre, nodo.left);
        }
        return nodo;
    }

    public boolean buscarNodo(int codigo, nodoBinario nodo, boolean mostrarInfo) {
        if (nodo == null) {
            return false;
        } else if (codigo == nodo.codigo) {
            if (mostrarInfo) {
                System.out.println("EL PRODUCTO ES: ");
                System.out.println("CODIGO: " + nodo.codigo);
                System.out.println("CANTIDAD: " + nodo.cantidad);
                System.out.println("NOMBRE: " + nodo.nombre);
                System.out.println("\n");
            }
            return true;
        } else if (codigo > nodo.codigo) {
            return buscarNodo(codigo, nodo.right, mostrarInfo);
        } else {
            return buscarNodo(codigo, nodo.left, mostrarInfo);
        }
    }

    public static int minValue(nodoBinario nodo) {
        int valorMinimo = nodo.codigo;
        while (nodo.left != null) {
            valorMinimo = nodo.left.codigo;
            nodo = nodo.left;
        }
        return valorMinimo;
    }

    public static nodoBinario eliminar(nodoBinario nodo, int numero) {
        if (numero > nodo.codigo) {
            nodo.right = eliminar(nodo.right, numero);
        } else if (numero < nodo.codigo) {
            nodo.left = eliminar(nodo.left, numero);
        } else {
            if (nodo.left == null) {
                return nodo.right;
            } else if (nodo.right == null) {
                return nodo.left;
            }
            nodo.codigo = minValue(nodo.right);
            nodo.right = eliminar(nodo.right, nodo.codigo);

        }
        return nodo;
    }
}
