package attempt1.printerFactories;

public class LedPrinterFactory implements PrinterFactory {
    public Printer createPrinter() {
        return new LedPrinter();
    }
}
