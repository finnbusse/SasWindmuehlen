import sas.*;
import java.awt.Color; 
private class Muehlenfluegel {
  Rectangle fluegel;
  Rectangle raster[];
  private Muehlenfluegel(double x,double y) {
      fluegel = new Rectangle(x,y+20,5,80);
      fluegel = new Rectangle(x+25,y+20,5,80);
      for (int i=0; i < 9; i++) {
          raster[i] = new Rectangle(,,5,25)
      }
      
  }
  public void drehen(double grad){
      fluegel.turn(grad);
  }
}
for (int i = 0; i < sterne.length; i++){
            sterne[i] = new Rectangle(Math.random()*800,Math.random()*600,1,1,Color.WHITE);
        }