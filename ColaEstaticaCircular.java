
package Estructuras_lineales.Cola;

/**
 * Cola circular estática implementada con un arreglo.
 *
 * El operador módulo (%) permite regresar al inicio
 * del arreglo cuando se alcanza su última posición.
 */
public class ColaEstaticaCircular {

    private final int[] arreglo;
    private int frente;
    private int fin;
    private final int capacidad;
    private int tamanio;

    /** Crea una cola circular vacía. */
    public ColaEstaticaCircular(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException(
                    "La capacidad debe ser mayor que cero."
            );
        }

        this.capacidad = capacidad;
        arreglo = new int[capacidad];
        frente = 0;
        fin = 0;
        tamanio = 0;
    }

    /** Comprueba si la cola está vacía. */
    public boolean estaVacia() {
        return tamanio == 0;
    }

    /** Comprueba si todos los espacios están ocupados. */
    public boolean estaLlena() {
        return tamanio == capacidad;
    }

    /**
     * Inserta un elemento al final de la cola circular.
     */
    public void enqueue(int valor) {
        if (estaLlena()) {
            System.out.println(
                    "Error: la cola circular está llena."
            );
            return;
        }

        arreglo[fin] = valor;

        // El índice regresa a cero al llegar al límite.
        fin = (fin + 1) % capacidad;

        tamanio++;

        System.out.println(
                "Entró a la fila circular: " + valor
        );
    }

    /**
     * Retira el elemento que está al frente.
     *
     * @return valor retirado o -1 si está vacía.
     */
    public int dequeue() {
        if (estaVacia()) {
            System.out.println(
                    "Error: la cola circular está vacía."
            );
            return -1;
        }

        int valor = arreglo[frente];

        // Avanza circularmente el índice del frente.
        frente = (frente + 1) % capacidad;

        tamanio--;

        System.out.println(
                "Atendido y fuera: " + valor
        );

        return valor;
    }

    /**
     * Consulta el elemento del frente sin extraerlo.
     */
    public int peek() {
        if (estaVacia()) {
            System.out.println(
                    "La cola circular está vacía; no hay elemento al frente."
            );
            return -1;
        }

        return arreglo[frente];
    }

    /** Muestra los elementos en su orden lógico. */
    public void mostrar() {
        if (estaVacia()) {
            System.out.println(
                    "La cola circular está vacía."
            );
            return;
        }

        System.out.print("Frente -> ");

        for (int i = 0; i < tamanio; i++) {

            // Calcula cada posición respetando el ciclo.
            int indice = (frente + i) % capacidad;

            System.out.print(
                    "[" + arreglo[indice] + "] "
            );
        }

        System.out.println("<- Fin");
    }

    /** Devuelve la cantidad actual de elementos. */
    public int contarElementos() {
        return tamanio;
    }
}

