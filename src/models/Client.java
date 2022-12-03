package models;

import java.util.Objects;
import java.util.UUID;

public class Client {
    private UUID id_client;
    private  String nom_client;
    private  String prenom_client;
    private  String courriel_client;
    private  String date_naiss;
    private  String pays_residence;
    private  String ville_residence;
    private  String motif_sejour;

    public Client() {
    }



    public Client(String nom_client, String prenom_client, String courriel_client, String date_naiss, String pays_residence, String ville_residence, String motif_sejour) {
        this.id_client = new UUID(16,4);
        this.nom_client = nom_client;
        this.prenom_client = prenom_client;
        this.courriel_client = courriel_client;
        this.date_naiss = date_naiss;
        this.pays_residence = pays_residence;
        this.ville_residence = ville_residence;
        this.motif_sejour = motif_sejour;
    }


    public UUID getId_client() {
        return id_client;
    }

    public void setId_client(UUID id_client) {
        this.id_client = id_client;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getPrenom_client() {
        return prenom_client;
    }

    public void setPrenom_client(String prenom_client) {
        this.prenom_client = prenom_client;
    }

    public String getCourriel_client() {
        return courriel_client;
    }

    public void setCourriel_client(String courriel_client) {
        this.courriel_client = courriel_client;
    }

    public String getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(String date_naiss) {
        this.date_naiss = date_naiss;
    }

    public String getPays_residence() {
        return pays_residence;
    }

    public void setPays_residence(String pays_residence) {
        this.pays_residence = pays_residence;
    }

    public String getVille_residence() {
        return ville_residence;
    }

    public void setVille_residence(String ville_residence) {
        this.ville_residence = ville_residence;
    }

    public String getMotif_sejour() {
        return motif_sejour;
    }

    public void setMotif_sejour(String motif_sejour) {
        this.motif_sejour = motif_sejour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id_client.equals(client.id_client) && Objects.equals(courriel_client, client.courriel_client) && Objects.equals(date_naiss, client.date_naiss);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_client, courriel_client, date_naiss);
    }
}
