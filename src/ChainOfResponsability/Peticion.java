package ChainOfResponsability;

// Peticion.java
// Solicitud que viaja por la cadena de manejadores (simula una peticion web).
public class Peticion {

    private final String usuario;
    private final String token;
    private final String rol;
    private final String ruta;

    public Peticion(String usuario, String token, String rol, String ruta) {
        this.usuario = usuario;
        this.token = token;
        this.rol = rol;
        this.ruta = ruta;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getToken() {
        return token;
    }

    public String getRol() {
        return rol;
    }

    public String getRuta() {
        return ruta;
    }
}
