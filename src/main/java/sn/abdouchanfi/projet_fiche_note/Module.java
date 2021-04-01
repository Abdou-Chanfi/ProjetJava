/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.abdouchanfi.projet_fiche_note;

/**
 *
 * @author abdou_chanfi
 */
public class Module {
    private int id;
    private String nom;
    private int volume_horaire;
    private int coefficient;
    private String description;
    
    
    public Module(int id,String nom, int volume_horaire, int coefficient, String description) 
    {
        this.id = id;
        this.nom = nom;
        this.volume_horaire = volume_horaire;
        this.coefficient = coefficient;
        this.description = description;
        
    }
    
    public int getid() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getVolume_horaire() {
        return volume_horaire;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVolume_horaire(int volume_horaire) {
        this.volume_horaire = volume_horaire;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public  String toString(){
       return "Module{" + "id=" + id + ", nom=" + nom + ", "
               + "volume_horaire=" + volume_horaire + ", coefficient=" + coefficient + ", description=" + description + '}';
    }
    
    
}
