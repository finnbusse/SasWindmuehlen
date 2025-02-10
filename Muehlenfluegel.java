import sas.*;
import java.awt.Color; 
public class Muehlenfluegel {
  Rectangle Fluegel;
  public Muehlenfluegel(double x,double y) {
      Fluegel = new Rectangle(x,y+100,5,100);
  }
  public void drehen(double grad){
      Fluegel.turn(grad);
  }
}
