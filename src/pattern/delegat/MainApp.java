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
public class MainApp {
    
    public static void main(String[] args) {
        Horn horn = new Horn();
        Flute flute = new Flute();
        Guitar guitar = new Guitar();
        Ispolnitel isp= new Ispolnitel();
        
        isp.setMi(horn);
        isp.play();
        isp.setMi(guitar);
        isp.play();
        isp.setMi(flute);
        isp.play();
    }
    
}
