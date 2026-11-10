package Command;

// App.java
public class App {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Historial historial = new Historial();

        historial.ejecutar(new ComandoEscribir(editor, "Hola"));
        historial.ejecutar(new ComandoEscribir(editor, " mundo"));
        historial.ejecutar(new ComandoBorrar(editor, 3));
        mostrar("Despues de 3 comandos", editor);

        historial.deshacer();
        mostrar("Deshacer 1 (restaura lo borrado)", editor);

        historial.deshacer();
        mostrar("Deshacer 2", editor);

        historial.deshacer();
        mostrar("Deshacer 3", editor);

        System.out.println("Hay algo mas por deshacer? " + historial.deshacer());
    }

    private static void mostrar(String etiqueta, Editor editor) {
        System.out.println(etiqueta + ": \"" + editor.getTexto() + "\"");
    }
}
