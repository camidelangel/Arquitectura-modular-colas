package Estructuras_lineales.Cola;

public class NodoColas {

    /**
     * Representa un nodo de una lista simplemente enlazada.
     * Se utiliza en la implementación de la cola dinámica.
     */

        int dato;          // Valor almacenado.
        NodoColas siguiente;    // Referencia al siguiente nodo.

        /**
         * Construye un nodo con el valor indicado.
         *
         * @param dato valor que se guardará.
         */
        public NodoColas(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }


