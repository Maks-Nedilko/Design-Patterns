/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.adapter;

/**
 *
 * @author makst
 */
public class Graphics extends OldGraphics implements NewGraphicInterface{

    @Override
    public void drawCircle() {
    
        oldCircle();
        
    }

    @Override
    public void drawSquare() {
    
        oldSquare();
    
    }
    
}
