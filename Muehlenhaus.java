import sas.*; 
import java.awt.Color; 
/**
 *
 * Description
 *
 * @version 1.0 from 02.02.2025
 * @author 
 */

public class Muehlenhaus {

    private Polygon polygon1;
    private Polygon polygon2;
    private Polygon polygon3;
    private Polygon polygon4;
    private Polygon polygon5;
    private Polygon polygon6;
    private Polygon polygon7;
    private Polygon polygon8;
    private Polygon polygon9;

    public Muehlenhaus(double pX, double pY){
        //muehlenhaus = new Rectangle();
        polygon1= new Polygon(pX+21,pY+220);

        polygon1.add(70.0,0.0);
        polygon1.add(70.0,-80.0);
        polygon1.add(-2.0,-65.0);
        polygon1.setColor(new Color(200,70,10));

        polygon2 = new Polygon(pX+90,pY+220);
        polygon2.add(1.0,1.0);
        polygon2.add(1.0,1.0);
        polygon2.add(101.0,-1.0);
        polygon2.add(101.0,-1.0);
        polygon2.add(101.0,-141.0);
        polygon2.add(-1.0,-141.0);
        polygon2.setColor(Color.RED);
        polygon2.setColor(Color.LIGHT_GRAY);
        polygon2.setColor(new Color(200,70,10));
        polygon2.setColor(Color.LIGHT_GRAY);
        polygon2.setColor(new Color(100,100,100));
        polygon2.setColor(Color.BLACK);
        polygon2.setColor(Color.GREEN);
        polygon2.setColor(Color.BLUE);
        polygon2.setColor(Color.LIGHT_GRAY);
        polygon2.setColor(Color.ORANGE);
        polygon2.setColor(new Color(100,100,100));
        polygon2.setColor(Color.MAGENTA);
        polygon2.setColor(new Color(20,200,100));
        polygon2.setColor(new Color(200,70,10));
        polygon2.setColor(new Color(20,200,100));
        polygon2.setColor(new Color(100,200,150));
        polygon2.setColor(new Color(0,200,50));
        polygon2.setColor(new Color(50,10,150));
        polygon2.setColor(Color.RED);
        polygon2.setColor(new Color(255,255,255));
        polygon2.setColor(Color.LIGHT_GRAY);

        polygon3 = new Polygon(pX+81,pY+78);
        polygon3.add(119.0,1.0);
        polygon3.add(60.0,-50.0);
        polygon3.setColor(Color.RED);
        polygon3.setColor(new Color(200,70,10));

        polygon4 = new Polygon(pX+119,pY+220);
        polygon4.add(12.0,-1.0);
        polygon4.add(12.0,-19.0);
        polygon4.add(-1.0,-20.0);
        polygon4.setColor(Color.BLACK);
        polygon4.setColor(new Color(200,70,10));
        polygon4.setColor(Color.BLACK);
        polygon4.setColor(new Color(100,100,100));
        polygon4.setColor(Color.BLACK);

        polygon5 = new Polygon(pX+95,pY+166);
        polygon5.add(9.0,0.0);
        polygon5.add(7.0,-13.0);
        polygon5.add(0.0,-13.0);
        polygon5.setColor(Color.BLUE);

        polygon6 = new Polygon(pX+158,pY+152);
        polygon6.add(-1.0,10.0);
        polygon6.add(9.0,11.0);
        polygon6.add(8.0,0.0);
        polygon6.setColor(Color.BLUE);
        polygon6.setColor(Color.BLUE);

        polygon7 = new Polygon(pX+123,pY+166);
        polygon7.add(11.0,0.0);
        polygon7.add(13.0,-14.0);
        polygon7.add(1.0,-14.0);
        polygon7.setColor(Color.BLUE);

        polygon8 = new Polygon(pX+157,pY+199);
        polygon8.add(12.0,0.0);
        polygon8.add(12.0,12.0);
        polygon8.add(1.0,11.0);
        polygon8.setColor(Color.BLUE);

        polygon9 = new Polygon(pX+130,pY+95);
        polygon9.add(0.0,11.0);
        polygon9.add(15.0,12.0);
        polygon9.add(14.0,-1.0);
        polygon9.setColor(Color.BLUE);
    }

}
