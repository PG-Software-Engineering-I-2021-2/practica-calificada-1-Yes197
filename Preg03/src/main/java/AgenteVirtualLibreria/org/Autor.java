package AgenteVirtualLibreria.org;

import java.util.ArrayList;
import java.util.Date;

public class Autor {
    private String name;
    private Date birthDate;


    private ArrayList <Libro> libros;

    public Autor(String name, Date birthDate, ArrayList <Libro> libros) {
        this.name = name;
        this.birthDate = birthDate;
        this.libros = libros;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
