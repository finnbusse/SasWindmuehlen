package ThreadLandschaft;

import sas.*;
import java.awt.Color;

/**
 * Beschreibung:
 * Diese Anwendung simuliert eine Landschaft mit Windmühlen und Windkraftanlagen,
 * die sich basierend auf einer variablen Windgeschwindigkeit drehen.
 *
 * @version 1.0 from 02.02.2025
 * @author
 */
public class ThreadLandschaft {

    private Windmuehle windmuehle1;
    private Windmuehle windmuehle2;
    private Windmuehle windmuehle3;
    private Windkraftanlage windrad1, windrad2, windrad3;
    private View fenster;
    private Picture hintergrund;

    private Thread drehen, wind;

    private volatile double windSpeed = 1.0;

    public static void main(String[] args) {
        ThreadLandschaft landschaft = new ThreadLandschaft();
        landschaft.startSimulation();
    }

    public ThreadLandschaft() {
        fenster = new View(1200, 800);
        hintergrund = new Picture(0, 0, "landschaft.jpg");

        windmuehle1 = new Windmuehle(200, 350);
        windmuehle2 = new Windmuehle(750, 270);
        windmuehle3 = new Windmuehle(1050, 350);

        double pWind = 10;
        windrad1 = new Windkraftanlage(100, 250, pWind);
        windrad2 = new Windkraftanlage(440, 300, pWind);
        windrad3 = new Windkraftanlage(980, 270, pWind);
    }

    public void startSimulation() {
        drehen = new Thread(() -> {
            while (true) {
                windmuehle1.drehen(5 * windSpeed);
                windmuehle2.drehen(5 * windSpeed);
                windmuehle3.drehen(5 * windSpeed);

                windrad1.drehen(5 * windSpeed);
                windrad2.drehen(5 * windSpeed);
                windrad3.drehen(5 * windSpeed);

                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });

        wind = new Thread(() -> {
            while (true) {
                windSpeed = berechneWindGeschwindigkeit();

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });

        drehen.start();
        wind.start();
    }

    private double berechneWindGeschwindigkeit() {
        return 0.5 + Math.random();
    }
}
