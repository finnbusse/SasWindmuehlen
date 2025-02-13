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

    private double initX, initY;

    public Windkraftanlage(double pX, double pY,double pWind) {
        turm = new Turm(pX, pY);
        rotor = new Rotor(pX+14, pY+14,pWind);

        this.initX = pX;
        this.initY = pY;
    }

    public double getX() {
        return initX;
    }

    public double getY() {
        return initY;
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
