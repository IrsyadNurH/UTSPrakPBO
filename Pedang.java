class Pedang extends SenjataFantasi {
  private int tingkatKelangkaan; // Menambahkan atribut tingkat kelangkaan

  public Pedang(String nama, double harga, String jenis, int tingkatKelangkaan) {
    super(nama, harga, jenis);
    this.tingkatKelangkaan = tingkatKelangkaan;
  }

  // Getter method for tingkatKelangkaan
  public int getTingkatKelangkaan() {
    return tingkatKelangkaan;
  }
  
    // Mendapatkan bonus serangan untuk pedang
    @Override
    public double getSerangan() {
      double seranganDasar = 10; 
      double bonusSerangan = getBonusSerangan();
      return seranganDasar + bonusSerangan;
    }
  
    @Override
    public double getBonusSerangan() {
      return tingkatKelangkaan * 5;
    }
  
    @Override
    public String getSeranganAction() {
      return "Menebas"; // Return "Menebas" for swords
    }
  }
  