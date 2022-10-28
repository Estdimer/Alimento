/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

/**
 *
 * @author corre
 */
public abstract class Persona {
    protected String usuario;
    protected String nombre;
    protected String correo;
    protected String contraseña;
    protected double altura;
    protected double peso;

    public Persona(String usuario, String nombre, String correo, String contraseña, double altura, double peso) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.altura = altura;
        this.peso = peso;
    }

    public abstract String getEstado();
    public abstract double getImc();

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
