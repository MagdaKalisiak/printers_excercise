package attempt1.printerFactories;

public class UseLaserPrinter implements UsePrinterStrategy {

    public void usePrinter() {
        PrinterFactory laserFactory = new LaserPrinterFactory();
        Printer laserPrinter = laserFactory.createPrinter();
        laserPrinter.printerPrint();

    }
}
