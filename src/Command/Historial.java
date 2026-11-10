package Command;

// Historial.java
import java.util.ArrayDeque;
import java.util.Deque;

// EMISORA (invocadora): ejecuta comandos que le entregan ya creados y los recuerda para deshacerlos.
public class Historial {

    private final Deque<Comando> ejecutados = new ArrayDeque<>();

    public void ejecutar(Comando comando) {
        comando.ejecutar();
        ejecutados.push(comando);
    }

    public boolean deshacer() {
        if (ejecutados.isEmpty()) {
            return false;
        }
        ejecutados.pop().deshacer();
        return true;
    }
}