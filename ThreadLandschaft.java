import sas.*;
import java.awt.Color;

public class ThreadLandschaft {
    private Windmuehle windmuehle1;
    private Windmuehle windmuehle2;
    private Windmuehle windmuehle3;
    private Windkraftanlage windrad1, windrad2, windrad3;
    private View fenster;
    private Picture hintergrund;
    private Wind wind;
    private DrehThread drehenThread;
    private WindThread windThread;
    private double windSpeed;


    public static void main(String[] args) {
        new ThreadLandschaft();
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


        startSimulation();
    }

    public void startSimulation() {
        drehenThread = new DrehThread();
        windThread = new WindThread();
        drehenThread.start();
        windThread.start();
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
//                windrad1.drehen(5 * windSpeed);
//                windrad2.drehen(5 * windSpeed);
//                windrad3.drehen(5 * windSpeed);
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
