package models;

import java.util.Objects;

public class Prestation_Service {
    private  String id_prest_serv;
    private  String nom_prest;
    private  String desc_prest;
    private  String prix_base;

    public Prestation_Service() {
    }

    public Prestation_Service(String id_prest_serv, String nom_prest, String desc_prest, String prix_base) {
        this.id_prest_serv = id_prest_serv;
        this.nom_prest = nom_prest;
        this.desc_prest = desc_prest;
        this.prix_base = prix_base;
    }

    public String getId_prest_serv() {
        return id_prest_serv;
    }

    public void setId_prest_serv(String id_prest_serv) {
        this.id_prest_serv = id_prest_serv;
    }

    public String getNom_prest() {
        return nom_prest;
    }

    public void setNom_prest(String nom_prest) {
        this.nom_prest = nom_prest;
    }

    public String getDesc_prest() {
        return desc_prest;
    }

    public void setDesc_prest(String desc_prest) {
        this.desc_prest = desc_prest;
    }

    public String getPrix_base() {
        return prix_base;
    }

    public void setPrix_base(String prix_base) {
        this.prix_base = prix_base;
    }

    @Override
    public String toString() {
        return "Prestation_Service{" +
                "id_prest_serv='" + id_prest_serv + '\'' +
                ", nom_prest='" + nom_prest + '\'' +
                ", desc_prest='" + desc_prest + '\'' +
                ", prix_base='" + prix_base + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prestation_Service that = (Prestation_Service) o;
        return id_prest_serv.equals(that.id_prest_serv) && Objects.equals(nom_prest, that.nom_prest) && Objects.equals(desc_prest, that.desc_prest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_prest_serv, nom_prest, desc_prest);
    }
}
