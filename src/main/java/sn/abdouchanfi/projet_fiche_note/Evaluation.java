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
public class Evaluation {
     private int id;
    private String type;
    private String date;
    private int duree;
    
    
    public Evaluation(int id, String type, String date, int duree) 
    {
        this.id = id;
        this.type = type;
        this.date = date;
        this.duree = duree;
    }
    
    public int getId() {
        return id;
    }

    public String gettype() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public int getDuree() {
        return duree;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public  String toString(){
       return "Evaluation{" + "id=" + id + ", type=" + type + ", "
               + "date=" + date + ", duree=" + duree + "h" + '}';
    }
    
}
