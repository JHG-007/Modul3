import java.util.List;

public class mhsSarjana extends Mahasiswa {
    private List<MataKuliah> mkDiambil;


    public mhsSarjana(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan,
            List<MataKuliah> mkDiambil) {
        super(nama, alamat, ttl, telepon, NIM, jurusan);
        this.mkDiambil = mkDiambil;
    }

    public List<MataKuliah> getmkDiambil() {
        return mkDiambil;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mata kuliah yang diambil: " + mkDiambil.toString();
    }
}
