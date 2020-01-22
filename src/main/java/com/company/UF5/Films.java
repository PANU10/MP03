package com.company.UF5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.Objects;

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

    @XmlElement(name = "INTERPRETS")
    private String interprets;

    @XmlElement(name = "IDIOMA_x0020_ORIGINAL")
    private  String idioma;

    public String getIdioma() {
        return idioma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return idioma.equals(film.idioma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idioma);
    }

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
    public String getInterprets() {
        return interprets;
    }

    @Override
    public String toString() {
        return "fimlid = " + fimlid +
                "\nprioritat = " + prioritat +
                "\nany = " + any +
                "\ntitol = " + titol +
                "\noriginal = " + original +
                "\ndirector = " + direccio +
                "\ninterprests = " + interprets;
    }
}
