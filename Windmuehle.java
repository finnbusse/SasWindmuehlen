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
  public Windmuehle(double px,double py){
      muehlenhaus = new Muehlenhaus(px,py+150);
      muehlenrad = new Muehlenrad(px+50,py-10);
  }
  // start methods

  // end methods
} // end of Windmuehle



