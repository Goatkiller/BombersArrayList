/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bombersarraylist;

import java.util.ArrayList;

/**
 *
 * @author Jelly
 */
public class OperacionBomber {
    
    private static ArrayList<Bomber> listaBombers;
    
    public OperacionBomber(){
        this.listaBombers = new ArrayList();
    }
    
    public static Bomber sumar(int x, int y){
        
        Bomber a = listaBombers.get(x);
        Bomber b = listaBombers.get(y);
        
        Bomber c = new Bomber(a.getNombre()+" "+b.getNombre(), a.getPuesto()+" "+b.getPuesto(), 
                              a.getEdad()+b.getEdad(), a.getSueldo()+b.getSueldo());
        return c;
    }
    
    public void ponerBombers(ArrayList<Bomber> lista){
        for(int i = 0; i < lista.size(); i ++){
            listaBombers.add(lista.get(i));
        }
    }
    
    public  CocheBombers crearCoche(ArrayList<Integer> lista){
        
        ArrayList<Bomber> ocupantes = new ArrayList();
        
        
        for(int i = 0; i < lista.size(); i++){
            ocupantes.add(listaBombers.get(lista.get(i)));
        }
        CocheBombers coche = new CocheBombers(ocupantes);
        
        return coche;
        
        
    }
}
