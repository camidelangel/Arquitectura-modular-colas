
# Práctica de Estructura de Datos: Colas en Java

Este proyecto implementa tres variantes de colas en Java:
cola estática lineal, cola estática circular y cola dinámica
mediante nodos enlazados.

El programa se organiza de manera modular. Cada estructura
cuenta con una clase Main independiente para probar sus
operaciones en consola.

## Estructura del proyecto

```text
src/
└── Estructuras_lineales/
    └── Cola/
        ├── ColaEstatica.java
        ├── ColaEstaticaCircular.java
        ├── Nodo.java
        ├── ColaDinamica.java
        ├── MainColaEsta.java
        ├── MainColaCircular.java
        └── MainColaDinamica.java
```

## Requisitos

- JDK 8 o superior.
- Un IDE de Java o una terminal que incluya `javac` y `java`.

## Compilación

Desde la carpeta raíz del proyecto, ejecuta:

```bash
javac -encoding UTF-8 -d out src/Estructuras_lineales/Cola/*.java
```

## Ejecución

Para ejecutar la cola estática lineal:

```bash
java -cp out Estructuras_lineales.Cola.MainColaEsta
```

Para ejecutar la cola circular:

```bash
java -cp out Estructuras_lineales.Cola.MainColaCircular
```

Para ejecutar la cola dinámica:

```bash
java -cp out Estructuras_lineales.Cola.MainColaDinamica
```

## Métodos implementados

- `enqueue(valor)`: inserta un elemento al final.
- `dequeue()`: retira el elemento del frente.
- `peek()`: consulta el elemento del frente sin eliminarlo.
- `estaVacia()`: comprueba si la cola está vacía.
- `estaLlena()`: comprueba la capacidad en las colas de arreglo.
- `mostrar()`: muestra los elementos en orden FIFO.
- `contarElementos()`: devuelve la cantidad de elementos.

En la cola dinámica, `contarElementos()` recorre los nodos
enlazados desde `frente` hasta encontrar `null`.

Cuando una cola está vacía, `peek()` y `dequeue()` muestran
un mensaje y devuelven `-1` como valor centinela.

## Comparación de las estructuras

| Característica | Estática lineal | Circular | Dinámica |
|---|---|---|---|
| Almacenamiento | Arreglo fijo | Arreglo fijo | Nodos enlazados |
| Capacidad | Fija | Fija | Depende de la memoria |
| Reutiliza posiciones | No, en esta versión | Sí | Sí, al retirar nodos |
| Memoria adicional | No usa enlaces | No usa enlaces | Cada nodo requiere un enlace |
| Ventaja | Sencillez | Aprovecha mejor el arreglo | Crecimiento flexible |
| Limitación | Puede dejar espacios sin reutilizar | Capacidad máxima fija | Mayor uso de memoria por nodo |

## Conclusión

Las tres implementaciones respetan el comportamiento FIFO.
La cola estática lineal es sencilla, pero no reutiliza los
espacios anteriores al frente. La cola circular aprovecha
las posiciones liberadas dentro de un arreglo de capacidad
fija. La cola dinámica crece mediante nodos enlazados, aunque
necesita memoria adicional para las referencias.

**Institución:** Instituto Tecnológico Superior de Xalapa  
**Asignatura:** Estructura de Datos  
**Docente:** Víctor Hugo Vásquez Herrera  
**Alumno(a):** Camila Amor Del Angel Cervantes  
**Fecha:** 18/10/2026
