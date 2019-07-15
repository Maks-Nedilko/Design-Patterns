/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_ex_delegat;

/**
 *
 * @author makst
 */
public class Isopol implements MusicInstr{
    private MusicInstr mi;

    public void setMi(MusicInstr mi) {
        this.mi = mi;
    }

    @Override
    public void play() {
          mi.play();
    }
    
    
}
