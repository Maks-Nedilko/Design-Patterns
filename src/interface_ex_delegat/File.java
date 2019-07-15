/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_ex_delegat;

/**
 *
 * @author makst
 */
public class File implements Closeable{

    @Override
    public void close() {
        System.out.println("File closed");
    }
    
}
