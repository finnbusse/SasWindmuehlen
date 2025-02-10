import sas.*;

import java.awt.*;


public class testLandschaft {


    View testView;
    Windkraftanlage testAnlage;



    public testLandschaft() {
        testView = new View(1000,700);
        testAnlage = new Windkraftanlage(50, 100);
    }
}
