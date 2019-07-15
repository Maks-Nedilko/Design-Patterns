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
public abstract class Keyboard {
    
    abstract void print(String s);
    
}

class KeyboardUSB extends Keyboard{

    @Override
    void print(String s) {
        System.out.println("USB keyboard print" + s);
    }
    
}

class KeyboardCOM extends Keyboard{

    @Override
    void print(String s) {
        System.out.println("Com keyboard print" + s);
    }
    
}