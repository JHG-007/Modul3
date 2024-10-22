public class MataKuliah {
    private String kodeMK;
    private int SKS;
    private String Nama;
    public MataKuliah(String kodeMK, int sKS, String nama) {
        this.kodeMK = kodeMK;
        SKS = sKS;
        Nama = nama;
    }
    public String getKodeMK() {
        return kodeMK;
    }
    public int getSKS() {
        return SKS;
    }
    public String getNama() {
        return Nama;
    }
    @Override
    public String toString() {
        return "MataKuliah [kodeMK=" + kodeMK + ", SKS=" + SKS + ", Nama=" + Nama + "]";
    }

    
}
