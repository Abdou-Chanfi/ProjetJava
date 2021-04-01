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
public class Sceance {
    private int id;
    private String date;
    private int heure_debut;
    private int heure_fin;
    
    
    public Sceance(int id, String date, int heure_debut, int heure_fin) 
    {
        this.id = id;
        this.date = date;
        this.heure_debut = heure_debut;
        this.heure_fin = heure_fin;
    }
    
    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public int getHeure_debut() {
        return heure_debut;
    }

    public int getHeure_fin() {
        return heure_fin;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHeure_debut(int heure_debut) {
        this.heure_debut = heure_debut;
    }

    public void setHeure_fin(int heure_fin) {
        this.heure_fin = heure_fin;
    }
    
    public  String afficher(){
        return "Sceance{" + "id=" + id + ", date=" + date + ", "
               + "heure_debut=" + heure_debut + ", heure_fin=" + heure_fin + '}';
    }
    
}
