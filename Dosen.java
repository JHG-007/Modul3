import java.util.List;

public abstract class Dosen extends Staff {
    private String departemen;
    private List<MataKuliah> mkDiajar;

    public Dosen(String nama, String alamat, String ttl, String telepon, String nIK, String departemen,
            List<MataKuliah> mkDiajar) {
        super(nama, alamat, ttl, telepon, nIK);
        this.departemen = departemen;
        this.mkDiajar = mkDiajar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public List<MataKuliah> getMkDiajar() {
        return mkDiajar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departemen: " + departemen + ", Mata Kuliah Diajar: " + mkDiajar.toString();
    }
    
}
