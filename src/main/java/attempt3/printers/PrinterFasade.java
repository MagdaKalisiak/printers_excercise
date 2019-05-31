package attempt3.printers;

import attempt3.printouts.Printout;

public class PrinterFasade {

    public String print(String printerType) {
        return PrinterType.valueOf(printerType).factory.get().printerPrint();
    }

}
