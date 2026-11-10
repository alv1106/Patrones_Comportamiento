package Command;

// Comando.java
// INTERFAZ COMANDO: toda solicitud se convierte en un objeto con estas dos operaciones.
public interface Comando {
    void ejecutar();

    void deshacer();
}