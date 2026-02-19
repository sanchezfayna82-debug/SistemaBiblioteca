package view;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotecaview{
    public Scanner scanner = new Scanner(System.in);  

    public void mostrarMenu() {
        System.out.println("Sistema de Biblioteca MVC");
        System.out.println("1. Agregar libro");
        System.out.println("2. Listar libros");
        System.out.println("3. Salir");
    }

    public String[] pedirDatosLibro() {
        System.out.print("Ingrese título: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese autor: ");
        String autor = scanner.nextLine();
        return new String[]{titulo, autor};  
    }

    public void mostrarLibros(ArrayList<String> libros) {
        if (libros.isEmpty()) {
            System.out.println("No hay libros.");
        } else {
            for (String libro : libros) {
                System.out.println(libro);
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}