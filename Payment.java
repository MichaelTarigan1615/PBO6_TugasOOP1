package IKLCMart;

public class Payment {
    protected double totalPrice;
    protected String paymentMethod;
    protected String paymentStatus;
    protected String nama;

//    Konstruktor
    public Payment(String nama, double totalPrice, String paymentMethod) {
        this.nama = nama;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = "Pembayaran Gagal";
    }

//    Method yang menangani metode pembayaran, selain voucher
    public void processPayment(String method) {
        switch (method) {
            case "Kartu Kredit":
                this.paymentStatus = "Pembayaran Berhasil dengan Kartu Kredit";
                break;
            case "Transfer Bank":
                this.paymentStatus = "Pembayaran Berhasil Bank Transfer";
                break;
            default:
                this.paymentStatus = "Metode pembayaran tidak ditekahui";
        }
    }

//    Method yang menangani metode pembayaran menggunakan voucher
    public void processPayment(String method, double discount) {
        if (method.equals("Voucher")) {
            this.totalPrice = this.totalPrice - (this.totalPrice * discount/100);
            this.paymentStatus = "Pembayaran Berhasil dengan Voucher Diskon";
        } else {
            processPayment(method);
        }
    }

//    Mengembalikan nilai totalPrice
    public double getTotalPrice() {
        return totalPrice;
    }

//    Menampilkan hasil detail pembayaran
    public void displayPayment() {
        System.out.println("Nama Pembeli      : " + this.nama);
        System.out.println("Metode Pembayaran : " + paymentMethod);
        System.out.println("Status Pembayaran : " + paymentStatus);
    }
}
