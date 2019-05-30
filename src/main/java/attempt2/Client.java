package attempt2;

import attempt2.printerFactories.UsePrinterStrategy;

public class Client {
    UsePrinterStrategy usePrinterStrategy;

    public Client(UsePrinterStrategy usePrinterStrategy) {
        this.usePrinterStrategy = usePrinterStrategy;
    }

   public String print(){
   return usePrinterStrategy.usePrinter();
   }
}
