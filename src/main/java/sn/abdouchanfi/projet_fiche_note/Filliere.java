/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.abdouchanfi.projet_fiche_note;

/**
 *
 * @author eabdou_chanfi
 */
public class Filliere {
    private int id;
    private String nom;
    private String description;
    
    public Filliere(int id, String nom, String description) 
    {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }
    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public  String afficher(){
        return "Groupe{" + "id=" + id + ", nom=" + nom + ", "
               + "description=" + description + '}';
    }
}
