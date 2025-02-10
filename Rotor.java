import sas.*;
import java.awt.Color;
/**
 *
 * Description
 *
 * @version 1.0 from 02.02.2025
 * @author 
 */

public class Rotor {

    // start attributes
    private Rotorblatt rotorblatt1,rotorblatt2,rotorblatt3;
    public double x, y;

    public Rotor(double pX, double pY) {
        rotorBlaetter(pX, pY);
    }
    // end attributes

    // start methods
    public void rotorBlaetter(double pX, double pY){
        rotorblatt1 = new Rotorblatt(pX,pY);
        rotorblatt2 = new Rotorblatt(pX,pY);
        rotorblatt3 = new Rotorblatt(pX,pY);
        rotorblatt1.drehen(pX, pY, 0);
        rotorblatt2.drehen(pX, pY, 120);
        rotorblatt3.drehen(pX, pY, 240);
        x = pX;
        y = pY;
    }

    public void drehen(double pA, double pB, double pC) {
        rotorblatt1.drehen(pA, pB, pC);
    }

    public void setX(double pX) {
        
    }

    public void setY(double pY) {
    }

    // end methods
} // end of Rotor
