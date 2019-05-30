package attempt1.printerFactories;

public class InkPrinterFactory implements PrinterFactory {

    public Printer createPrinter() {
        return new InkPrinter();
    }
}
