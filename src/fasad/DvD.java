/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasad;

/**
 *
 * @author makst
 */
public class DvD {
    
    private boolean isLoad;
    
    public void load(){
        
        if(!isLoad){
            System.out.println("disk in");
            isLoad=true;
        }else{
            System.out.println("disk ");
        }
        
    } 
    
    public void unload(){
        
        if(isLoad){
            System.out.println("disk izvlechom");
            isLoad=false;
        }else{
            System.out.println("disk - izvle");
        }
        
    } 
    
}
