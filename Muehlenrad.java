import sas.*;
import java.awt.Color;

/**
 *
 * Description
 *
 * @version 1.0 from 02.02.2025
 * @author 
 */

public class Muehlenrad {

    // start attributes
    private Muehlenfluegel muehlenfluegel1, 
    muehlenfluegel2, muehlenfluegel3, 
    muehlenfluegel4;

    public Muehlenrad(double pX,double pY){
        new View(1000,800,"TEST");
        muehlenfluegel1 = new Muehlenfluegel(pX,pY);
        muehlenfluegel2 = new Muehlenfluegel(pX+100,pY); muehlenfluegel2.drehen(80);
        muehlenfluegel3 = new Muehlenfluegel(pX,pY+100); muehlenfluegel3.drehen(190);
        muehlenfluegel4 = new Muehlenfluegel(pX+200,pY+200); muehlenfluegel4.drehen(300);

    }      
    // end attributes
    // start methods

    public void drehen(double pAngle){
        muehlenfluegel1.drehen(pAngle);
        muehlenfluegel2.drehen(pAngle);
        muehlenfluegel3.drehen(pAngle);
        muehlenfluegel4.drehen(pAngle);
    }
    // end methods
} // end of Windrad
