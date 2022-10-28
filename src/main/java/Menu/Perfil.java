/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.util.ArrayList;


public class Perfil {
    
    protected String usuario;
    protected String nombre;
    protected String correo;
    protected String contraseña;
    protected double altura;
    protected double peso;
    private double IMC;
    private String estado;
    private ArrayList<Alimentos> ra = new ArrayList<>();
    private ArrayList<Ejercicios> re = new ArrayList<>();

    public Perfil(double IMC, String estado , String usuario, String nombre, String correo, String contraseña,double altura, double peso) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.altura = altura;
        this.peso = peso;
        this.IMC = IMC;
        this.estado = estado;
    }

    public Perfil(double IMC, String estado , String usuario, String nombre, String correo, String contraseña,double altura, double peso, ArrayList<Alimentos> ra, ArrayList<Ejercicios> re) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.altura = altura;
        this.peso = peso;
        this.IMC = IMC;
        this.estado = estado;
        this.ra = ra;
        this.re = re;
    }

    public ArrayList<Alimentos> getRa() {
        return ra;
    }

    public void setRa(ArrayList<Alimentos> ra) {
        this.ra = ra;
    }

    public ArrayList<Ejercicios> getRe() {
        return re;
    }

    public void setRe(ArrayList<Ejercicios> re) {
        this.re = re;
    }

    

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

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
