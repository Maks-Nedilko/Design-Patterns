/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousinnerclass;

public interface Readable {
    
    void read();
    
}

class Modif {
    
    void watch(Readable r){
        
        r.read();
    }
    
}

class App {
    
    public static void main(String[] args) {
        
        Modif modif = new Modif();
        
        modif.watch(new Readable(){
            @Override
            public void read() {
                System.out.println("readable");
            }
            
        });
        
    }
    
}
