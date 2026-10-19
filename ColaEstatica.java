package Estructuras_lineales.Cola;

public class ColaEstatica {

    /**
     * Cola estática lineal implementada mediante un arreglo.
     *
     * La capacidad se establece al crear el objeto.
     * Esta versión no reutiliza las posiciones que quedan
     * antes del índice frente cuando se retiran elementos.
     */

        private final int[] arreglo;
        private int frente;
        private int fin;
        private final int capacidad;
        private int tamanio;

        /**
         * Constructor: crea una cola vacía.
         *
         * @param tamano capacidad máxima del arreglo.
         */
        public ColaEstatica(int tamano) {
            if (tamano <= 0) {
                throw new IllegalArgumentException(
                        "El tamaño debe ser mayor que cero."
                );
            }

            capacidad = tamano;
            arreglo = new int[capacidad];
            frente = 0;
            fin = -1;
            tamanio = 0;
        }

        /** Comprueba si la cola está vacía. */
        public boolean estaVacia() {
            return tamanio == 0;
        }

        /**
         * Comprueba si el índice de inserción llegó
         * al último espacio del arreglo.
         */
        public boolean estaLlena() {
            return fin == capacidad - 1;
        }

        /**
         * Inserta un elemento al final de la cola.
         *
         * @param valor número que se desea insertar.
         */
        public void enqueue(int valor) {
            if (estaLlena()) {
                System.out.println(
                        "Error: la cola está llena."
                );
                return;
            }

            fin++;
            arreglo[fin] = valor;
            tamanio++;

            System.out.println(
                    "Entró a la fila: " + valor
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
                        "Error: la cola está vacía."
                );
                return -1;
            }

            int valor = arreglo[frente];

            System.out.println(
                    "Atendido y fuera: " + valor
            );

            frente++;
            tamanio--;

            return valor;
        }

        /**
         * Consulta el elemento del frente sin retirarlo.
         *
         * No modifica frente, fin ni el tamaño.
         *
         * @return valor del frente o -1 si está vacía.
         */
        public int peek() {
            if (estaVacia()) {
                System.out.println(
                        "La cola está vacía; no hay elemento al frente."
                );
                return -1;
            }

            return arreglo[frente];
        }

        /** Muestra los elementos en orden FIFO. */
        public void mostrar() {
            if (estaVacia()) {
                System.out.println("La cola está vacía.");
                return;
            }

            System.out.print("Frente -> ");

            for (int i = frente; i <= fin; i++) {
                System.out.print(
                        "[" + arreglo[i] + "] "
                );
            }

            System.out.println("<- Fin");
        }

        /** Devuelve la cantidad actual de elementos. */
        public int contarElementos() {
            return tamanio;
        }
}

