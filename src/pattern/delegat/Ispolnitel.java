/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.delegat;

/**
 *
 * @author makst
 */
public class Ispolnitel {
    
    private MusicInstr mi;

    public void setMi(MusicInstr mi) {
        this.mi = mi;
    }
    
    public void play(){
        mi.play();
    }
    
}
