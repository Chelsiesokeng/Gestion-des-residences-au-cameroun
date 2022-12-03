package models;

import java.util.Objects;
import java.util.UUID;

public class Utilisateur {
    private UUID id_user;
    private  String mot_passe;
    private  String profil;
    private  String nom_user;
    private  String prenom_user;
    private  String num_Tel;
    private  String courriel;

    public Utilisateur() {
    }

    public UUID getId_user() {
        return id_user;
    }

    public void setId_user(UUID id_user) {
        this.id_user = id_user;
    }

    public String getMot_passe() {
        return mot_passe;
    }

    public void setMot_passe(String mot_passe) {
        this.mot_passe = mot_passe;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getNom_user() {
        return nom_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public String getPrenom_user() {
        return prenom_user;
    }

    public void setPrenom_user(String prenom_user) {
        this.prenom_user = prenom_user;
    }

    public String getNum_Tel() {
        return num_Tel;
    }

    public void setNum_Tel(String num_Tel) {
        this.num_Tel = num_Tel;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilisateur that = (Utilisateur) o;
        return id_user.equals(that.id_user) && Objects.equals(num_Tel, that.num_Tel) && Objects.equals(courriel, that.courriel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_user, num_Tel, courriel);
    }
}
