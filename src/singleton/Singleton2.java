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
public class Singleton2 {
    
    private Singleton2(){
        System.out.println("In constr!!!");
    }
    
    private static Singleton2 singleton;
    
    public static Singleton2 getInst(){
        if(singleton==null){
            singleton = new Singleton2();
            return singleton;
        }else{
            return singleton;
        }
    } 
    
}
