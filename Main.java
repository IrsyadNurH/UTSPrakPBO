public class Main {
    public static void main(String[] args) {
      TokoSenjataFantasi tokoSenjataFantasi = new TokoSenjataFantasi();
  
      tokoSenjataFantasi.tambahSenjata(new Pedang("Pedang Excalibur", 1000000, "Pedang Legendaris", 10));
      tokoSenjataFantasi.tambahSenjata(new TongkatSihir("Tongkat Gandalf", 500000, "Tongkat Sihir Kuno", 100));
      tokoSenjataFantasi.tambahSenjata(new Pedang("Pedang Besi Biasa", 50000, "Pedang Sederhana",1));
  
      tokoSenjataFantasi.tampilkanDaftarSenjata();
      System.out.println("Total pembayaran: " + tokoSenjataFantasi.hitungTotalPembayaran());
      
    }
  }
  