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


  public Windkraftanlage(double px, double py) 
    turm = new Turm(px, py);
    rotor = new Rotor(px + 50, py - 10);

  }

  public double getX() {
    return px;
  }

  public double getY() {
    return py;
  }
}
