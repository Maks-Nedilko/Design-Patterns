/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorexamples;

/**
 *
 * @author makst
 */
public class MainApp {
    
   static void ras(Days d){
        
        switch(d){
            
            case MONDAY:
                System.out.println("Learn JAVA");
                break;
            case TUESDAY:
                System.out.println("Learn JaVa");
                break;
            case WEDNESDAY:
                System.out.println("Go ");
                break;
            case FRIDAY:
                System.out.println("_-_-_-_");
                break;
                
        }
        
    }
    
    public static void main(String[] args) {
        
        
        Days day;
        day = Days.FRIDAY;
        ras(day);
    }
    
}
