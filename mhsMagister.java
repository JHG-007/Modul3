import java.util.List;

public class mhsMagister extends Mahasiswa {
    private List<MataKuliah> mkDiambil;
    private String judulTesis;

    public mhsMagister(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan,
            List<MataKuliah> mkDiambil, String judulTesis) {
        super(nama, alamat, ttl, telepon, NIM, jurusan);
        this.mkDiambil = mkDiambil;
        this.judulTesis = judulTesis;
    }

    public List<MataKuliah> getmkDiambil() {
        return mkDiambil;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mata kuliah yang diambil : " + mkDiambil.toString() + ", Judul tesis : "
                + judulTesis;
    }
}