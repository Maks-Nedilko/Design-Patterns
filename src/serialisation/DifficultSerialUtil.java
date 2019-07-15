/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisation;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author makst
 */
public class DifficultSerialUtil {
    
    public static void serialDiff(String fileName, Difficult diff){
        try( OutputStream os = new FileOutputStream(fileName, true);
        BufferedOutputStream bos = new BufferedOutputStream(os, 10_000);
        ObjectOutputStream dos = new ObjectOutputStream(bos);){
            
            dos.writeObject(diff);
            dos.flush();
            
            System.out.println("Object write...");
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Simple simple1 = new Simple(1, 1.2, true);
        Simple simple2 = new Simple(2, 2.2, false);
        Simple simple3 = new Simple(3, 3.2, true);
        Simple simple4 = new Simple(4, 4.2, false);
        
        Difficult difficult = new Difficult(simple1, simple2, "JAVA");
        Difficult difficult2 = new Difficult(simple3, simple4, "VAJA");
        
       
        
        
        serialDiff("M:\\difficult.dat", difficult);
        serialDiff("M:\\difficult.dat", difficult2);
        
    }
}
