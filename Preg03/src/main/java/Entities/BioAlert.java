package Entities;

public class BioAlert {
    private static BioAlert bioAlert;
    private Libro libro;

    private BioAlert() {

    }

    public synchronized static BioAlert empezarChat(){
        if (bioAlert == null){
            bioAlert = new BioAlert();
        }
        return bioAlert;
    }

    void solicitarPrestamo (libr){

    }


}
