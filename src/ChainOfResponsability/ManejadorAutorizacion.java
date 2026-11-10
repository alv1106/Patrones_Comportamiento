package ChainOfResponsability;

// ManejadorAutorizacion.java
public class ManejadorAutorizacion extends Manejador {
    @Override
    public boolean manejar(Peticion peticion) {
        boolean esAdmin = peticion.getRol().equals("ADMIN");
        if (peticion.getRuta().startsWith("/admin") && !esAdmin) {
            System.out.println("  [Autorizacion] Rechazada: se requiere rol ADMIN (403)");
            return false;
        }
        System.out.println("  [Autorizacion] OK");
        return pasarAlSiguiente(peticion);
    }
}
