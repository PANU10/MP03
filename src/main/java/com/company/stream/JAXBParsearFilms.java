package com.company.stream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JAXBParsearFilms {

    static List<Film> filmList;
    static Scanner tex = new Scanner(System.in);
    static long contador;

    public JAXBParsearFilms() throws JAXBException, IOException {
        URL url = new URL("http://gencat.cat/llengua/cinema/provacin.xml");
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.addRequestProperty("User-Agent", "Mozilla/4.76");
        InputStream is = http.getInputStream();
        JAXBContext jaxbContext = JAXBContext.newInstance(Films.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        filmList = ((Films)jaxbUnmarshaller.unmarshal(is)).film;
    }

    public static void consulta1(String buscar){
        filmList.stream()
                .filter(p -> p.getTitol().contains(buscar))
                .forEach(System.out::println);
    }

    public static void consulta2(String buscar){
        filmList.stream()
                .filter(p -> p.getDireccio().equals(buscar))
                .forEach(System.out::println);
        contador = filmList.stream()
                .filter(p -> p.getDireccio().contains(buscar))
                .count();
        System.out.println("\nHay " + contador +" peliculas.");
    }

    public static void consulta3(String buscar){
        contador = filmList.stream()
                .filter(p -> p.getTitol().contains(buscar))
                .count();
        System.out.println("\nHay " + contador +" titulos.");
    }

    public static void consulta4(int id, String titulo){

        filmList.stream()
                .filter(p -> p.getDireccio().equals(id) && p.getTitol().contains(titulo))
                .forEach(System.out::println);

        contador = filmList.stream()
                .filter(p -> p.getFimlid()==(id) && p.getTitol().contains(titulo))
                .count();
        System.out.println(contador);
    }

    public  static void consulta5(String buscar){
        filmList.stream()
                .filter(p -> p.getInterprets().contains(buscar))
                .forEach(System.out::println);
    }
    public static void consulta6() {
        filmList.stream()
                .distinct()
                .forEach(film -> System.out.println(film.getIdioma()));
    }

    public  static void consulta7(){
        //todas las peliculas con 3 idiomas y mas
        filmList.stream()
                .filter(film -> {
                    if (buscarComas(film.getIdioma()) > 0) return true;
                    return false;
                })
                .sorted().collect(Collectors.toList())
                .forEach(film -> System.out.println(film));
    }


    public static int buscarComas(String parrafo){
        int count = 0;
        for(char c : parrafo.toCharArray()){
            if (c == ',') count++;
        }
        return count;
    }
}
