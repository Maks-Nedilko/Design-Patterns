/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisation;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author makst
 */
public class SimpleApp {
    
    public static void main(String[] args) {
        
        String fileName = "M:\\simple.dat";
        try( InputStream is = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(is, 10_000);
        ObjectInputStream dis = new ObjectInputStream(bis);){
            
            
            try {
                Simple simple = (Simple)dis.readObject();
                System.out.println(simple);
                //Simple simple2 = (Simple)dis.readObject();
                //System.out.println(simple2);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SimpleApp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
    }
    
}
