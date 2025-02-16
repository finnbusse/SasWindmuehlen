import sas.*;
import java.awt.Color;
/**
 *
 * Description
 *
 * @version 1.0 from 02.02.2025
 * @author 
 */

public class Landschaft {

    // start attributes
    private Windmuehle windmuehle1;
    private Windmuehle windmuehle2;
    private Windmuehle windmuehle3;
    private Windkraftanlage windrad1,windrad2,windrad3;
    private View fenster;
    private Picture hintergrund;
    
    

    public static void main(String[] args) {new Landschaft();}

  
    // end attributes
    // start methods
    public Landschaft(){
        fenster = new View(1200,800);
        double pWind = 10;
        hintergrund = new Picture(0,0,"landschaft.jpg");
        windmuehle1 = new Windmuehle(200,350);
        windmuehle2 = new Windmuehle(750,270);
        windmuehle3 = new Windmuehle(1050,350);

        windrad1 = new Windkraftanlage(100,250,pWind);
        windrad2 = new Windkraftanlage(440,300,pWind);
        windrad3 = new Windkraftanlage(980,270,pWind);
    }
    
    /*public void windmuehleDrehen(){
        for (int i = 0; i < 500; i++){
            windmuehle1.drehen(5);
            fenster.wait(30);
        }*/
    
    
    }

    
    // end methods} // end of Landschaft
