package AgenteVirtualLibreria;

public class Libro {
    private String name;
    private int year;
    private String autor;


    public Libro(String name, int year, String autor) {
        this.name = name;
        this.year = year;
        this.autor = autor;
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
}
