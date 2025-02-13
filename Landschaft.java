import sas.*;
import java.awt.Color;

public class Landschaft {

    private Windmuehle windmuehle1;
    private Windmuehle windmuehle2;
    private Windmuehle windmuehle3;
    private Windkraftanlage windrad1,windrad2,windrad3;
    private View fenster;
    private Picture hintergrund;
    public Wind wind;

    //    public static void main(String[] args) {new Landschaft();}

    public Landschaft(){
        fenster = new View(1200,800);
        wind = new Wind();
        hintergrund = new Picture(0,0,"landschaft.jpg");
        windmuehle1 = new Windmuehle(200,370,wind);
        windmuehle2 = new Windmuehle(750,270,wind);
        windmuehle3 = new Windmuehle(1050,350,wind);

        windrad1 = new Windkraftanlage(100,250,wind);
        windrad2 = new Windkraftanlage(440,300,wind);
        windrad3 = new Windkraftanlage(980,280,wind);
    }

    public void windmuehleDrehen(){
        while(!fenster.keyPressed(' ')) {
            windmuehle1.drehen(0);
            windmuehle2.drehen(0);
            windmuehle3.drehen(0);
            windrad1.drehen(0);
            windrad2.drehen(0);
            windrad3.drehen(0);

            
            fenster.wait(30);
        }

    }
}

// end methods} // end of Landschaft
