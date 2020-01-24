package com.company.stream;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    JAXBParsearFilms jaxbParsearFilms = new JAXBParsearFilms();
    Scanner scanner = new Scanner(System.in);
    String input;

    int id;

    public Menu() throws JAXBException, IOException {
    }

    public void show() {
        Scanner tex = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.println("1. Por qué campo queremos buscar, título, director, año, etc");
        System.out.println("2. Que dé la opción de saber cuántas películas de un determinado director aparecen.");
        System.out.println("3. Cuántos títulos una determinada palabra aparece.");
        System.out.println("4. Cuántas veces un director y un intérprete coinciden");
        System.out.println("5. Películas donde aparezcan los intérpretes que seleccionas");
        System.out.println("6. Buscar cuántos tipos diferentes de idiomas hay");
        System.out.println("7. Todas las peliculas con 3 idiomas y mas.");
        System.out.println("-----------------------");

        System.out.println("Elige una opción: ");

        int opcion = tex.nextInt();
        if (opcion != 0) {
            switch (opcion) {
                case 1:
                    System.out.println("Escribe el tìtulo de la pelicula: ");
                    input = scanner.nextLine();
                    jaxbParsearFilms.consulta1(input);
                    break;

                case 2:
                    System.out.println("Escribe el nombre del Director: ");
                    input = scanner.nextLine();
                    jaxbParsearFilms.consulta2(input);
                    break;

                case 3:
                    System.out.println("Escribe el nombre del título: ");
                    input = scanner.nextLine();
                    jaxbParsearFilms.consulta3(input);

                case 4:
                    System.out.println("Introduce un ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Escribe el nombre del título: ");
                    input = scanner.nextLine();
                    jaxbParsearFilms.consulta4(id, input);
                    break;

                case 5:
                    System.out.println("Escribe el nombre del interprete: ");
                    input = scanner.nextLine();
                    jaxbParsearFilms.consulta5(input);
                    break;

                case 6:
                    System.out.println("Idiomas que esatan disponible: ");
                    jaxbParsearFilms.consulta6();
                    break;

                case 7:
                    jaxbParsearFilms.consulta7();
                    break;

                    default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
    }
}

