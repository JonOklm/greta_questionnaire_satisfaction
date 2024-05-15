package com.example.greta_questionnaire_satisfaction.entity;

import javax.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Formation")
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomFormation;

    private String description;

    private String date_debut;

    private String date_fin;
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nomFormation == null) ? 0 : nomFormation.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((date_debut == null) ? 0 : date_debut.hashCode());
        result = prime * result + ((date_fin == null) ? 0 : date_fin.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Formation other = (Formation) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nomFormation == null) {
            if (other.nomFormation != null)
                return false;
        } else if (!nomFormation.equals(other.nomFormation))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (date_debut == null) {
            if (other.date_debut != null)
                return false;
        } else if (!date_debut.equals(other.date_debut))
            return false;
        if (date_fin == null) {
            if (other.date_fin != null)
                return false;
        } else if (!date_fin.equals(other.date_fin))
            return false;
        return true;
    }

    public Formation(Long id, String nomFormation, String description, String date_debut, String date_fin) {
        this.id = id;
        this.nomFormation = nomFormation;
        this.description = description;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }

    @Override
    public String toString() {
        return "Formation [id=" + id + ", nomFormation=" + nomFormation + ", description=" + description
                + ", date_debut=" + date_debut + ", date_fin=" + date_fin + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomFormation() {
        return nomFormation;
    }

    public void setNomFormation(String nomFormation) {
        this.nomFormation = nomFormation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }


    // Getters and setters
}
