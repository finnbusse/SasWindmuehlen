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
        windmuehle1 = new Windmuehle(300,30);
        windmuehle2 = new Windmuehle(500,20);
        windmuehle3 = new Windmuehle(700,10);

        windrad1 = new Windkraftanlage(60,60);
        windrad2 = new Windkraftanlage(50,50);
        windrad3 = new Windkraftanlage(40,40);
    }
    // end methods
} // end of Landschaft
