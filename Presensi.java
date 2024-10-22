import java.util.Date;

public class Presensi {
    private Date tanggal;
    private int status;

    public Presensi(Date tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public int isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Presensi [tanggal=" + tanggal + ", status=" + status + "]";
    }

}
