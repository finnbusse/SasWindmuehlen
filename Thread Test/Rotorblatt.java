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
    private Rectangle kern;
    double x,y;
    public Rotorblatt(double pX,double pY){
        kern = new Rectangle(pX,pY,100,15,new Color(190,190,190));
        blatt = new Ellipse(pX,pY,100,15,new Color(190,190,190));
        x=pX;
        y=pY;
    }
    
    public void drehen(double pA)
    {
        blatt.turn(x,y+7.5,pA);
        kern.turn(x,y+7.5,pA);
    }

} 
