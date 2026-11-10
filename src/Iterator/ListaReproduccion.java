package Iterator;

// ListaReproduccion.java
import java.util.ArrayList;
import java.util.List;

// COLECCION CONCRETA: guarda sus elementos como quiere y entrega iteradores nuevos cada vez.
public class ListaReproduccion {

    private final List<Cancion> canciones = new ArrayList<>();

    public void agregar(Cancion cancion) {
        canciones.add(cancion);
    }

    public Iterador<Cancion> iterador() {
        return new IteradorDirecto(canciones);
    }

    public Iterador<Cancion> iteradorInverso() {
        return new IteradorInverso(canciones);
    }

    public Iterador<Cancion> iteradorPorArtista(String artista) {
        return new IteradorPorArtista(canciones, artista);
    }
}
