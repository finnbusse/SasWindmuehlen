import sas.*;
import java.awt.Color; 
public class Muehlenfluegel {
  Rectangle fluegel;
  
  public Muehlenfluegel(double x,double y) {
      fluegel = new Rectangle(x,y+100,5,100);
      
  }
  public void drehen(double grad){
      fluegel.turn(grad);
  }
}
