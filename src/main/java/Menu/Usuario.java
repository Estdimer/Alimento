/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

/**
 *
 * @author corre
 */
public class Usuario extends Persona implements IMC{

    public Usuario(String usuario, String nombre, String correo, String contraseña, double altura, double peso) {
        super(usuario, nombre, correo, contraseña, altura, peso);
    }

    public String getEstado() {
        if(peso/(altura*altura) < BP)
            return "Bajo peso";
        if(peso/(altura*altura) < S)
            return "Saludable";
        if(peso/(altura*altura) < SP)
            return "Sobre peso";
        if(peso/(altura*altura) < O1)
            return "Obesidad clase 1";
        if(peso/(altura*altura) < O2)
            return "Obesidad clase 2";
        return "Obesidad clase 3";
    }


    public double getImc() {
        return peso/(altura*altura);
    }  
    

    
}
