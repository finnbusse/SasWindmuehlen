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
    double x,y;
    public Rotorblatt(double pX,double pY){
        blatt = new Ellipse(pX,pY,100,30,new Color(190,190,190));
        x=pXX
    }
    
    public void drehen(double pA,double pB,double pC)
    {
        blatt.turn(pA,pB,pC);
    }

} 
