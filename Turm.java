import sas.*;
import java.awt.Color;
/**
 *
 * Description
 *
 * @version 1.0 from 02.02.2025
 * @author 
 */

public class Turm {
Rectangle turm,gruen0,gruen1,gruen2,gruen3,rot;
    
    public Turm(double px,double py){
        View fenster = new View(700,800);
        turm = new Rectangle(px,py,12,180, new Color(202,202,202));
        Circle turbine = new Circle(px-7,py-7,14,new Color(202,202,202));
        gruen0 = new Rectangle(px,py+140,12,40,new Color(150,230,50));
        gruen1 = new Rectangle(px,py+150,12,30,new Color(130,220,70));
        gruen2 = new Rectangle(px,py+160,12,20,new Color(100,200,40));
        gruen3 = new Rectangle(px,py+170,12,10,new Color(70,140,60));
        Rectangle tuer = new Rectangle(px+4,py+168,4,12,new Color(202,202,202));
        Circle tuergriff = new Circle(px+4,py+174,1,new Color(160,160,160));
        Rectangle rot = new Rectangle(px,py+100,12,12,new Color(240,30,30));
    }

    public void setX(double pX) {
    }

    public void setY(double pY) {
    }
} 