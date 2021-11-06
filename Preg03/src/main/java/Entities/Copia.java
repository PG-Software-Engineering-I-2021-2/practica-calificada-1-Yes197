package Entities;

public class Copia implements ICopia{
    
    private String name;
    private int year;
    private String autor;
    private int identificador;
    private String estado;
    private int diasPrestamo;

    public Copia(String name, int year, String autor, int identificador, String estado, int diasPrestamo) {
        this.name = name;
        this.year = year;
        this.autor = autor;
        this.identificador = identificador;
        this.estado = estado;
        this.diasPrestamo = diasPrestamo;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
