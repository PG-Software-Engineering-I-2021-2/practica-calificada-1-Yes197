package Entities;

public class RulerControl implements IRulerControl {

    private int diasPrestamo;
    private String estado;


    public Boolean VerificarTiempo(int diasPrestamo){
        if (diasPrestamo > 30){
            return Boolean.TRUE;
        }
        else{
            return Boolean.FALSE;
        }
    }

    void estadoVerificador(String estado) {
        if (estado.equals("biblioteca")) {
            ;
        }

    }
}
