package ChainOfResponsability;

// Manejador.java
// MANEJADOR BASE: guarda la referencia al siguiente eslabon y ofrece el codigo comun para pasar la solicitud.
public abstract class Manejador {

    private Manejador siguiente;

    // Devuelve el manejador recibido para poder encadenar: a.encadenar(b).encadenar(c)
    public Manejador encadenar(Manejador siguiente) {
        this.siguiente = siguiente;
        return siguiente;
    }

    // true = la peticion fue aceptada por toda la cadena; false = alguien la rechazo.
    public abstract boolean manejar(Peticion peticion);

    // Comportamiento por defecto: si hay otro eslabon, le pasa la solicitud.
    protected boolean pasarAlSiguiente(Peticion peticion) {
        if (siguiente == null) {
            return true;
        }
        return siguiente.manejar(peticion);
    }
}
