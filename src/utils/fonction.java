/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alfousseni
 */
public class fonction {
    
    public static boolean testField(String nom, String prenom,String tel) {
        return !(prenom.trim().isEmpty()
                || nom.trim().isEmpty()
                || tel.trim().isEmpty());         
    }
    public static boolean testField(String nom, String prenom,String password,String login,String email) {
        return !(prenom.trim().isEmpty()
                || nom.trim().isEmpty()
                || email.trim().isEmpty()
                || login.trim().isEmpty()
                || password.trim().isEmpty());         
    }
    
    public static boolean contole(String nom ,String prenom){

        if (nom.length() < 2 || prenom.length()<2) {
            return true;
        }
        return false;
    }
    public static boolean contole(String nom ,String prenom,String email,String login){

        if (nom.length() < 2 || prenom.length()<2 || login.length()<2) {
            return true;
        }
        return false;
    }
   public static boolean controleTel(String tel){
    if (!tel.startsWith("70") && !tel.startsWith("77") &&
        !tel.startsWith("76") && !tel.startsWith("78") && 
        !tel.startsWith("72") && !tel.startsWith("33")) {
        return true;
    }

    String regex = "^\\d{9}$";
    return !tel.matches(regex);
    }
   public static boolean validerEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]{3,}@[a-zA-Z]{3,}\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
   public static boolean confirmPassword(String password, String confirmPassword) {
    if (password == null || confirmPassword == null) {
        return false;
    }
    return password.equals(confirmPassword);
}
  


}
