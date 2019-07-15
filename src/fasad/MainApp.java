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
public class MainApp {
    
    public static void main(String[] args) {
        
        Power power = new Power();
        DvD dvd = new DvD();
        HDD hdd = new HDD();
        
        power.on();
        
        hdd.copy(dvd);
        
        dvd.unload();
        
        power.off();
        
    }
    
}
