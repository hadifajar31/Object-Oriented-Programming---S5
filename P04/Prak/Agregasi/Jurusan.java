public class Jurusan{
    private String kodeJurusan, namaJurusan;
    private Mahasiswa[] daftar;
    private static int jumMhs = 0;

    public Jurusan (String kodeJurusan, String namaJurusan) {
    this.kodeJurusan = kodeJurusan;
    this.namaJurusan = namaJurusan;
    daftar = new Mahasiswa [20];
    }

    public void tambahMahasiswa(Mahasiswa M) {
    this.daftar[jumMhs] = M;
    this .jumMhs++;
    }

    public void cetakInfo() {
        System.out.println ("Kode Jurusan : " + this. kodeJurusan) ;
        System.out.println ("Nama Jurusan " + this.namaJurusan) ;
        System.out.println ("Daftar Mahasiswa ");

        for (int i=0; i<jumMhs; i++){
            System.out.println((i+1)+". ");
            System.out.println (daftar[i] .getNim() + " - " + daftar[i] .getNama());
            // System.out.println (daftar[i] .getNama());
        }
    }
}