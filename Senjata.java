interface Senjata {
    double getHarga();
    String getNama();
    String getJenis();
    double getSerangan();
    abstract double getBonusSerangan();
    abstract String getSeranganAction(); // Add this method declaration
  }
  