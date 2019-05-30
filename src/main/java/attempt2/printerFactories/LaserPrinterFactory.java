package attempt2.printerFactories;

public class LaserPrinterFactory implements PrinterFactory {

    public Printer createPrinter() {
        return new LaserPrinter();
    }
}
