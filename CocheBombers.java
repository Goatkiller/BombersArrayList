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
public class CocheBombers {

    private Bomber Conductor;
    private Bomber Manguera1;
    private Bomber Manguera2;
    private Bomber Auxiliar1;
    private Bomber Auxiliar2;
    private Bomber Auxiliar3;
    private ArrayList<Bomber> ocupantes;

    public CocheBombers(ArrayList<Bomber> lista) {
        this.ocupantes = new ArrayList();
        if (lista.size() >= 1) {
            this.Conductor = lista.get(0);
            ocupantes.add(Conductor);
        }
        if (lista.size() >= 2) {
            this.Manguera1 = lista.get(1);
            ocupantes.add(Manguera1);
        }
        if (lista.size() >= 3) {
            this.Manguera2 = lista.get(2);
            ocupantes.add(Manguera2);
        }
        if (lista.size() >= 4) {
            this.Auxiliar1 = lista.get(3);
            ocupantes.add(Auxiliar1);
        }
        if (lista.size() >= 5) {
            this.Auxiliar2 = lista.get(4);
            ocupantes.add(Auxiliar2);
        }
        if (lista.size() >= 6) {
            this.Auxiliar3 = lista.get(5);
            ocupantes.add(Auxiliar3);
        }
    }
    
    public ArrayList<Bomber> getCoche(){
        return ocupantes;
    }

    public Bomber getConductor() {
        return Conductor;
    }

    public void setConductor(Bomber Conductor) {
        this.Conductor = Conductor;
    }

    public Bomber getManguera1() {
        return Manguera1;
    }

    public void setManguera1(Bomber Manguera1) {
        this.Manguera1 = Manguera1;
    }

    public Bomber getManguera2() {
        return Manguera2;
    }

    public void setManguera2(Bomber Manguera2) {
        this.Manguera2 = Manguera2;
    }

    public Bomber getAuxiliar1() {
        return Auxiliar1;
    }

    public void setAuxiliar1(Bomber Auxiliar1) {
        this.Auxiliar1 = Auxiliar1;
    }

    public Bomber getAuxiliar2() {
        return Auxiliar2;
    }

    public void setAuxiliar2(Bomber Auxiliar2) {
        this.Auxiliar2 = Auxiliar2;
    }

    public Bomber getAuxiliar3() {
        return Auxiliar3;
    }

    public void setAuxiliar3(Bomber Auxiliar3) {
        this.Auxiliar3 = Auxiliar3;
    }
    

    
}
