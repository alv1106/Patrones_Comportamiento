package Iterator;

// IteradorInverso.java
import java.util.List;

public class IteradorInverso implements Iterador<Cancion> {

    private final List<Cancion> canciones;
    private int posicion;

    public IteradorInverso(List<Cancion> canciones) {
        this.canciones = canciones;
        this.posicion = canciones.size() - 1;
    }

    @Override
    public boolean hayMas() {
        return posicion >= 0;
    }

    @Override
    public Cancion siguiente() {
        return canciones.get(posicion--);
    }
}