package Iterator;

// IteradorDirecto.java
import java.util.List;

// ITERADOR CONCRETO: lleva su propio progreso (posicion), por eso pueden existir varios a la vez.
public class IteradorDirecto implements Iterador<Cancion> {

    private final List<Cancion> canciones;
    private int posicion = 0;

    public IteradorDirecto(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public boolean hayMas() {
        return posicion < canciones.size();
    }

    @Override
    public Cancion siguiente() {
        return canciones.get(posicion++);
    }
}
