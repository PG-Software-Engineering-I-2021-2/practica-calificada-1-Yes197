package Entities;

public class RulerControl implements TimeBook {

    void tiempoPrestamo(int diasPrestamo) {
        if (VerificarTiempo(diasPrestamo)){
            System.out.println("Se impondrá una multa por exceder tiempo limite de préstamo");
        }
    }

    void estadoVerificador(String estado) {
        if (estado.equals("biblioteca")) {
            ;
        }

    }
}
