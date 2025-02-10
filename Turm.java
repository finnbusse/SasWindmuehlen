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
    public Turm(double px,double py){
        View fenster = new View(700,800);
        Rectangle turm = new Rectangle(px,py,12,180, new Color(232,232,232));
        Circle turbine = new Circle(px-7,py-7,14,new Color(232,232,232));
        Rectangle gruen0 = new Rectangle(px,py+140,12,40,new Color(100,200,100));
        Rectangle gruen1 = new Rectangle(px,py+150,12,30,new Color(30,210,40));
        Rectangle gruen2 = new Rectangle(px,py+160,12,20,new Color(30,200,40));
        Rectangle gruen3 = new Rectangle(px,py+170,12,10,new Color(30,160,40));
        Rectangle tuer = new Rectangle(px+4,py+168,4,12,new Color(200,200,200));
        Circle tuergriff = new Circle(px+4,py+174,1,new Color(232,232,232));
    }
} 