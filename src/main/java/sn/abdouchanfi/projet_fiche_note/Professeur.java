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
public class Professeur {
    private String prenom;
    private String nom;
    private String adresse;
    private int age;
    private String telephone;
    private String email;
    private String specialite;
    
    public Professeur(String prenom, String nom, String adresse, int age, String telephone, String email, String specialite) 
    {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
        this.specialite = specialite;
    }

    Professeur(int i, String nB66582, String bobo, String diouf, String string, String conakry, String liberte_1, String string0, String bobogmailcom, String guinenne, String male, String marié, String developpeur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getAge() {
        return age;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }
    
    public String getSpcialite() {
        return specialite;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public  String toString(){
       return "Personne{" + "prenom=" + prenom + ", nom=" + nom + ", "
               + "adresse=" + adresse + ", age=" + age + ", telephone=" + telephone + 
               ", email=" + email + ", specialite=" + specialite + '}';
    }
    
}
