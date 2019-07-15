
package clone;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Simple implements Cloneable{
    
    @Override
    public Simple clone(){
        Simple clone = null;
        try {
            clone = (Simple)super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Simple.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        clone.sb = new StringBuilder(sb);
        return clone;
    }

    @Override
    public String toString() {
        return "Simple{" + "i=" + i + ", l=" + l + ", bool=" + bool + ", sb=" + sb + '}';
    }
    
    
    
    int i =3;
    long l =50000;
    boolean bool = true;
    StringBuilder sb = new StringBuilder("JAVA");
    
    
    public Simple getCopy(){
        
        Simple copy = new Simple();
        copy.i=i;
        copy.l=l;
        copy.bool=bool;
        copy.sb = new StringBuilder(sb);
        
        return copy;
    }
    
    public static void main(String[] args) {
        
        Simple simple = new Simple();
//        simple.bool=false;
//        simple.sb= new StringBuilder("ITEA");
//        
//        Simple copy = simple.getCopy();
//        System.out.println(copy);
//        
//        simple.sb=new StringBuilder("King");
//        simple.i=2019;
//        simple.l=2019;
        
Simple clone = simple.clone();

simple.i=9;
simple.l=0;
simple.sb=simple.sb.append("!!!");
        System.out.println(clone);
        
        
        
        
    }
    
}
