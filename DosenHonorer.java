import java.util.List;

public class DosenHonorer extends Dosen {
    private double honorPerSKS;



    public DosenHonorer(String nama, String alamat, String ttl, String telepon, String nIK, String departemen,
            List<MataKuliah> mkDiajar, double honorPerSKS) {
        super(nama, alamat, ttl, telepon, nIK, departemen, mkDiajar);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() + " , Honor per SKS : " + honorPerSKS;
    }
    
}
