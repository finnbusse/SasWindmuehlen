import sas.*; 
import java.awt.Color; 
/**
 *
 * Description
 *
 * @version 1.0 from 02.02.2025
 * @author 
 */

public class Muehlenhaus {

    //start attributes
    View fenster;
    Rectangle muehlenhaus;
    
    // end attributes

    // start methods
    public Muehlenhaus(double pX, double pY){
        // end methods
        Rectangle base = new Rectangle(200, 250, 200, 150, Color.BLACK);
        
        // Dach
        Polygon roof = new Polygon(200, 250, Color.RED);
        roof.add(400, 250);
        roof.add(300, 150);
        
        // Windmühlen-Turm
        Rectangle tower = new Rectangle(280, 100, 40, 150, Color.GRAY);
        
        // Rotorblätter
        Polygon blade1 = new Polygon(300, 100, Color.BLACK);
        blade1.add(360, 80);
        blade1.add(300, 60);
        blade1.add(240, 80);
        
        Polygon blade2 = new Polygon(300, 100, Color.BLACK);
        blade2.add(320, 40);
        blade2.add(300, 20);
        blade2.add(280, 40);
    }
    }// end of Muehlenhaus
