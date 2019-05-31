import attempt3.printers.PrinterFasade;
import attempt3.printouts.LaserPrintout;
import attempt3.printers.PrinterType;
import attempt3.printouts.Printout;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class ClientTest {
    @Test
    public void printTestEnum() {
        PrinterFasade fasade = new PrinterFasade();
        Printout actual = fasade.print(PrinterType.LASER);
        assertTrue(actual instanceof LaserPrintout);
    }
}
