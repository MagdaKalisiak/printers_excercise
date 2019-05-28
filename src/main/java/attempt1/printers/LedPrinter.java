package attempt1.printers;

import attempt1.printouts.LedPrintout;
import attempt1.printouts.Printout;

class LedPrinter implements Printer {
    public Printout printerPrint() {
        System.out.println("The led printer is printing");
        return new LedPrintout();
    }
}
