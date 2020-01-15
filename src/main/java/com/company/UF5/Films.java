package com.company.UF5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "dataroot")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Films {

    @XmlElement(name = "FILM")
    public List<Film> film;

    @Override
    public String toString() {
        return "Films{" +
                "film=" + film +
                '}';
    }
}

class Film {

    @XmlElement(name = "IDFILM")
    private int fimlid;

    @XmlElement(name = "PRIORITAT")
    private int prioritat;

    @XmlElement(name = "ANY")
    private int any;

    @XmlElement(name = "TITOL")
    private String titol;

    @XmlElement(name = "ORIGINAL")
    private String original;


    public String getTitol() {
        return titol;
    }

    public String getOriginal() {
        return original;
    }

    public int getFimlid() {
        return fimlid;
    }

    public int getPrioritat() {
        return prioritat;
    }

    public int getAny() {
        return any;
    }

    @Override
    public String toString() {
        return "Film{" +
                "fimlid=" + fimlid +
                ", prioritat=" + prioritat +
                ", any=" + any +
                ", titol=" + titol +
                ", original=" + original +
                '}';
    }
}
