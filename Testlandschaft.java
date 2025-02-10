import sas.*;


public class Testlandschaft {


    View testView;
    Windkraftanlage testAnlage;


    public static void main(String[] args) {new Testlandschaft();}


    public Testlandschaft() {
        testView = new View(1000,700);
        testAnlage = new Windkraftanlage(50, 100);
    }
}
