/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisation;

import java.io.Serializable;

/**
 *
 * @author makst
 */
public class Difficult implements Serializable{
    
    private Simple simple1;
    private Simple simple2;
    private String s;

    public Difficult() {
    }

    public Difficult(Simple simple1, Simple simple2, String s) {
        this.simple1 = simple1;
        this.simple2 = simple2;
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Simple getSimple1() {
        return simple1;
    }

    public void setSimple1(Simple simple1) {
        this.simple1 = simple1;
    }

    public Simple getSimple2() {
        return simple2;
    }

    public void setSimple2(Simple simple2) {
        this.simple2 = simple2;
    }

    @Override
    public String toString() {
        return "Difficult{" + "simple1=" + simple1 + ", simple2=" + simple2 + ", s=" + s + '}';
    }
    
    
}
