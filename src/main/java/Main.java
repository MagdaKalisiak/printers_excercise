import attempt4.printers.PrinterFasade;
import attempt4.printers.PrinterType;

public class Main {
    public static void main(String[] args) {
        PrinterFasade printerFasade = new PrinterFasade();
        String printout = printerFasade.print(PrinterType.LASER);
        System.out.println(printout);

    }
}
