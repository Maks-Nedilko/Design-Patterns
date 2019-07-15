/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.delegat;

/**
 *
 * @author makst
 */
public class Employee {
    
    public void work(){
        //hard work
    }
}

class Boss{
    Employee emp1;
    
    public void work(){
        emp1.work();
    }
}
