/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.util.Date;

/**
 *
 * @author corre
 */
public class Ejercicios {
    private String nombre;
    private double repeticiones;
    private String fecha;

    public Ejercicios(String nombre, double repeticiones, String fecha) {
        this.nombre = nombre;
        this.repeticiones = repeticiones;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(double calorias) {
        this.repeticiones = repeticiones;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
