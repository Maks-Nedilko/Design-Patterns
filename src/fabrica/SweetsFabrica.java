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
public class SweetsFabrica extends Fabrica{
    
    @Override
    Sweets produce(){
        return new Sweets();
    }
}
