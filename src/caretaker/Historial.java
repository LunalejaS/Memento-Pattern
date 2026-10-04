package caretaker;

import java.util.Stack;
import memento.Memento;

public class Historial {
    private Stack<Memento> historial = new Stack<>();

    public void guardarEstado(Memento memento) {
        historial.push(memento);
    }

    public Memento obtenerUltimoEstado() {
        return historial.isEmpty() ? null : historial.pop();
    }
}