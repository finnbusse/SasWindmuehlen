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

    private Wind wind;

    public Windkraftanlage(double pX, double pY, Wind pWind) {
        turm = new Turm(pX, pY);
        rotor = new Rotor(pX+8, pY, pWind);

        wind = pWind;

        this.initX = pX;
        this.initY = pY;
    }

    public void drehen(double grad){
        rotor.drehen(grad);
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
