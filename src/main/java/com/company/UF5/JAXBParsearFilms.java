package com.company.UF5;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

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

    public static void buscarPorTitulo(String buscar){
        System.out.println();
        filmList.stream()
                .filter(p -> p.getTitol().contains(buscar))
                .forEach(System.out::println);
    }

    public static void buscarPorDirector(String buscar){
        filmList.stream()
                .filter(p -> p.getDireccio().equals(buscar))
                .forEach(System.out::println);

        contador = filmList.stream()
                .filter(p -> p.getDireccio().contains(buscar))
                .count();
        System.out.println("\nHay " + contador +" peliculas.");
    }


}
