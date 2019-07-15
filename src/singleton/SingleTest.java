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
public class SingleTest {
    public static void main(String[] args) {
        
        Singleton.getSingle();
        Singleton.getSingle();
        Singleton.getSingle();
        Singleton.getSingle();
    }
    
}
