/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisation;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
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
public class Person {
    
    private String name;
    private int age;
    private boolean matrimonial;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMatrimonial() {
        return matrimonial;
    }

    public void setMatrimonial(boolean matrimonial) {
        this.matrimonial = matrimonial;
    }

    public Person() {
    }

    public Person(String name, int age, boolean matrimonial) {
        this.name = name;
        this.age = age;
        this.matrimonial = matrimonial;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", matrimonial=" + matrimonial + '}';
    }
    
    public static Person[] readPersons(String fileName, int count){
        
        Person[] array = new Person[count];
        
        
        
        
        try( InputStream is = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(is, 10_000);
        DataInputStream dis = new DataInputStream(bis);){
            
            for(int i =0; i<count;i++){
                
                array[i] = new Person();
                
                array[i].setName(dis.readUTF());
                array[i].setAge(dis.readInt());
                array[i].setMatrimonial(dis.readBoolean());
            }
            
        }catch(FileNotFoundException ex){
            System.out.println("File not found");
            return null;
        }catch(IOException ex){
            ex.printStackTrace();
            return null;
        }
        
        return array;
    }
    
    public static void writePerson(String fileName, Person p){
    
       
        
        try( OutputStream os = new FileOutputStream(fileName, true);
        BufferedOutputStream bos = new BufferedOutputStream(os, 10_000);
        DataOutputStream dos = new DataOutputStream(bos);){
            
            dos.writeUTF(p.getName());
            dos.writeInt(p.getAge());
            dos.writeBoolean(p.isMatrimonial());
            dos.flush();
            
            System.out.println("Object write...");
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
}
    
    public static void main(String[] args) {
        
        Person p1 = new Person("vas", 25, true);
        Person p2 = new Person("nat", 21, false);
        Person p3 = new Person("maks", 30, true);
        
        writePerson("M:\\person.dat", p1);
        writePerson("M:\\person.dat", p2);
        writePerson("M:\\person.dat", p3);
    }
    
}
