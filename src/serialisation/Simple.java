/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisation;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/**
 *
 * @author makst
 */
public class Simple implements Serializable{
    
   public static void writeSimple(String fileName, Simple s){
       
      
       
       try( OutputStream os = new FileOutputStream(fileName, true);
        BufferedOutputStream bos = new BufferedOutputStream(os, 10_000);
        ObjectOutputStream dos = new ObjectOutputStream(bos);){
           
          
            
            dos.writeObject(s);
            dos.flush();
            
            System.out.println("Object write...");
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
       
   }
    
    private int a;
    private double d;
    private boolean b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public Simple() {
    }

    public Simple(int a, double d, boolean b) {
        this.a = a;
        this.d = d;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Simple{" + "a=" + a + ", d=" + d + ", b=" + b + '}';
    }
    
    public static void main(String[] args) {
        
        Simple simple = new Simple(2, 8.8, false);
        Simple simple2 = new Simple(3, 3.14, true);
        writeSimple("M:\\simple.dat", simple);
        writeSimple("M:\\simple.dat", simple2);
        
    }
    
    
}
