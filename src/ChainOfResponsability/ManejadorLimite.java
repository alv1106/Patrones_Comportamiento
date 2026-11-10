package ChainOfResponsability;

// ManejadorLimite.java
import java.util.HashMap;
import java.util.Map;

// Este manejador tiene estado propio: cuenta cuantas peticiones ha dejado pasar por usuario.
public class ManejadorLimite extends Manejador {

    private static final int MAXIMO = 3;
    private final Map<String, Integer> conteo = new HashMap<>();

    @Override
    public boolean manejar(Peticion peticion) {
        int usadas = conteo.getOrDefault(peticion.getUsuario(), 0) + 1;
        if (usadas > MAXIMO) {
            System.out.println("  [Limite] Rechazada: demasiadas peticiones (429)");
            return false;
        }
        conteo.put(peticion.getUsuario(), usadas);
        System.out.println("  [Limite] OK (" + usadas + " de " + MAXIMO + ")");
        return pasarAlSiguiente(peticion);
    }
}
