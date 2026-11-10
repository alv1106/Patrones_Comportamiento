package Command;

// ComandoEscribir.java
// COMANDO CONCRETO: guarda los parametros de la solicitud y delega el trabajo en el receptor.
public class ComandoEscribir implements Comando {

    private final Editor editor;
    private final String fragmento;

    public ComandoEscribir(Editor editor, String fragmento) {
        this.editor = editor;
        this.fragmento = fragmento;
    }

    @Override
    public void ejecutar() {
        editor.insertar(fragmento);
    }

    @Override
    public void deshacer() {
        editor.borrarUltimos(fragmento.length());
    }
}
