/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ra8_pr1_controlpanel;

import org.mindrot.jbcrypt.BCrypt;

/** 
 *
 * @author Laura Domínguez
 */
public class PasswordUtil {
    
    // Mètode per encriptar la contrasenya
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    // Mètode per verificar la contrasenya
    public static boolean checkPassword(String password, String hashed) {
        return BCrypt.checkpw(password, hashed);
    }
    
}
