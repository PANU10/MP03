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
        Menu menu = new Menu();
        menu.show();
    }
}
