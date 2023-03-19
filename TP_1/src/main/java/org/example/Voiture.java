package org.example;
// import cf.Moteur
public class Voiture implements IVoiture {
    private IMoteur moteur;

    @Override
    public void rouler(){
        moteur.demarrer();
        System.out.println("La voiture roule correctement");
    }

    public void setMoteur(IMoteur m){
        this.moteur = m;
    }
    //Moteur m;
    //Batterie b;
    /*void bouger(){
        //m = new Moteur();
        //m.demarrer();
        b = new Batterie();
        b.demarrer();
        System.out.println("Vitesse 10km/h");
    }*/
}
