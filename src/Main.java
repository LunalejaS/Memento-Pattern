import caretaker.Historial;
import originator.Editor;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor("Holaa...");
        Historial historial = new Historial(); 
    
        System.out.println("***Contenido incial: " + editor.getContenido());

        // Changing the content for first time and saving the state
        editor.setContenido("Hola... Bienvenidos");
        historial.guardarEstado(editor.guardar());
        System.out.println("\n> Contenido actual: \n    " + editor.getContenido());
        System.out.println("... Guardando contenido en el historial...");
        
        // Changing the content for second time and saving the state
        editor.setContenido("    Hola, Bienvenidos: Este es un ejemplo de cambio de textos.\n    Esto dentro de un editor de texto con historial.");
        historial.guardarEstado(editor.guardar());
        System.out.println("\n> Contenido actual: \n" + editor.getContenido());
        System.out.println("... Guardando contenido en el historial...");

        // Restoring to the last saved state
        editor.setContenido("    Hola, Bienvenidos: Este es un ejemplo de cambio de textos.\n    Esto dentro de un editor de texto con historial, s?n embtatf.");
        System.out.println("\n> Contenido actual: \n" + editor.getContenido());

        System.out.println(" \n| El usuario desea restaurar a una versión anterior.\n  ... Restaurando contenido del historial...");
        editor.restaurar(historial.obtenerUltimoEstado());
        System.out.println("\n> Contenido restaurado: \n" + editor.getContenido());
    }
}