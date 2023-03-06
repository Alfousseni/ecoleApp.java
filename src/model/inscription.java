/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Calendar;

/**
 *
 * @author Alfousseni
 */
public class inscription {
    private String code;
    private String annee;
    private int id_etudiant;
    private int id_classe;
    private int id_admin;
    private int an;

    public inscription(String annee, int id_etudiant, int id_classe, int id_admin) {
       
        this.an = Calendar.getInstance().get(Calendar.YEAR);
        this.id_etudiant = id_etudiant;
        this.code = "INS" + Integer.toString(an).substring(2) + String.format("%03d", id_etudiant);
        this.annee = annee;
        this.id_classe = id_classe;
        this.id_admin = id_admin;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public int getId_etudiant() {
        return id_etudiant;
    }

    public void setId_etudiant(int id_etudiant) {
        this.id_etudiant = id_etudiant;
    }

    public int getId_classe() {
        return id_classe;
    }

    public void setId_classe(int id_classe) {
        this.id_classe = id_classe;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    
    
}
