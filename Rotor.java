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

    public Rotor(double pX, double pY) {
        view = new View(1000,800);
        Rotor();
        for(int i = 0; i < 1000;i++) {
            drehen(0.5);
        }
        view.wait(2);
    }
    // end attributes
  
  // start methods
  public void Rotor(){
      rotorblatt1 = new Rotorblatt(pX,pY);
      rotorblatt2 = new Rotorblatt(pX+200,pY);
      rotorblatt3 = new Rotorblatt(pX+400,pY);
    }
    
    public void drehen(double pA) {
        rotorblatt1.drehen(pA);
        rotorblatt2.drehen(pA);
        rotorblatt3.drehen(pA);
    }

  // end methods
} // end of Rotor
