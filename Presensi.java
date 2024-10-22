public class Presensi {
    private String tanggal;
    private int status;
    public Presensi(String tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }
    public String getTanggal() {
        return tanggal;
    }
    public int isStatus() {
        return status;
    }
    @Override
    public String toString() {
        return "Presensi [tanggal=" + tanggal + ", status=" + (status == 1 ? "Hadir" : "Alpha");
    }

}
