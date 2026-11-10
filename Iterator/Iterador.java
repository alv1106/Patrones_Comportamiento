package Iterator;

// Iterador.java
// INTERFAZ ITERADORA: las operaciones para recorrer, sin revelar como esta guardada la coleccion.
// (Java ya trae java.util.Iterator; la repetimos aqui para ver el patron completo.)
public interface Iterador<T> {
    boolean hayMas();

    T siguiente();
}
