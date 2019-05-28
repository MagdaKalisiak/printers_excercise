package attempt1.printers;

public enum PrinterType {

    LASER {
        @Override
        public Printer usePrinter() {
            return new LaserPrinter();
        }
    },
    INK {
        @Override
        public Printer usePrinter() {
            return new InkPrinter();
        }
    },

    LED {
        @Override
        public Printer usePrinter() {
            return new LedPrinter();
        }
    };

    public abstract Printer usePrinter();
}