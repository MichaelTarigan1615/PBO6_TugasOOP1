package IKLCMart;

public class Main {
    public static void main(String[] args) {
        PaymentSystem Siti = new PaymentSystem("Siti", 3500000, "Kartu Kredit");
        Siti.process();
        Siti.display();

        PaymentSystem Ciciripi =  new PaymentSystem("Ciciripi", 10000000, "Voucher");
        Ciciripi.process();
        Ciciripi.display();

        PaymentSystem Asnawi = new PaymentSystem("Asnawi", 1200000, "Transfer Bank");
        Asnawi.process();
        Asnawi.display();
        }
    }

