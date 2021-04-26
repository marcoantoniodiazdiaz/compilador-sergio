/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatas;

/**
 *
 * @author mark7
 */
public class ELEMENTOPILA {
    private STRUCTURES structure;
    private int pos;
    
    public ELEMENTOPILA(STRUCTURES str, int pos) {
        this.structure = str;
        this.pos = pos;
    }

    public void setStructure(STRUCTURES structure) {
        this.structure = structure;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public STRUCTURES getStructure() {
        return structure;
    }

    public int getPos() {
        return pos;
    }
}
