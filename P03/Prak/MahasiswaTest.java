class Mahasiswa{
    // deklarasi private atribut
    private String nama;
    private String nim;
    private String alamat;

    public Mahasiswa(){

    }

    // Constructor dengan 2 input parameter
    public Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    // Constructor dengan 3 input parameter
    public Mahasiswa(String nama, String nim, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.alamat=alamat;
    }

    // Mengakses atribut alamat
    public String getAlamat(){
        return alamat;
    }

    //mengakses atribut nama
    public String getNama(){
    return nama;
    }

    //mengakses atribut nim
    public String getNim() {
    return nim;
    }

    //mengisi atribut alamat
    public void setAlamat (String alamat){
    this.alamat = alamat;
    }
}


public class MahasiswaTest{
public static void main (String[] args){
    Mahasiswa objMhs;
    String localNama, localNim;
    objMhs = new Mahasiswa ("Budi","12345");
    objMhs.setAlamat ("Jln Pesantren Cimahi");
    localNama = objMhs.getNama();
    localNim = objMhs.getNim() ;
    System.out.println("NIM : "+ localNim) ;
    System.out.println("Nama : "+ localNama) ;
    System.out.println("Alamat : "+ objMhs.getAlamat());
    }
}