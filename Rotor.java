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

    public Rotor(double v, double v1) {
    }
    // end attributes
  
  // start methods
  public void Rotor(){
      rotorblatt1 = new Rotorblatt(pX,pY);
      rotorblatt2 = new Rotorblatt(pX,pY);
      rotorblatt3 = new Rotorblatt(pX,pY);
    }
    
    public void drehen(double pA) {
        rotorblatt1.
        rotorblatt2.
        rotorblatt3.
    }

  // end methods
} // end of Rotor
