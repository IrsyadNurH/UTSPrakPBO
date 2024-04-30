abstract class SenjataFantasi implements Senjata {
    private String nama;
    private double harga;
    private String jenis;
  
    public SenjataFantasi(String nama, double harga, String jenis) {
      this.nama = nama;
      this.harga = harga;
      this.jenis = jenis;
    }
  
    @Override
    public double getHarga() {
      return harga;
    }
  
    @Override
    public String getNama() {
      return nama;
    }
  
    @Override
    public String getJenis() {
      return jenis;
    }
  
    // Implementasi getSerangan()
    public double getSerangan() {
      return 0;
    }
  }
  