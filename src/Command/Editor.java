package Command;

// Editor.java
// RECEPTOR: contiene la logica de negocio real. No sabe nada de comandos.
public class Editor {

    private final StringBuilder texto = new StringBuilder();

    public void insertar(String fragmento) {
        texto.append(fragmento);
    }

    // Borra los ultimos n caracteres y devuelve lo que borro (para poder deshacer).
    public String borrarUltimos(int n) {
        int inicio = Math.max(0, texto.length() - n);
        String borrado = texto.substring(inicio);
        texto.delete(inicio, texto.length());
        return borrado;
    }

    public String getTexto() {
        return texto.toString();
    }
}
