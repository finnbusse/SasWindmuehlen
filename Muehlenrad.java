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
        muehlenfluegel2 = new Muehlenfluegel(pX,pY); muehlenfluegel2.drehe(90);
        muehlenfluegel3 = new Muehlenfluegel(pX,pY); // ...
        muehlenfluegel4 = new Muehlenfluegel(pX,pY);

    
    }      

    // end attributes
    // start methods
  
    public void drehen(){

    }
    // end methods
} // end of Windrad