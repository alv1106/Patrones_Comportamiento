package Command;

// ComandoBorrar.java
public class ComandoBorrar implements Comando {

    private final Editor editor;
    private final int cantidad;
    private String borrado = "";      // copia de seguridad, necesaria para deshacer

    public ComandoBorrar(Editor editor, int cantidad) {
        this.editor = editor;
        this.cantidad = cantidad;
    }

    @Override
    public void ejecutar() {
        borrado = editor.borrarUltimos(cantidad);
    }

    @Override
    public void deshacer() {
        editor.insertar(borrado);
    }
}
