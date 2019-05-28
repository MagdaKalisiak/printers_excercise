package attempt1.printers;

import attempt1.printouts.LaserPrintout;
import attempt1.printouts.Printout;

class LaserPrinter implements Printer {
    public Printout printerPrint() {
        System.out.println("The laser printer is printing");
        return new LaserPrintout();
    }
}
