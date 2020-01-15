package com.company.UF5;

import com.company.UF5.Film;
import com.company.UF5.Films;
import com.company.UF5.JAXBParsearFilms;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws JAXBException, IOException {
	// write your code here
        Scanner tex = new Scanner(System.in);

        JAXBParsearFilms jax_film = new JAXBParsearFilms();
        List<Film> filmList = jax_film.getFilms();

        System.out.println("Opciones: \n");

            System.out.println("-----------------------");
            System.out.println("1. ¿Buscar peliculas con titulo?");
            System.out.println();
            System.out.println("-----------------------");
        int opcion = tex.nextInt();

        if (opcion > 0) {
            switch (opcion) {

                case 1:
                    System.out.println(filmList.stream().count());
                    filmList.stream()
                            .filter(p -> p.getTitol().contains("Espies"))
                            .forEach(System.out::println);
                    break;
                case 2:

                    System.out.println("Opcion 2");
                    break;

                case 3:

                    System.out.println("Opcion 3");
                    break;

                case 4:

                    System.out.println("Opcion 4");
                    break;

                default:
                    opcion = 0;
                    break;
            }
        }
        else System.out.println("Opción incorrecta");
    }
}
