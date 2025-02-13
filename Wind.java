import sas.*;

public class Wind {
    private int windstaerke;

    public Wind() {
        windstaerke = 2;
    }

    public void setWindstaerke(int pWindstaerke) {
        if (pWindstaerke <= 12 && pWindstaerke >= 0) {
            System.out.println("Die Windstaerke wurde von " + windstaerke + " auf " + pWindstaerke);
            windstaerke = pWindstaerke;
        } else {
            System.err.println("Die Windstaerke " + pWindstaerke + " ist ungültig!");
            throw new RuntimeException("ungültige Windstaerke!");
        }
    }

    public int getWindstaerke() {
        return windstaerke;
    }
}
