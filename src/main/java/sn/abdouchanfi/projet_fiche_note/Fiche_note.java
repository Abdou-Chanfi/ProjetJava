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
public class Fiche_note {
    
    private int id;
    private int num_fiche;
    private String date;
    
    public Fiche_note(int id, int num_fiche, String date) 
    {
        this.id = id;
        this.num_fiche = num_fiche;
        this.date = date;
        }
    
    public int getid() {
        return id;
    }

    public int getNum_fiche() {
        return num_fiche;
    }

    public String getdate() {
        return date;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNum_fiche(int num_fiche) {
        this.num_fiche = num_fiche;
    }

    public void setdate(String date) {
        this.date = date;
    }

    @Override
    public  String toString(){
       return "Fiche_note{" + "id=" + id + ", num_fiche=" + num_fiche + ", "
               + "date=" + date + '}';
    }
    
}
