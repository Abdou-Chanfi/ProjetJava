/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.abdouchanfi.projet_fiche_note;

/**
 *
 * @author EL REY LUCCHEZE
 */
public class Test_Personne {
       public static void main(String[]args){
       Personne p = new Personne();
       p.setId(1);
       p.setMatricule("NB024541");
       p.setPrenom("Nabi");
       p.setNom("Ibrahima");
       p.setDateNaissance("22/05/1998");
       p.setLieuNaissance("Dakar");
       p.setAdresse("Medina");
       p.setTelephone("77 441 63 91");
       p.setEmail("nabi@gmail.com");
       p.setNationalite("Guinéen");
       p.setGenre("Male");
       p.setSituationMatrimonial("Marié");
       
       Etudiants etudiant = new Etudiants(1,"NB56985","Nouman","Ali",
               "11/05/1998","Comores","Gueule Tapée","77 456 85 66",
               "mballou@gmail.com","Comorienne","Male","Celibataire","B+");
       
       Professeur professeur = new Professeur(1,"NB66582","Bobo","Diouf",
               "22/04/1977","Conakry","Liberte 1","77-908-06-05",
               "bobo@gmail.com","Guinenne","Male","Marié","Developpeur");
       
       ResponsableFiliere rf = new ResponsableFiliere(1,"NB3456","Diatta","Balde",
               "12/03/1967","Dakar","Liberte 6","77-908-06-05",
               "bau@gmail.com","Senegalais","Male","Marié",
               "Coordonnés les activites pedagogiques");
       
       Secretaire secretaire;
           secretaire = new Secretaire(1,"123456","Mouna","Sidiki",
                   "12/03/1980","Dakar","Dieupeul","77 452 50 33",
                   "bau@gmail.com","Senegalaise","Femelle","Marié","Gestion");
       
       System.out.println(p);
       System.out.println("******************************************");
       System.out.println(etudiant);
       System.out.println("******************************************");
       System.out.println(professeur);
       System.out.println("******************************************");
       System.out.println(etudiant.getPrenom());
       System.out.println("******************************************");
       System.out.println(rf);
       
       
    }
}
