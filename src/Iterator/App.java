package Iterator;

// App.java
public class App {
    public static void main(String[] args) {
        ListaReproduccion lista = new ListaReproduccion();
        lista.agregar(new Cancion("Rayando el sol", "Mana"));
        lista.agregar(new Cancion("Lluvia", "Aterciopelados"));
        lista.agregar(new Cancion("Clavado en un bar", "Mana"));
        lista.agregar(new Cancion("Bolero falaz", "Aterciopelados"));

        // El mismo metodo recorre cualquier iterador, sin saber como esta guardada la lista.
        System.out.println("-- En orden --");
        imprimir(lista.iterador());
        System.out.println("-- Al reves --");
        imprimir(lista.iteradorInverso());
        System.out.println("-- Solo Mana --");
        imprimir(lista.iteradorPorArtista("Mana"));

        // Dos iteradores sobre la misma lista avanzan de forma independiente.
        Iterador<Cancion> a = lista.iterador();
        Iterador<Cancion> b = lista.iterador();
        System.out.println("-- Dos iteradores independientes --");
        System.out.println("a: " + a.siguiente());
        System.out.println("a: " + a.siguiente());
        System.out.println("b: " + b.siguiente());
    }

    private static void imprimir(Iterador<Cancion> it) {
        while (it.hayMas()) {
            System.out.println("  " + it.siguiente());
        }
    }
}
