package attempt2.printerFactories;

public class UseLedPrinter implements UsePrinterStrategy {
    public String usePrinter() {
        PrinterFactory ledFactory = new LedPrinterFactory();
        Printer ledPrinter = ledFactory.createPrinter();
        return ledPrinter.printerPrint();

    }
}
