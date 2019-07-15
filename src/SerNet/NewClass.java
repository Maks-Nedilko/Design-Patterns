
package SerNet;

import java.io.File;

public class NewClass {
    
    public static void f(String filename){
        
        File file = new File(filename);
        
        if(!file.exists()){
            System.out.println("File not found");
            return;
        }
        System.out.println("File name : " + file.getName());
        System.out.println("File parent : " + file.getParent());
        System.out.println("File read : " + file.canRead());
        System.out.println("File write : " + file.canWrite());
        System.out.println("File lenght :  " + file.length());
        System.out.println("Is directory : " + file.isDirectory());
    }
    
    public static void main(String[] args) {
        
        //f("M:\\doc\\first.txt");
        dirWork("M:\\doc\\ma");
    }
    
    public static void dirWork(String dirName){
        
        File file = new File(dirName);
        
        if(file.exists()){
            System.out.println("Object present...");
            
            
        }
         File file2 = new File( file.toString() + "new"); 
        if(file.mkdir()){
            System.out.println("Ctalog create ! ");
            
           
            
            
            if(file.renameTo(file2)){
                System.out.println("Catalog rename !");
            }else{
                System.out.println("no rename");
            }
        }else{
            System.out.println("no create catalog! ");
            return;
        }
        
        
        if(file2.delete()){
                System.out.println("Catalog delete !");
            }else{
                System.out.println("no delete");
            }
    }
    
}
