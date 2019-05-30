import attempt2.Client;
import attempt2.printerFactories.UseLaserPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ClientTest {
    @Test
    public void printTestStringLaser() {
        Client adam = new Client(new UseLaserPrinter() );
        String actual =adam.print();
        String expected ="The laser printer is printing";

        assertEquals(expected,actual);
    }
}
