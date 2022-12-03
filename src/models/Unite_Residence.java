package models;

import java.util.Objects;
import java.util.UUID;

public class Unite_Residence {
    private UUID id_Unite;
    private  String nom_Unite;
    private  String desc_Unite;
    private Type_Unite type;

    public Unite_Residence() {
    }

    public Unite_Residence(String nom_Unite, String desc_Unite, Type_Unite type) {
        this.id_Unite = new UUID(16,4);
        this.nom_Unite = nom_Unite;
        this.desc_Unite = desc_Unite;
        this.type = type;
    }

    public UUID getId_Unite() {
        return id_Unite;
    }

    public void setId_Unite(UUID id_Unite) {
        this.id_Unite = id_Unite;
    }

    public String getNom_Unite() {
        return nom_Unite;
    }

    public void setNom_Unite(String nom_Unite) {
        this.nom_Unite = nom_Unite;
    }

    public String getDesc_Unite() {
        return desc_Unite;
    }

    public void setDesc_Unite(String desc_Unite) {
        this.desc_Unite = desc_Unite;
    }

    public Type_Unite getType() {
        return type;
    }

    public void setType(Type_Unite type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unite_Residence that = (Unite_Residence) o;
        return id_Unite.equals(that.id_Unite) && Objects.equals(nom_Unite, that.nom_Unite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_Unite, nom_Unite);
    }
}
