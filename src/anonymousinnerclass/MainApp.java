/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousinnerclass;

/**
 *
 * @author makst
 */
public class MainApp {
    
    public static void main(String[] args) {
        
        Geometria geometria = new Geometria();
        geometria.calculate(new Figura(){
            @Override
            void per() {
                System.out.println("anonymous per");
            }

            @Override
            void area() {
                System.out.println("anonymous area");
            }
        });
        
    }
        
    }
    


