/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisation;

/**
 *
 * @author makst
 */
public class MainApp {
    
    public static void main(String[] args) {
        
        Person[] array = Person.readPersons("M:\\person.dat", 3);
        for(Person p : array){
            System.out.println(p);
        }
        
    }
    
}
