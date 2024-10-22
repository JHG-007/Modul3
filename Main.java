import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Data dummy MataKuliah
        MataKuliah mk1 = new MataKuliah("IF101", 3, "Algoritma");
        MataKuliah mk2 = new MataKuliah("IF202", 2, "Jaringan");
        MKPilihan mk3 = new MKPilihan("IF303", 3, "Kecerdasan Buatan", 10);
        MataKuliah mk4 = new MataKuliah("IF404", 4, "Pemrograman Web");
        MKPilihan mk5 = new MKPilihan("IF505", 2, "Kriptografi", 5);

        // Data dummy Mahasiswa Sarjana
        List<MataKuliah> mataKuliahSarjana1 = new ArrayList<>();
        mataKuliahSarjana1.add(mk1);
        mataKuliahSarjana1.add(mk2);

        List<MataKuliah> mataKuliahSarjana2 = new ArrayList<>();
        mataKuliahSarjana2.add(mk1);
        mataKuliahSarjana2.add(mk4);

        mhsSarjana sarjana1 = new mhsSarjana("Budi", "Jl. Anggrek", "2000-01-01", "08123456789", "123456", "Informatika", mataKuliahSarjana1);
        mhsSarjana sarjana2 = new mhsSarjana("Andi", "Jl. Melati", "2000-02-01", "08129876543", "123457", "Teknik Elektro", mataKuliahSarjana2);

        // Data dummy Mahasiswa Magister
        List<MataKuliah> mataKuliahMagister = new ArrayList<>();
        mataKuliahMagister.add(mk3);
        mataKuliahMagister.add(mk5);

        mhsMagister magister1 = new mhsMagister("Citra", "Jl. Mawar", "1998-03-15", "08567891234", "543210", "Informatika", mataKuliahMagister, "Pengembangan AI");

        // Data dummy Mahasiswa Doktor
        mhsDokter doktor1 = new mhsDokter("Dani", "Jl. Kenanga", "1995-04-10", "08765432109", "987654", "Ilmu Komputer", "Penelitian Blockchain", 85, 90, 88);

        // Data dummy Dosen Tetap
        List<MataKuliah> mataKuliahDiajar1 = new ArrayList<>();
        mataKuliahDiajar1.add(mk1);
        mataKuliahDiajar1.add(mk4);

        DosenTetap dosenTetap1 = new DosenTetap("Dr. Eko", "Jl. Sakura", "1980-05-20", "08123456000", "456789", "Informatika", mataKuliahDiajar1, 15000000);

        // Data dummy Dosen Honorer
        List<MataKuliah> mataKuliahDiajar2 = new ArrayList<>();
        mataKuliahDiajar2.add(mk5);

        DosenHonorer dosenHonorer1 = new DosenHonorer("Dr. Fina", "Jl. Cempaka", "1985-06-10", "08213456789", "456790", "Matematika", mataKuliahDiajar2, 300000);

        // Data dummy Karyawan
        List<PresensiStaff> presensiKaryawan = new ArrayList<>();
        presensiKaryawan.add(new PresensiStaff(null, 0, null));
        presensiKaryawan.add(new PresensiStaff(null, 0, null));

        Karyawan karyawan1 = new Karyawan("Susi", "Jl. Duren", "1990-07-05", "08991234567", "987321", 6000000, presensiKaryawan);

        // Print data dummy menggunakan toString()
        System.out.println(sarjana1.toString());
        System.out.println(sarjana2.toString());
        System.out.println(magister1.toString());
        System.out.println(doktor1.toString());
        System.out.println(dosenTetap1.toString());
        System.out.println(dosenHonorer1.toString());
        System.out.println(karyawan1.toString());
    }
}
