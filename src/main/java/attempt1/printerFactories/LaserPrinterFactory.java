package attempt1.printerFactories;

public class LaserPrinterFactory implements PrinterFactory {

    public Printer createPrinter() {
        return new LaserPrinter();
    }
}
