/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.fabricmethod;

/**
 *
 * @author makst
 */
public class MainApp {
    
    public static void main(String[] args) {
        
        
        
        DeviceFabrica fabrica = FabricsSet.getFabrica("USB");
        
       Mouse mouse = fabrica.makeMouse();
       
       Keyboard keyboard = fabrica.makeKeyboard();
       
       mouse.click();
       mouse.dbclick();
       mouse.scroll();
       
       keyboard.print("Hello Fabrica Pattern");
    }
    
}
