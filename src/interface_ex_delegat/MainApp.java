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
public class MainApp {
    
    public static void main(String[] args) {
        Flute flute = new Flute();
        Horn horn = new Horn();
        Isopol isp = new Isopol();
        
        isp.setMi(horn);
        isp.play();
        isp.setMi(flute);
        isp.play();
    }
    
}
