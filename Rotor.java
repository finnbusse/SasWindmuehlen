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
    public double pX, pY;
    View view;

    public Rotor() {
        pX = 100;
        pY = 100;
        view = new View(1000,800);
        Rotor(pX, pY);
        for(int i = 0; i < 10000;i++) {
            drehen(-50, 0, 1);
            view.wait(5);
        }
    }
    // end attributes

    // start methods
    public void Rotor(double pX, double pY){
        rotorblatt1 = new Rotorblatt(pX,pY);
        rotorblatt2 = new Rotorblatt(pX+200,pY);
        rotorblatt3 = new Rotorblatt(pX+400,pY);
    }

    public void drehen(double pA, double pB, double pC) {
        rotorblatt1.drehen(pA, pB, pC);
    }

    public void setX(double v) {
    }

    public void setY(double v) {
    }

    // end methods
} // end of Rotor
