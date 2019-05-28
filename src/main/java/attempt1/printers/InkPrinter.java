package attempt1.printers;

import attempt1.printouts.InkPrintout;
import attempt1.printouts.Printout;

class InkPrinter implements Printer {
    public Printout printerPrint() {
        System.out.println("The ink printer is printing");
        return new InkPrintout();
    }
}
