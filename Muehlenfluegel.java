import sas.*;
import java.awt.Color; 
public class Muehlenfluegel {
  Rectangle fluegel;
  public Muehlenfluegel(double x,double y) {
      fluegel = new Rectangle(x,y+20,5,80);
      fluegel2 = new Rectangle();
      
  }
  public void drehen(double grad){
      fluegel.turn(grad);
  }
}
