package ChainOfResponsability;

// App.java
public class App {
    public static void main(String[] args) {

        // El cliente arma la cadena: autenticacion -> autorizacion -> limite
        Manejador cadena = new ManejadorAutenticacion();
        cadena.encadenar(new ManejadorAutorizacion())
              .encadenar(new ManejadorLimite());

        enviar(cadena, new Peticion("ana", "tk-1", "USUARIO", "/productos"));
        enviar(cadena, new Peticion("luis", "", "USUARIO", "/productos"));
        enviar(cadena, new Peticion("ana", "tk-1", "USUARIO", "/admin/usuarios"));
        enviar(cadena, new Peticion("root", "tk-9", "ADMIN", "/admin/usuarios"));
        enviar(cadena, new Peticion("ana", "tk-1", "USUARIO", "/productos"));
        enviar(cadena, new Peticion("ana", "tk-1", "USUARIO", "/productos"));
        enviar(cadena, new Peticion("ana", "tk-1", "USUARIO", "/productos"));
    }

    private static void enviar(Manejador cadena, Peticion p) {
        System.out.println("Peticion de " + p.getUsuario() + " a " + p.getRuta());
        boolean aceptada = cadena.manejar(p);
        System.out.println("  => " + (aceptada ? "ACEPTADA" : "RECHAZADA"));
    }
}
