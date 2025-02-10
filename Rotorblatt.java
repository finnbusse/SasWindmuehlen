import sas.*;
import java.awt.Color;

/**
 *
 * Description
 *
 * @version 1.0 from 02.02.2025
 * @author 
 */

public class Rotorblatt {
  
    private Ellipse blatt;
  
    public Rotorblatt(double pX,double pY){
        blatt = new Ellipse(pX,pY,100,30,Color.BLUE);
    }
  // start methods
    public void drehen()
    {
        blatt.turn(double);
    }
  
  
  // end methods
} // end of Rotorblatt
