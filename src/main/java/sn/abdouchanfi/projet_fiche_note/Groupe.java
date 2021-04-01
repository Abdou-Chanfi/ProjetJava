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
public class Groupe {
    private int id;
    private String nom_groupe;
    private String date_creation;
   
    public Groupe(int id, String nom_groupe, String date_creation) 
    {
        this.id = id;
        this.nom_groupe = nom_groupe;
        this.date_creation = date_creation;
    }
    
    public int getId() {
        return id;
    }

    public String getNom_groupe() {
        return nom_groupe;
    }

    public String getDate_creation() {
        return date_creation;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNom_groupe(String nom_groupe) {
        this.nom_groupe = nom_groupe;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public  String afficher(){
        return "Groupe{" + "id=" + id + ", nom_groupe=" + nom_groupe + ", "
               + "date_creation=" + date_creation + '}';
    }
}
