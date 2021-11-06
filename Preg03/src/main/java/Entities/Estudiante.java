package Entities;

public class Estudiante implements IEstudiante{

    private int cantLibros;
    private Boolean multa;

    public Estudiante(int cantLibros, Boolean multa) {
        this.cantLibros = cantLibros;
        this.multa = multa;
    }

    public int getCantLibros() {
        return cantLibros;
    }

    public void setCantLibros(int cantLibros) {
        this.cantLibros = cantLibros;
    }

    public Boolean getMulta() {
        return multa;
    }

    public void setMulta(Boolean multa) {
        this.multa = multa;
    }

}
