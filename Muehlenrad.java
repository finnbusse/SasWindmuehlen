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
    muehlenfluegel4; //View fenster;
    Wind wind;

    public Muehlenrad(double pX,double pY, Wind pWind){
        //fenster=new View(1000,800,"TEST");
        wind = pWind;
        muehlenfluegel1 = new Muehlenfluegel(pX,pY);
        muehlenfluegel2 = new Muehlenfluegel(pX+0,pY+0); muehlenfluegel2.drehen(90);
        muehlenfluegel3 = new Muehlenfluegel(pX+0,pY+0); muehlenfluegel3.drehen(180);
        muehlenfluegel4 = new Muehlenfluegel(pX-0,pY+0); muehlenfluegel4.drehen(270);

    }      
    // end attributes
    // start methods

    public void drehen(double pAngle){
        
        muehlenfluegel1.drehen(wind.getWindstaerke());
        muehlenfluegel2.drehen(wind.getWindstaerke());
        muehlenfluegel3.drehen(wind.getWindstaerke());
        muehlenfluegel4.drehen(wind.getWindstaerke()); 
    }
    // end methods
} // end of Windrad
