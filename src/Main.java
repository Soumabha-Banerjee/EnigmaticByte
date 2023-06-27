import enigmaticgui.EncryptionPage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Launching......");
        try {
            new EncryptionPage();
        } catch(Exception exp) {
            System.out.println("Error Occurred: " + exp);
        }
    }
}