class TongkatSihir extends SenjataFantasi {
    private int kekuatanSihir; // Menambahkan atribut kekuatan sihir
  
    public TongkatSihir(String nama, double harga, String jenis, int kekuatanSihir) {
      super(nama, harga, jenis);
      this.kekuatanSihir = kekuatanSihir;
    }
  
    // Getter method for kekuatanSihir
    public int getKekuatanSihir() {
      return kekuatanSihir;
    }

    // Mendapatkan bonus serangan untuk tongkat sihir
    @Override
  public double getSerangan() {
    double seranganDasar = 5; 
    double bonusSerangan = getBonusSerangan();
    return seranganDasar + bonusSerangan;
  }

  public double getBonusSerangan() {
    return kekuatanSihir * 2; // Bonus serangan berdasarkan kekuatan sihir
  }

  @Override
  public String getSeranganAction() {
    return "Merapal"; // Return "Merapal" for staffs
  }
}

