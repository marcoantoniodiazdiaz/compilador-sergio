/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mark7
 */
public class PILA {

    public static List<ELEMENTOPILA> pila = new ArrayList();

    public static void push(STRUCTURES e, int pos) {
        pila.add(new ELEMENTOPILA(e, pos));
    }

    public static void pop(int pos) {
        ELEMENTOPILA upElement = pila.get(pila.size() - 1);
            pila.remove(upElement);
    }
    
    static void verificarPila(){
        for (ELEMENTOPILA e : pila) {
            ERRORES.lista.add(new ERRORES(7, 0, e.getPos(), ""));
        }
    }

}
