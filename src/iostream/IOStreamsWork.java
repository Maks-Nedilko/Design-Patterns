/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author makst
 */
public class IOStreamsWork {
    
    public static void printFile(String filename){
        
        try(InputStream io = new FileInputStream(filename)){
            
            byte[] array =new byte[io.available()];
            io.read(array);
            
            System.out.println(new String(array,"Cp1251"));
            
            
        }catch(FileNotFoundException ex){
            System.out.println("File not found...");
        }
        
        catch(IOException ex){
            System.out.println("Error read file");
            ex.printStackTrace();
        }
        
    }
    
    
//    public static void outFile(String filename){
//        
//        try (OutputStream io = new FileOutputStream(filename))
//        
//    }
    
    public static void strAdd(String fileName, String pat){
        
        try(OutputStream fos = new FileOutputStream(fileName, true);
               
                BufferedOutputStream bos = new BufferedOutputStream(fos, 10_000)){
            
            String s = pat+System.lineSeparator();
            bos.write(s.getBytes());
            bos.flush();
            
        }catch(IOException ex){
            
        ex.printStackTrace();
        
        }
        
        
    }
    
    public static void listOf(String name){
        File file = new File(name);
        
        if(!file.exists()){
            System.out.println("Katalog not found!!!");
            return;
            
        }
        
        if(!file.isDirectory()){
            System.out.println("This way not directory");
            return;
        }else{
            
            File[] array = file.listFiles();
            
            for(File f :array){
                if(f.isFile()){
                    System.out.println(f.toString() + " file");
                }
                
                if(f.isDirectory()){
                    System.out.println(f.toString() + " directory");
                }
            }
            
        }
        
    }
    
    public static void write(String sourceName, String targetName){
        
        try(InputStream fis = new FileInputStream(sourceName);
                BufferedInputStream bis = new BufferedInputStream(fis, 1_000_000);
                OutputStream fos = new FileOutputStream(targetName, true);
                BufferedOutputStream bos = new BufferedOutputStream(fos, 10_000)){
            
            byte[] array = new byte[bis.available()];
            bis.read(array);
            bos.write(array );
            
            bos.flush();
            
            System.out.println("Copy");
            
        }catch(FileNotFoundException ex){
            System.out.println("File not found...");
            ex.printStackTrace();
            
        }
        
        catch(IOException ex){
            
            System.out.println("Error read/write file..");
            ex.printStackTrace();
            
        }
        
        
        
    }
    
    public static void copyFile(String sourceName, String targetName){
        
        try(InputStream fis = new FileInputStream(sourceName);
                BufferedInputStream bis = new BufferedInputStream(fis, 1_000_000);
                OutputStream fos = new FileOutputStream(targetName);
                BufferedOutputStream bos = new BufferedOutputStream(fos, 10_000)){
            
            byte[] array = new byte[bis.available()];
            bis.read(array);
            bos.write(array);
            bos.flush();
            
            System.out.println("Copy");
            
        }catch(FileNotFoundException ex){
            System.out.println("File not found...");
            ex.printStackTrace();
            
        }
        
        catch(IOException ex){
            
            System.out.println("Error read/write file..");
            ex.printStackTrace();
            
        }
        
    }
    
    public static void main(String[] args) {
        
//        String fileName= "M:\\doc\\first.txt";
//        printFile(fileName);
////        String sourceName = "M:\\doc\\second.JPG";
////        String targetName= "M:\\doc\\go\\cop.JPG";
////        copyFile(sourceName, targetName);
    
//////    String name = "M:\\doc\\first.txt";
//////    
//////    strAdd(name, "mmmmmmmmmm");

    String name = "M:\\курсы";
    listOf(name);

    }
    
}
