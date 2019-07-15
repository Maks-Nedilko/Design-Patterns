/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_ex_delegat;

/**
 *
 * @author makst
 */
public class CloseWork {
    
    public static void main(String[] args) {
        
        Closeable[] array = new Closeable[4];
        
        array[0]=new File();
        array[1]=new Door();
        array[2]=new File();
        array[3]=new Door();
        
        for(Closeable cl:array){
            cl.close();
        }
        
    }
    
}
