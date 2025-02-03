/**
 *
 * Description
 *
 * @version 1.0 from 02.02.2025
 * @author Finn Busse
 */

public class Windkraftanlage {
  
  // start attributes
  private Turm turm;
  private Rotor rotor;
  // end attributes

  public void Windkraftanlage(double px, double py) {
    turm = new Turm(px, py);
    rotor = new Rotor(px+50, py-10);

  }
  
  // start methods
  // end methods
} // end of Windrad
