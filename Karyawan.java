import java.util.List;

public class Karyawan extends Staff {
    private double gaji;
    private List<PresensiStaff> listPresensiStaff;

    public Karyawan(String nama, String alamat, String ttl, String telepon, String nIK, double gaji,
            List<PresensiStaff> listPresensiStaff) {
        super(nama, alamat, ttl, telepon, nIK);
        this.gaji = gaji;
        this.listPresensiStaff = listPresensiStaff;
    }

    public double getGaji() {
        return gaji;
    }

    public List<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    @Override
    public String toString() {
        return super.toString()  + "gaji : " + gaji + ", Presensi staff : " + listPresensiStaff;
    }

}
