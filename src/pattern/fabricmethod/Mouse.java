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
public abstract class Mouse {
    
    abstract void scroll();
    abstract void click();
    abstract void dbclick();
    
}

class MousUSB extends Mouse{

    @Override
    void scroll() {
        System.out.println("Usb is scrolling");
    }

    @Override
    void click() {
        System.out.println("Usb is clicking");
    }

    @Override
    void dbclick() {
        System.out.println("Usb is dbclicking");   
    }
    
}

class MouseCom extends Mouse{
        @Override
    void scroll() {
        System.out.println("Com is scrolling");
    }

    @Override
    void click() {
        System.out.println("COM is clicking");
    }

    @Override
    void dbclick() {
        System.out.println("COM is dbclicking");   
    }
}