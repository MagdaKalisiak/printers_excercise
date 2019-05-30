import attempt1.printouts.Printout;

public class Main {
    public static void main(String[] args) {
        PrinterFasade printerFasade = new PrinterFasade();
        Printout printout = printerFasade.print(PrinterType.LASER);


    }
}
