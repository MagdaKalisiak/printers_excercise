package attempt2.printerFactories;

public class UseLaserPrinter implements UsePrinterStrategy {

    public String usePrinter() {
        PrinterFactory laserFactory = new LaserPrinterFactory();
        Printer laserPrinter = laserFactory.createPrinter();
        return laserPrinter.printerPrint();

    }
}
