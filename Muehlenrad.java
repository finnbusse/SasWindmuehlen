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
        muehlenfluegel1 = new Muehlenfluegel(100,100);
        muehlenfluegel2 = new Muehlenfluegel(100,200); // muehlenfluegel2.turn(90);
        muehlenfluegel3 = new Muehlenfluegel(100,300); // ...
        muehlenfluegel4 = new Muehlenfluegel(100,400);

    
    }      

    // end attributes
    // start methods
  
    public void drehen(){

    }
    // end methods
} // end of Windrad
