import sas.*;
import java.awt.Color; 
public class Muehlenfluegel {
    private Rectangle fluegel1;
    private Rectangle fluegel2;
    private Rectangle raster[];
    private double initX;
    private double initY;
    public Muehlenfluegel(double x,double y) {
        raster = new Rectangle[6];
        fluegel1 = new Rectangle(x,y,15,120,Color.WHITE);
        //fluegel2 = new Rectangle(x+25,y+20,5,60,);
        // for (int i=0; i < 5; i++) {
        //    raster[i] = new Rectangle(i+10,y,5,25);
        // }
        this.initX = x;
        this.initY = y;
    }

    public void drehen(double grad){
        fluegel1.turn(initX, initY, grad);
    }
}