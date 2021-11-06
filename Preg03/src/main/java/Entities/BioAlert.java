package Entities;

public class BioAlert implements ISystemBioAlert{
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

    @Override
    public ILibro crearLibro() {
        return new Libro();
    }

    void ILibro (){

    }


}
