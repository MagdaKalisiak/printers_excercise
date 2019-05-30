import attempt2.Client;
import attempt2.printerFactories.UseLaserPrinter;

public class Main {
    public static void main(String[] args) {

        Client adam = new Client(new UseLaserPrinter() );
        System.out.println(adam.print());


    }
}
