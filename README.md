# Inventario Almacén La 41

Este proyecto es una aplicación de consola para gestionar el inventario de un almacén. Permite agregar, eliminar, buscar y actualizar productos, así como mostrar todo el inventario. La estructura de datos utilizada para almacenar los productos es un árbol binario.

## Estructura del Proyecto

El proyecto contiene los siguientes archivos:

- `App.java`: Contiene el punto de entrada principal de la aplicación y la lógica para interactuar con el usuario.
- `Inventario.java`: Gestiona las operaciones del inventario, como agregar, eliminar, buscar y actualizar productos.
- `nodoBinario.java`: Implementa los nodos del árbol binario utilizado para almacenar los productos.
- `manejoArchivos.java`: Maneja las operaciones de lectura y escritura en archivos para persistencia de datos.

## Instrucciones de Uso

### Compilación

Para compilar el proyecto, asegúrate de tener instalado JDK. Luego, abra la carpeta en su Visual Studio y ejecute el programa.

### Funcionalidades

1. **Agregar Producto**: Permite agregar un nuevo producto al inventario.
2. **Eliminar Producto**: Permite eliminar un producto del inventario utilizando su código.
3. **Buscar Producto**: Permite buscar un producto por su código y muestra su información.
4. **Actualizar Cantidad**: Permite actualizar la cantidad de un producto en el inventario.
5. **Mostrar Inventario**: Muestra todos los productos del inventario.
6. **Salir**: Guarda los cambios y sale de la aplicación.

## Detalles

### `App.java`

Este archivo contiene la lógica principal de la aplicación. Utiliza un menú para interactuar con el usuario y permite realizar las siguientes acciones:

- Agregar producto
- Eliminar producto
- Buscar producto
- Actualizar cantidad de producto
- Mostrar inventario
- Salir de la aplicación

### `Inventario.java`

Este archivo contiene la clase `Inventario`, que maneja las operaciones relacionadas con el inventario. Incluye métodos para agregar, eliminar, buscar y actualizar productos, así como para mostrar el inventario completo.

### `nodoBinario.java`

Este archivo define la clase `nodoBinario`, que representa los nodos del árbol binario utilizado para almacenar los productos. Incluye métodos para insertar, buscar, eliminar y actualizar la cantidad de los productos.

### `manejoArchivos.java`

Este archivo contiene la clase `manejoArchivos`, que se encarga de la persistencia de datos en el archivo `inventario.txt`. Implementa métodos para iniciar el archivo con datos predeterminados, agregar, eliminar y actualizar productos, y mostrar el inventario.

## Ejemplo de Uso

Al iniciar la aplicación, verás el siguiente menú:

```
## BIENVENIDO A ALMACEN LA 41 ##
1. AGREGAR PRODUCTO AL INVENTARIO.
2. ELIMINAR PRODUCTO DEL INVENTARIO.
3. BUSCAR PRODUCTO.
4. ACTUALIZAR CANTIDAD
5. MOSTRAR INVENTARIO
6. SALIR
```

Selecciona la opción deseada ingresando el número correspondiente. Por ejemplo, para agregar un producto, selecciona la opción `1` y sigue las instrucciones.


## Autores
  - Vanessa Alexandra Durán Mona - [@Vane2005](https://github.com/Vane2005)
  - Juan Damián Cuervo Buitrago - [@juanda19oficial](https://github.com/juanda19oficial)
  - Juan Sebastián Rodas Ramírez - [@JuanSebastianRodasRamirez](https://github.com/JuanSebastianRodasRamirez)
