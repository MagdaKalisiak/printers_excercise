package attempt2.printerFactories;

public class UseInkPrinter implements UsePrinterStrategy {
    public String usePrinter() {
        PrinterFactory inkFactory = new InkPrinterFactory();
        Printer inkPrinter = inkFactory.createPrinter();
        return inkPrinter.printerPrint();

    }
}
