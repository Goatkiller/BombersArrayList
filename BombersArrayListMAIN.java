/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bombersarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jelly
 */
public class BombersArrayListMAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        ArrayList<Bomber> bomberos = new ArrayList();
        ArrayList<Integer> ocupantes = new ArrayList();
        CocheBombers coche;
        
        System.out.println("Inserte el nombre, edad, puesto y saldo de los bomberos separados por espacios: ");
        for(int i = 0; i < 6; i++){
            System.out.println("Bombero"+ (i+1));
            String nombre =leer.next();
            int edad = leer.nextInt();
            String puesto = leer.next();
            int saldo = leer.nextInt();
            bomberos.add(new Bomber(nombre, puesto, edad, saldo));
        }
        OperacionBomber operacion = new OperacionBomber();
        operacion.ponerBombers(bomberos);
        
        
        System.out.println("Que acción desea realizar: ");
        System.out.println("    1) Sumar bomberos.");
        System.out.println("    2) Montar un coche de bomberos.");
        int n = leer.nextInt();
        int m;
        switch(n){
            case 1:
                System.out.println("Indique los bomberos que quiere sumar mediante su número separados por espacios: ");
                n = leer.nextInt();
                m = leer.nextInt();
                System.out.println(OperacionBomber.sumar(n, m).toString());
                break;
            case 2:
                System.out.println("¿Cuántos bomberos desea meter?");
                n = leer.nextInt();
                System.out.println("Indique los bomberos a meter mediante su número separados por espacios: ");

                for(int i = 0; i < n; i++){
                    ocupantes.add(leer.nextInt()-1);
                }
                
                    coche = operacion.crearCoche(ocupantes);
                    System.out.println("Coche creado: ");
                    for(int i = 0; i < coche.getCoche().size(); i++){
                        System.out.println(coche.getCoche().get(i).toString());
                    }
               break;     
                
                
        }
        
    }
    
}
