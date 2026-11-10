package ChainOfResponsability;

// ManejadorAutenticacion.java
// MANEJADOR CONCRETO: decide si procesa la solicitud y si la deja continuar.
public class ManejadorAutenticacion extends Manejador {
    @Override
    public boolean manejar(Peticion peticion) {
        if (!peticion.getToken().startsWith("tk-")) {
            System.out.println("  [Autenticacion] Rechazada: token invalido (401)");
            return false;
        }
        System.out.println("  [Autenticacion] OK");
        return pasarAlSiguiente(peticion);
    }
}