package Entities;
import java.util.ArrayList;
import java.util.Date;

public class Autor implements IAutor{
    private String name;
    private Date birthDate;
    private ArrayList <Libro> books;


    public Autor(String name, Date birthDate, ArrayList <Libro> books) {
        this.name = name;
        this.birthDate = birthDate;
        this.books = books;
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
