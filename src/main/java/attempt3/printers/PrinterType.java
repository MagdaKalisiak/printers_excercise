package attempt3.printers;

import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

enum PrinterType {
     LASER(LaserPrinter::new),
     INK(InkPrinter::new),
     LED(LedPrinter::new);


      final Supplier<Printer> factory;
     private PrinterType(Supplier<Printer> factory) {
         this.factory = requireNonNull(factory);
     }
 }



