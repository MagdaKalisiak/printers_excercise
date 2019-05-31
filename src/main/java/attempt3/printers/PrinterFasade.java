package attempt3.printers;

public class PrinterFasade {

    public String print(String printerType) {
        return PrinterType.valueOf(printerType).factory.get().printerPrint();
    }

}
