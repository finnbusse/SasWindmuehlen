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
  // end attributes
  
  // start methods
  
  
  
  public void drehen(){
      rotorblatt1=new Rotorblatt(10,5);
      rotorblatt2=new Rotorblatt(15,15);
      rotorblatt3=new Rotorblatt(5,15);
    }

  // end methods
} // end of Rotor
