import attempt4.printers.PrinterFasade;
import attempt4.printers.PrinterType;
import org.junit.Assert;
import org.junit.Test;


public class ClientTest {
    @Test
    public void printTestEnum() {
        PrinterFasade fasade = new PrinterFasade();
        String actual = fasade.print(PrinterType.LASER);
       String expected = "The laser printer is printing";
        Assert.assertEquals(expected,actual);
    }
}
