import java.util.List;

public class DosenTetap extends Dosen {
    private double gaji;

    public DosenTetap(String nama, String alamat, String ttl, String telepon, String nIK, String departemen,
            List<MataKuliah> mkDiajar, double gaji) {
        super(nama, alamat, ttl, telepon, nIK, departemen, mkDiajar);
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return super.toString() + " , Gaji : " + gaji;
    }

}
