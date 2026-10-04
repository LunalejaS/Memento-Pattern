package originator;

import memento.Memento;

public class Editor {
    private String contenido;

    public Editor(String contenido) {
        this.contenido = contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    // Editor creates a Memento
    public Memento guardar() {
        return new Memento(contenido);
    }

    public void restaurar(Memento memento) {
        if (memento != null) {
            this.contenido = memento.getContenido();
        }
    }
}