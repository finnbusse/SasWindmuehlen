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
        Rectangle turm = new Rectangle(px,py,12,180, new Color(232,232,232));
        Circle turbine = new Circle(px-7,py-7,14,new Color(232,232,232));

    }
} 