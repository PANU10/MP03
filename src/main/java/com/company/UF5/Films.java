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

    @XmlElement(name = "DIRECCIO")
    private String direccio;

    public String getDireccio() {
        return direccio;
    }
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
        return "fimlid = " + fimlid +
                "\nprioritat = " + prioritat +
                "\nany = " + any +
                "\ntitol = " + titol +
                "\noriginal = " + original +
                "\ndirector = " + direccio;
    }
}
