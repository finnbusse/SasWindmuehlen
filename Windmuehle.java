/**
 *
 * Description
 *
 * @version 1.0 from 02.02.2025
 * @author 
 */

public class Windmuehle {
  
  // start attributes
  private Muehlenhaus muehlenhaus;
  private Muehlenrad  muehlenrad;
  
  // end attributes
  public Windmuehle(double px,double py, Wind pWind){
      muehlenhaus = new Muehlenhaus(px,py+75);
      muehlenrad = new Muehlenrad(px+50,py-10, pWind);
  }
  // start methods
    public void drehen(double grad){
      muehlenrad.drehen(grad);
    }
  // end methods
} // end of Windmuehle



