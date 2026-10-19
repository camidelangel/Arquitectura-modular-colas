
package Estructuras_lineales.Cola;

/** Programa principal para probar la cola estática lineal. */
public class MainColaEsta {

    public static void main(String[] args) {

        // Crea una cola con capacidad para tres elementos.
        ColaEstatica miCola = new ColaEstatica(3);

        System.out.println("=== COLA ESTÁTICA LINEAL ===");

        // Inserta tres elementos.
        miCola.enqueue(10);
        miCola.enqueue(20);
        miCola.enqueue(30);

        miCola.mostrar();

        // Consulta el frente sin eliminar el elemento.
        System.out.println(
                "Elemento al frente (peek): " + miCola.peek()
        );

        System.out.println(
                "Cantidad de elementos: "
                        + miCola.contarElementos()
        );

        // Retira el primer elemento.
        miCola.dequeue();
        miCola.mostrar();

        // El arreglo ya llegó al final: no reutiliza el espacio liberado.
        miCola.enqueue(40);

        // Muestra el estado final.
        miCola.mostrar();
    }
}
