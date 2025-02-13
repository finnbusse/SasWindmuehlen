import sas.*;
import java.awt.Color;

public class ThreadLandschaft {
    private Windmuehle windmuehle1;
    private Windmuehle windmuehle2;
    private Windmuehle windmuehle3;
    private Windkraftanlage windrad1, windrad2, windrad3;
    private View fenster;
    private Picture hintergrund;
    private DrehThread drehen;
    private WindThread wind;
    private volatile double windSpeed = 1.0;

    public static void main(String[] args) {
        ThreadLandschaft landschaft = new ThreadLandschaft();
        landschaft.startSimulation();
    }

    public ThreadLandschaft() {
        fenster = new View(1200,800);
        wind = new Wind();


        hintergrund = new Picture(0,0,"landschaft.jpg");
        windmuehle1 = new Windmuehle(200,350,wind);
        windmuehle2 = new Windmuehle(750,270,wind);
        windmuehle3 = new Windmuehle(1050,350,wind);

        windrad1 = new Windkraftanlage(100,250,wind);
        windrad2 = new Windkraftanlage(440,300,wind);
        windrad3 = new Windkraftanlage(980,270,wind);
    }

    public void startSimulation() {
        drehen = new DrehThread();
        wind = new WindThread();
        drehen.start();
        wind.start();
    }

    private double berechneWindGeschwindigkeit() {
        return 0.5 + Math.random();
    }

    private class DrehThread extends Thread {
        @Override
        public void run() {
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
        }
    }

    private class WindThread extends Thread {
        @Override
        public void run() {
            while (true) {
                windSpeed = berechneWindGeschwindigkeit();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }
}
