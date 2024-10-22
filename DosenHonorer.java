public class DosenHonorer extends Staff {
    private double honorPerSKS;

    public DosenHonorer(String nama, String alamat, String ttl, String telepon, String nIK, double honorPerSKS) {
        super(nama, alamat, ttl, telepon, nIK);
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
