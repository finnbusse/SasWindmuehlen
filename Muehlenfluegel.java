import sas.*;
import java.awt.Color; 
private class Muehlenfluegel {
  Rectangle fluegel1;
  Rectangle fluegel2;
  Rectangle raster[];
  private Muehlenfluegel(double x,double y) {
      fluegel1 = new Rectangle(x,y+20,5,80);
      //fluegel = new Rectangle(x+25,y+20,5,80);
      //for (int i=0; i < 9; i++) {
          //raster[i] = new Rectangle(,,5,25);
      }
      

  public void drehen(double grad){
      fluegel1.turn(grad);
  }
}