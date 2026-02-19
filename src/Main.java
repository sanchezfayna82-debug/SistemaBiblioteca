import controller.BibliotecaController;
import model.Biblioteca;
import view.Bibliotecaview;

public class Main {
    public static void main(String[] args) {

        Biblioteca model = new Biblioteca();
        Bibliotecaview view = new Bibliotecaview();
        BibliotecaController controller = new BibliotecaController(model, view);


        controller.iniciar();
    }
}