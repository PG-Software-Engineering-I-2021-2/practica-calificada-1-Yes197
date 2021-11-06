package Entities;

public class RulerControl implements IRulerControl {

    private int diasPrestamo;
    private String estado;


    public Boolean verificarTiempo(int diasPrestamo){
        if (diasPrestamo <= 30){
            return Boolean.TRUE;
        }
        else{
            return Boolean.FALSE;
        }
    }

    public Boolean estadoVerificador(String estado) {
        if (estado.equals("en biblioteca")) {
            return Boolean.TRUE;
        }
        else{
            return Boolean.FALSE;
        }

    }
}
