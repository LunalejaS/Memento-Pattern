package main;

import caretaker.Historial;
import originator.Editor;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor("Holaa...");
        Historial historial = new Historial(); 
    
        System.out.println("Contenido incial: " + editor.getContenido());

        // Changing the content and saving the state
        editor.setContenido("Hola... Bienvenidos");
        historial.guardarEstado(editor.guardar());
        System.out.println("\n> Contenido cambiado por primera vez: " + editor.getContenido());
    }
}
