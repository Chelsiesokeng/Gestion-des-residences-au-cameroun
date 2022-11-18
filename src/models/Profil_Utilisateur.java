package models;

import java.util.ArrayList;

public class Profil_Utilisateur {
    private String titre;
    ArrayList<String> Titres = new ArrayList<String>();
    private String description;

    public Profil_Utilisateur() {
        this.titre = "...";
        Titres.add(this.titre);
        this.description = "...";
    }

    public Profil_Utilisateur(String titre, String description) {
        this.titre = titre;
        Titres.add(titre);
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        if (!Titres.contains(titre)){
            this.titre = titre;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*public boolean creerProfil(String titre, String description){
        if (!Titres.contains(titre)){
            new Profil_Utilisateur(titre , description);
            return true;
        }
        else {
            System.out.println("Un autre profil a déjà ce titre, deux profils ne peuvent pas avoir le même titre.");
            return false;
        }
    }

    public void modifierprofil(){}//setteurs
    public void deleteprofil(){}
    public void consultprofil(){}//getteurs
    public void listprofil(){}
    public ProfilUtilisateur researchprofil(){
        return ;
    }*/

}

