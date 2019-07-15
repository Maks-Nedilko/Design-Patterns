/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasad;

/**
 *
 * @author makst
 */
public class Fasad {
    
    private HDD hdd = new HDD();
    private Power power = new Power();
    private DvD dvd = new DvD();
    
    public void copy(){
        
        power.on();
        hdd.copy(dvd);
        dvd.unload();
        power.off();
        
        
        
    }
    
}
