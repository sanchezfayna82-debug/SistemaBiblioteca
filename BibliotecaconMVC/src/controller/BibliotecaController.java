package controller;

import model.Biblioteca;
import model.Libro;
import view.Bibliotecaview;

public class BibliotecaController {

    private Biblioteca model;  
    private Bibliotecaview view; 

    public BibliotecaController(Biblioteca model, Bibliotecaview view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {  
            view.mostrarMenu();  
            int opcion = Integer.parseInt(view.scanner.nextLine()); 

            switch (opcion) {
                case 1:  
                    String[] datos = view.pedirDatosLibro();  
                    Libro nuevoLibro = new Libro(datos[0], datos[1]);  
                    model.agregarLibro(nuevoLibro);  
                    view.mostrarMensaje("Libro agregado.");
                    break;
                case 2:  
                    view.mostrarLibros(model.listarLibros());  
                    break;
                case 3:
                    salir = true;
                    view.mostrarMensaje("Saliendo...");
                    break;
                default:
                    view.mostrarMensaje("Opción inválida.");
            }
        }
    }
}