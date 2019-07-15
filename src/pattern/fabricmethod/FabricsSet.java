/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.fabricmethod;

/**
 *
 * @author makst
 */
public class FabricsSet {
    
    public static DeviceFabrica getFabrica(String s){
        
        switch(s){
            case "USB" : return new USBDeviceFabrica();
            case "COM" : return new COMDeviceFabrica();
        }
        throw new IllegalArgumentException("This conection type is not realization");
    }
    
}
