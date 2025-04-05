package IKLCMart;

public class PaymentSystem extends Payment {

//    Konstruktor
    public PaymentSystem(String nama, double totalPrice, String paymentMethod) {
        super(nama, totalPrice, paymentMethod);
    }

//    Method yang memproses pembayaran
    public void process() {
        if (paymentMethod.equals("Voucher")) {
            processPayment(paymentMethod, 15);
        } else {
            processPayment(paymentMethod);
        }
    }

//    Method display yang menampilkan transaksi dengan lengkap
    public void display(){
        System.out.println("Total Harga Sebelum Diskon : Rp " + (int)(totalPrice));
        displayPayment();
        System.out.println("Total Harga Sesudah Diskon : Rp " + (int)(getTotalPrice()));
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
    }
}
