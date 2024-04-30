import java.util.ArrayList; 
import java.util.List;

class TokoSenjataFantasi {
  private List<Senjata> senjata;

  public TokoSenjataFantasi() {
    senjata = new ArrayList<>();
  }

  public void tambahSenjata(Senjata senjata) {
    this.senjata.add(senjata);
  }

  public void tampilkanDaftarSenjata() {
    for (Senjata senjata : senjata) {
      String rarityLevel;
      if (senjata instanceof Pedang) {
        if (((Pedang) senjata).getTingkatKelangkaan() == 1) {
          rarityLevel = "(Biasa)"; // Set "Biasa" for Pedang with tingkatKelangkaan 1
        } else {
          rarityLevel = ((Pedang) senjata).getTingkatKelangkaan() + " (Langka)"; // Tingkat Kelangkaan Langka
        }
      } else if (senjata instanceof TongkatSihir) {
        rarityLevel = ((TongkatSihir) senjata).getKekuatanSihir() + " (Kuat)"; // Tingkat Kelangkaan Kuat
      } else {
        rarityLevel = "(Biasa)"; // Tingkat Kelangkaan Biasa
      }
      System.out.println("Nama: " + senjata.getNama() + ", Jenis: " + senjata.getJenis() + ", Harga: " + String.format("%.2f", senjata.getHarga()) + ", Serangan: " + (senjata.getSerangan() + senjata.getBonusSerangan()) + ", Serangan: " + senjata.getSeranganAction() + ", Tingkat Kelangkaan: " + rarityLevel);
    }
  }
  
  public double hitungTotalPembayaran() {
    double total = 0;
    for (Senjata senjata : senjata) {
      total += senjata.getHarga();
    }
    return total;
  }
}

