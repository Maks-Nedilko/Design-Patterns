/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author makst
 */
public class TestApp2 {
    public static void main(String[] args) {
        Singleton2 sing = Singleton2.getInst();
        Singleton2.getInst();
        Singleton2.getInst();
        Singleton2.getInst();
        
        
    }
    
}
