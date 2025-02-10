import sas.*;
import java.awt.Color; 
public class Muehlenfluegel {
  private Rectangle fluegel1;
  private Rectangle fluegel2;
  private Rectangle raster[];
  public Muehlenfluegel(double x,double y) {
      raster = new Rectangle[10];
      fluegel1 = new Rectangle(x,y,5,80);
      fluegel2 = new Rectangle(x+25,y+20,5,80);
      for (int i=0; i < 9; i++) {
          raster[i] = new Rectangle(i+6,y,5,25);
      }
      
    }
  public void drehen(double grad){
      fluegel1.turn(grad);
  }
}