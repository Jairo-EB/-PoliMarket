# -PoliMarket
 Sistema modular en Java para gestión empresarial.
# 🏢 PoliMarket

**PoliMarket** es un sistema modular de gestión empresarial desarrollado en **Java**, que simula el flujo de trabajo interno de una empresa.  
Integra distintas áreas funcionales como **Ventas, Bodega, Entregas, Recursos Humanos y Proveedores**, trabajando de forma coordinada, siguiendo un **diagrama funcional lógico**.

---

## 📌 Objetivo del proyecto

Diseñar y construir un sistema orientado a objetos que represente la estructura y operaciones internas de una empresa, garantizando la interacción entre las distintas áreas funcionales a través de clases interconectadas.

---

## 🧩 Módulos y clases del sistema

Cada área de la empresa está representada por una o más clases, distribuidas en paquetes según su función:

### 📦 `bodega/`
- **`Producto.java`**: Representa un producto con ID, nombre y stock.
- **`Bodega.java`**: Gestiona el inventario (entrada, salida y consulta de productos). Se comunica con Ventas, Entregas y Proveedores.

### 🛒 `ventas/`
- **`Vendedor.java`**: Representa un vendedor, que debe ser autorizado por RRHH.
- **`Cliente.java`**: Define los datos de los posibles clientes.
- **`Ventas.java`**: Coordina la relación entre vendedor, clientes y productos. Consulta productos de Bodega.

### 👩‍💼 `rrhh/`
- **`RecursosHumanos.java`**: Autoriza a los vendedores para que puedan operar dentro del sistema.

### 🚚 `entregas/`
- **`Entregas.java`**: Gestiona las entregas, registra salidas del stock y confirma entregas a los clientes.

### 🏭 `proveedores/`
- **`Proveedor.java`**: Representa una empresa proveedora que entrega productos a Bodega para el reabastecimiento.

### 📁 `modelos/` (opcional)
- **`Usuario.java`**: Estructura general de usuario, no implementada directamente pero útil para versiones futuras.

---

## 🧠 Funcionalidades implementadas (Requisitos funcionales)

1. ✅ Recursos Humanos autoriza vendedores.
2. ✅ Ventas puede consultar productos disponibles en bodega.
3. ✅ Ventas puede consultar los clientes registrados.
4. ✅ Entregas realiza entrega de productos y descuenta del inventario.
5. ✅ Bodega se comunica con proveedores para reabastecer productos cuando el stock es bajo.

---

## 🖥 Clientes implementados

### `AppWebCliente.java` (simulación tipo sistema web)
- Autoriza un vendedor.
- Consulta productos y clientes.
- Realiza una entrega.
- Reabastece un producto si el stock baja.

### `AppMovilCliente.java` (simulación tipo app móvil)
- Consulta lista de productos disponibles.
- Consulta lista de clientes.
- Solo lectura (no modifica el sistema).

---

## 🔧 Estructura del proyecto

PoliMarket/
├── src/
│   ├── bodega/
│   │   ├── Bodega.java
│   │   └── Producto.java
│   ├── ventas/
│   │   ├── Ventas.java
│   │   ├── Vendedor.java
│   │   └── Cliente.java
│   ├── rrhh/
│   │   └── RecursosHumanos.java
│   ├── entregas/
│   │   └── Entregas.java
│   ├── proveedores/
│   │   └── Proveedor.java
│   ├── modelos/
│   │   └── Usuario.java (opcional)
│   ├── AppWebCliente.java
│   └── AppMovilCliente.java
├── bin/                 ← compilados (se ignoran en Git)
├── productos.txt        ← si lo usas
├── README.md
└── .gitignore



## ▶️ ¿Cómo compilar y ejecutar?

### 1. Compilar todos los archivos:
```bash

javac -d bin src/**/*.java

2. Ejecutar cliente web:
java -cp bin AppWebCliente

3. Ejecutar cliente móvil:
java -cp bin AppMovilCliente

💡 Asegúrate de estar dentro de la carpeta raíz del proyecto en tu terminal.


🧪 Ejemplo de salida esperada

Vendedor autorizado: Camila
Productos disponibles:
Producto: Monitor (Stock: 15)
Producto: Teclado (Stock: 10)
Producto: Mouse (Stock: 20)

Clientes:
Cliente: Jairo, Dirección: Cra 14 17 A 123
Cliente: Laura, Dirección: Carrera 45 #89

Entregando 2 de Monitor a Jairo
Salida registrada: 2 de Monitor
Solicitando 5 unidades de Monitor al proveedor: Proveedora S.A.

Productos actualizados:
Producto: Monitor (Stock: 18)
Producto: Teclado (Stock: 10)
Producto: Mouse (Stock: 20)

👨‍💻 Tecnología usada
Java 8 o superior

Programación orientada a objetos (POO)

Ejecución por consola (cliente web y móvil)

Estructura modular por paquetes

📝 Autor
👤 JAIRO ESPEJO BOHORQUEZ

🗓 Proyecto académico – 2025





