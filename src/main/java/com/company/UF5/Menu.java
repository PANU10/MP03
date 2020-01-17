package com.company.UF5;


import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    JAXBParsearFilms jaxbParsearFilms = new JAXBParsearFilms();
    Scanner scanner = new Scanner(System.in);
    String input;

    public Menu() throws JAXBException, IOException {
    }

    public void show() {
        Scanner tex = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("1. Buscar por titulo.");
        System.out.println("2. Buscar por director.");
        System.out.println("3. Buscar por id.");
        System.out.println("4. Buscar por prioridad.");
        System.out.println("5. Buscar por original.");
        System.out.println("-----------------------");

        int opcion = tex.nextInt();
        if (opcion != 0) {
            switch (opcion) {
                case 1:
                    System.out.println("Escribe el nombre de la pelicula: ");
                    input = scanner.nextLine();
                    jaxbParsearFilms.buscarPorTitulo(input);
                    break;

                case 2:
                    System.out.println("Escribe el nombre del Director: ");
                    input = scanner.nextLine();
                    jaxbParsearFilms.buscarPorDirector(input);
                    break;

                case 3:
                    System.out.println("Opcion 3");
                    break;

                case 4:
                    System.out.println("Opcion 4");
                    break;

                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
    }
}

