/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousinnerclass;

/**
 *
 * @author makst
 */
public class Simple {
    
    int m(){
        return 1;
    }
    
    
}

class SimpleDificult{
    
    long l = 100000000;
    
    Simple simple = new Simple(){
      
        void hello(){
            System.out.println("Hello");
        }
        boolean b=true;
        
        @Override
        int m(){
            return 500;
        }
        
    };
    
    public static void main(String[] args) {
        
        SimpleDificult dif = new SimpleDificult();
        System.out.println(dif.simple.m());
        
    }
    
}
