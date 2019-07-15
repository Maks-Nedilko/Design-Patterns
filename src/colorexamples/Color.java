/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorexamples;

/**
 *
 * @author makst
 */
public enum Color {
    
    RED,
    GREEN(75),
    BLUE(82);
   int i;
   
    Color(int i){
       this.i=i;
   }
    Color(){
        
    }
    
    int getI(){
       return i; 
    }
    
}
