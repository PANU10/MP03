package com.company.stream;
import javax.xml.bind.JAXBException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws JAXBException, IOException {
        Menu menu = new Menu();
        menu.show();
    }
}
