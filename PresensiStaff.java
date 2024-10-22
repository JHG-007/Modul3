import java.util.Date;

public class PresensiStaff extends Presensi {
    private Date jam;

    public PresensiStaff(Date tanggal, int status, Date jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public Date getJam() {
        return jam;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jam : " + jam;
    }

}