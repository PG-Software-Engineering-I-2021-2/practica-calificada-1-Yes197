package Entities;

public class BioAlert {
    private static BioAlert bioAlert;

    private BioAlert() {

    }

    public static BioAlert empezarChat(){
        if (bioAlert == null){
            bioAlert = new BioAlert();
        }
        return bioAlert;
    }




}
