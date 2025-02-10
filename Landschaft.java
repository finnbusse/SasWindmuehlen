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
        hintergrund = new Picture(0,0,"landschaft.jpg");
        windmuehle1 = new Windmuehle(200,300);
        windmuehle2 = new Windmuehle(600,200);
        windmuehle3 = new Windmuehle(1000,100);

        windrad1 = new Windkraftanlage(100,200);
        windrad2 = new Windkraftanlage(300,200);
        windrad3 = new Windkraftanlage(500,200);
    }
    // end methods
} // end of Landschaft
