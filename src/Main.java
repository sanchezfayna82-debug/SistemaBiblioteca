import controller.BibliotecaController;
import model.Biblioteca;
import view.BibliotecaView;

public class Main {
    public static void main(String[] args) {
        // Crea objetos (instanciación POO del temario)
        Biblioteca model = new Biblioteca();  // Objeto para datos
        BibliotecaView view = new BibliotecaView();  // Objeto para presentación
        BibliotecaController controller = new BibliotecaController(model, view);  // Objeto para control

        // Ejecuta el comportamiento
        controller.iniciar();  // Inicia el menú y flujo
    }
}
