import sas.*;

public class Wind {

    private int windstaerke;
    public Wind(){
        windstaerke = 2;
    }
    
    public void setWindstaerke(int pWindstaerke){
        windstaerke = pWindstaerke;
        System.out.println("Die Windst�rke wurde auf " + windstaerke);
    }

    public int getWindstaerke(){
        return windstaerke;
    }

}
