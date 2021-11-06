package Entities;

public class LibroCopia {
    private String name;
    private int year;
    private String autor;
    private int identificador;

    public LibroCopia(String name, int year, String autor, int identificador) {
        this.name = name;
        this.year = year;
        this.autor = autor;
        this.identificador = identificador;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}
