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
    private double x, y;
    private Wind wind;

    public Rotor(double pX, double pY, Wind pWind) {
        rotorBlaetter(pX, pY);
        wind = pWind;
    }
    // end attributes

    // start methods
    public void rotorBlaetter(double pX, double pY){
        rotorblatt1 = new Rotorblatt(pX,pY);
        rotorblatt2 = new Rotorblatt(pX,pY);
        rotorblatt3 = new Rotorblatt(pX,pY);
        rotorblatt1.drehen(0);
        rotorblatt2.drehen(120);
        rotorblatt3.drehen(240);
        x = pX;
        y = pY;
    }

    public void drehen(double pA) {
        rotorblatt1.drehen(wind.getWindstaerke());
        rotorblatt2.drehen(wind.getWindstaerke());
        rotorblatt3.drehen(wind.getWindstaerke());
    }

    public void setX(double pX) {
    }

    public void setY(double pY) {
    }

    // end methods
} // end of Rotor
