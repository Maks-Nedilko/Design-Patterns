/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author makst
 */
public class Proba {

    int i = 3;
    boolean bool = true;
    double d = 3.14;

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proba other = (Proba) obj;
        if (this.i != other.i) {
            return false;
        }
        if (this.bool != other.bool) {
            return false;
        }
        if (Double.doubleToLongBits(this.d) != Double.doubleToLongBits(other.d)) {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        Set set = new HashSet();
        Proba proba1 = new Proba();
        Proba proba2 = new Proba();
        Proba proba3 = new Proba();
        
        set.add(proba1);
        set.add(proba2);
        set.add(proba3);
        set.add(new Proba());
        set.add(new Proba());
        
        for(int i =0;i<=100000;i++){
            set.add(new Proba());
        }
        
        System.out.println(set.size());
    }
    

}
