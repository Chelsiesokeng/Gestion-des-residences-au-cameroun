package models;

import java.util.Objects;

public class Residence {
    private  String id_residence;
    private  String nom_residence;
    private  String description_residence;

    public Residence() {
    }

    public String getId_residence() {
        return id_residence;
    }



    public String getNom_residence() {
        return nom_residence;
    }

    public void setNom_residence(String nom_residence) {
        this.nom_residence = nom_residence;
    }

    public String getDescription_residence() {
        return description_residence;
    }

    public void setDescription_residence(String description_residence) {
        this.description_residence = description_residence;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "id_residence='" + id_residence + '\'' +
                ", nom_residence='" + nom_residence + '\'' +
                ", description_residence='" + description_residence + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Residence residence = (Residence) o;
        return id_residence.equals(residence.id_residence) && Objects.equals(nom_residence, residence.nom_residence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_residence, nom_residence);
    }
}
