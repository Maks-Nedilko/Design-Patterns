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
public class Flute implements MusicInstr{

    @Override
    public void play() {
        System.out.println("Flute play");  
    }
    
}
