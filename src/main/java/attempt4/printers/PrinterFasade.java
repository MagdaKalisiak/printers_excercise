package attempt4.printers;


import java.util.EnumMap;


public class PrinterFasade {
    public final EnumMap<PrinterType, Printer> printerMap = new EnumMap<PrinterType, Printer>(PrinterType.class);

    public PrinterFasade() {
        printerMap.put(PrinterType.INK, new InkPrinter());
        printerMap.put(PrinterType.LASER, new LaserPrinter());
        printerMap.put(PrinterType.LED, new LedPrinter());

    };


    public String print(PrinterType printerType) {
        return printerMap.get(printerType).printerPrint();
    }

}
