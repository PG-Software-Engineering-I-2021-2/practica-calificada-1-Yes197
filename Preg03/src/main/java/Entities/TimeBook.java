package Entities;

public interface TimeBook {
    


    public Boolean VerificarTiempo(diasPrestamo){
        if (diasPrestamo > 30){
            return Boolean.TRUE;
        }
        else{
            return Boolean.FALSE;
        }
    }
}
