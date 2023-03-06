/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Calendar;
import java.util.Random;


/**
 *
 * @author Alfousseni
 */
public class etudiant {
    private String matricule;
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private int an;

   

    public etudiant( String nom, String prenom, String tel) {
        this.an = Calendar.getInstance().get(Calendar.YEAR);
        this.matricule = "SUPTECH/" + Integer.toString(an).substring( 2) +"-" +prenom.substring(0, 4).toUpperCase()+String.format("%03d",new Random().nextInt(999) + 1);
        this.nom = nom.toUpperCase();
        this.prenom = capitalizeName(prenom);
        this.email = nom.toLowerCase()+prenom.toLowerCase()+String.format("%2d",new Random().nextInt(10) + 1)+"@isi.sn";
        this.tel = tel;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public static String capitalizeFirstLetter(String prenom) {
    if (prenom == null || prenom.length() == 0) {
        return prenom;
    }
    return prenom.substring(0, 1).toUpperCase() + prenom.substring(1);
}

    
    public static String capitalizeName(String prenom) {
    if (prenom == null || prenom.length() == 0) {
        return prenom;
    }
    String[] prenoms = prenom.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < prenoms.length; i++) {
        sb.append(capitalizeFirstLetter(prenoms[i]));
        if (i < prenoms.length - 1) {
            sb.append(" ");
        }
    }
    return sb.toString();
}

    
    
}
