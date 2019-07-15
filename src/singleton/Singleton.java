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
public class Singleton {
    
    private Singleton(){
        System.out.println("konstr");
    }
    
    private static Singleton single = new Singleton();
    
    public static Singleton getSingle(){
        return single;
    }
}
