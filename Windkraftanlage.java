import sas.*;
import java.awt.Color;


/**
 *
 * Description
 *
 * @version 1.0 from 03.02.2025
 * @author Finn Busse
 */

public class Windkraftanlage {

  // start attributes
  private Turm turm;
  private Rotor rotor;
  // end attributes


  public Windkraftanlage(double pX, double pY){
    turm = new Turm(pX, pY);
    rotor = new Rotor(pX + 50, pY - 10);

  }

  public double getX() {
    return pX;
  }

  public double getY() {
    return pX;
  }
}
