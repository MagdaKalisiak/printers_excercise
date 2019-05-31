import attempt3.printers.PrinterFasade;
import org.junit.Assert;
import org.junit.Test;


public class FasadeTest {
    @Test
    public void printTestEnumSupplier() {
        PrinterFasade fasade = new PrinterFasade();
        String actual = fasade.print("LASER");
        String expected= "The laser printer is printing";
        Assert.assertEquals(expected,actual);
    }
}
