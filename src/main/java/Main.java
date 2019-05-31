import attempt3.printers.PrinterFasade;

public class Main {
    public static void main(String[] args) {
        PrinterFasade printerFasade = new PrinterFasade();
       String laserprinting = printerFasade.print("LASER");
        System.out.println(laserprinting);


    }
}
