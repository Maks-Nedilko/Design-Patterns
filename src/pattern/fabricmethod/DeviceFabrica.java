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
public abstract class DeviceFabrica {
    
   abstract Mouse makeMouse();
   abstract Keyboard makeKeyboard();
    
    
}

class USBDeviceFabrica extends DeviceFabrica{

    @Override
    Mouse makeMouse() {
        return new MousUSB();
    }

    @Override
    Keyboard makeKeyboard() {
        return new KeyboardUSB();
    }
    
}

class COMDeviceFabrica extends DeviceFabrica{

    @Override
    Mouse makeMouse() {
     return new MouseCom();  
    }

    @Override
    Keyboard makeKeyboard() {
     return new KeyboardCOM(); 
    }
    
}
