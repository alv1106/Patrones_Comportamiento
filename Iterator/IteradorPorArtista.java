package Iterator;

// IteradorPorArtista.java
import java.util.List;

// Recorre solo las canciones de un artista: un algoritmo de recorrido distinto, misma interfaz.
public class IteradorPorArtista implements Iterador<Cancion> {

    private final List<Cancion> canciones;
    private final String artista;
    private int posicion = 0;

    public IteradorPorArtista(List<Cancion> canciones, String artista) {
        this.canciones = canciones;
        this.artista = artista;
        avanzarHastaLaSiguiente();
    }

    private void avanzarHastaLaSiguiente() {
        while (posicion < canciones.size() && !canciones.get(posicion).getArtista().equals(artista)) {
            posicion++;
        }
    }

    @Override
    public boolean hayMas() {
        return posicion < canciones.size();
    }

    @Override
    public Cancion siguiente() {
        Cancion actual = canciones.get(posicion++);
        avanzarHastaLaSiguiente();
        return actual;
    }
}
