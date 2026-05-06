/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ExamenJDBC;

import rroyo.JUtils.Utils.BBDD.BBDDConnection;

/**
 *
 * @author r.royo
 */
public interface DBConection {
    
    BBDDConnection con = new BBDDConnection("jdbc:mysql://localhost/uniroca", "root", "");
    
}
