/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerNet;

import java.io.File;

/**
 *
 * @author makst
 */
public class DirWork {
    
    public static void dirWork(String dirName){
        
        File file1 = new File(dirName);
        
        if(file1.exists()){
            System.out.println("Object present!");
           
        }
        
        File file2 = new File(file1.toString() + "maks");
        if(file1.mkdir()){
            System.out.println("Catalog create!");
        }else{
            System.out.println("Catalog no create!!");
        }
        
        if(file1.renameTo(file2)){
            System.out.println("Catalog rename!!!");
        }else{
            System.out.println("Catalog no rename!!");
        }
        
        if(file2.delete()){
            System.out.println("File delete!!!");
        }else{
            System.out.println("File no delete!!");
        }
        
        
    }
    
    public static void main(String[] args) {
        
        dirWork("M:\\doc\\mak");
        
    }
    
}
