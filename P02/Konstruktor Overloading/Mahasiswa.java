public class Mahasiswa{
    // Membuat atribut
    String namaD,namaB,alamat;
    int nim,umur;
    // Membuat class contructor
    public Mahasiswa(String nmDepan, String nmBelakang, int nim){
        this.namaD=nmDepan;
        this.namaB=nmBelakang;
        this.nim=nim;
    }
    Mahasiswa(String almt, int umr){
        this.alamat=almt;
        this.umur=umr;
    }
    void Tampil(){
        System.out.println("Nama Lengkap: "+namaD+" "+namaB);
    }
}