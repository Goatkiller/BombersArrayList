/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bombersarraylist;

/**
 *
 * @author Jelly
 */
public class Bomber {
    
    private String nombre;
    private String puesto;
    private int edad;
    private int sueldo;
    
    public Bomber(){
    }
    
    public Bomber(String nombre, String puesto,int edad, int sueldo){
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        
        return "Nombre: "+nombre +", puesto: "+puesto+", edad: "+edad+", sueldo: "+sueldo+".";
    }
    
}
