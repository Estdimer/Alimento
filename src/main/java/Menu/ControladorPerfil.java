/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.util.ArrayList;

/**
 *
 * @author corre
 */
public class ControladorPerfil {
    public static ArrayList<Perfil> perfiles =new ArrayList<>();
    
    public static boolean validacion(String usuario, String contraseña){
        for(Perfil p:perfiles)
            if(usuario.equals(p.getUsuario()) && contraseña.equals(p.getContraseña()))
                return true;
        return false;
    }
}
