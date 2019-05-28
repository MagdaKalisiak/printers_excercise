package attempt1.printers;

import attempt1.printouts.Printout;

public class PrinterFasade {

    public Printout print(PrinterType printerType) {
        return printerType.usePrinter().printerPrint();
    }

}
