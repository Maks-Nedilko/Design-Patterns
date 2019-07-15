/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

/**
 *
 * @author makst
 */
public class CandysFabrica extends SweetsFabrica{
    
    @Override
    Candys produce(){
        return new Candys();
    }
    
}
