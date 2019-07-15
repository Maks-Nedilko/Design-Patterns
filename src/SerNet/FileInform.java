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
public class FileInform {
    
    public static void inform(String fileName){
        
        File file = new File(fileName);
        if(!file.exists()){
            System.out.println("File not found");
            return;
        }
        
        System.out.println("File name : " + file.getName());
        System.out.println("File parent : " + file.getParent());
        System.out.println("File path : " + file.getPath());
        System.out.println("File lenght : " + file.length());
        System.out.println("Can write file? : " + file.canWrite());
        System.out.println("Can read file? : " + file.canRead());
        System.out.println("Is directory ? : " + file.isDirectory());
        
    }
    
    public static void main(String[] args) {
        
        inform("M:\\doc\\first.txt");
        
    }
    
}
