import sas.*;
import java.awt.Color;

/**
 *
 * Description
 *
 * @version 1.1 from 10.02.2025
 * @author Finn Busse
 */
public class Windkraftanlage {

  // Attribute
  private Turm turm;
  private Rotor rotor;

  public Windkraftanlage(double pX, double pY) {
    turm = new Turm(pX, pY);
    rotor = new Rotor(pX + 50, pY - 10);
  }


  public double getX() {
    return pX;
  }

  public double getY() {
    return pY;
  }


  public void setX(double pX) {
    turm.setX(pX);
    rotor.setX(pX + 50);
  }

  public void setY(double pY) {
    turm.setY(pY);
    rotor.setY(pY - 10);
  }
}
